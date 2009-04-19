/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xtext;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.AbstractMetamodelDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.TypeRef;
import org.eclipse.xtext.XtextPackage;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.crossref.IScope;
import org.eclipse.xtext.crossref.IScopedElement;
import org.eclipse.xtext.crossref.impl.DefaultScopeProvider;
import org.eclipse.xtext.crossref.impl.ScopedElement;
import org.eclipse.xtext.crossref.impl.ScopedElements;
import org.eclipse.xtext.crossref.impl.SimpleAttributeResolver;
import org.eclipse.xtext.crossref.impl.SimpleScope;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class XtextScopeProvider extends DefaultScopeProvider {

	@Inject
	private IValueConverterService valueConverterService;

	@Override
	public IScope getScope(EObject rootModel, EObject context, EReference reference) {
		if (reference == XtextPackage.eINSTANCE.getTypeRef_Classifier()) {
			if (context instanceof TypeRef) {
				final TypeRef typeRef = (TypeRef) context;
				final AbstractMetamodelDeclaration metaModel = typeRef.getMetamodel();
				if (metaModel != null) {
					EPackage pack = metaModel.getEPackage();
					if (pack != null)
						return createClassifierScope(pack.getEClassifiers());
				} else {
					return createReferencedPackagesScope((Grammar) rootModel);
				}
			} else {
				return createReferencedPackagesScope((Grammar) rootModel);
			}
			return IScope.NULLSCOPE;
		}
		if (reference == XtextPackage.eINSTANCE.getEnumLiteralDeclaration_EnumLiteral()) {
			final EnumRule rule = GrammarUtil.containingEnumRule(context);
			if (rule.getType() != null && rule.getType().getClassifier() != null && rule.getType().getClassifier() instanceof EEnum) {
				return createEnumLiteralsScope((EEnum) rule.getType().getClassifier());
			}
			return IScope.NULLSCOPE;
			
		}
		return super.getScope(rootModel, context, reference);
	}

	private IScope createEnumLiteralsScope(EEnum eEnum) {
		return new SimpleScope(IScope.NULLSCOPE,
				Iterables.transform(eEnum.getELiterals(), new Function<EEnumLiteral, IScopedElement>() {
					public IScopedElement apply(EEnumLiteral param) {
						return ScopedElement.create(param.getName(), param);
					}
				}));
	}

	private SimpleScope createClassifierScope(Iterable<EClassifier> classifiers) {
		return new SimpleScope(IScope.NULLSCOPE,
				Iterables.transform(classifiers, new Function<EClassifier, IScopedElement>() {
					public IScopedElement apply(EClassifier param) {
						return ScopedElement.create(param.getName(), param);
					}
				}));
	}

	protected IScope createReferencedPackagesScope(Grammar g) {
		final Collection<EClassifier> allClassifiers = new ArrayList<EClassifier>();
		for(AbstractMetamodelDeclaration decl: g.getMetamodelDeclarations()) {
			if (decl.getEPackage() != null)
				allClassifiers.addAll(decl.getEPackage().getEClassifiers());
		}
		return createClassifierScope(allClassifiers);
	}

	@Override
	protected IScope createScope(EObject rootModel, Resource resource, EClass type) {
		if (resource.getContents().size() < 1)
			throw new IllegalArgumentException("resource is not as expected: contents.size == "
					+ resource.getContents().size() + " but expected: >= 1");
		if (!(rootModel instanceof Grammar))
			throw new IllegalArgumentException("Expected: rootModel instanceof Grammar, but was: " + rootModel);
		return createScope((Grammar) rootModel, type);
	}

	protected IScope createScope(final Grammar grammar, EClass type) {
		if (EcorePackage.Literals.EPACKAGE == type) {
			return createEPackageScope(grammar);
		} else if (AbstractMetamodelDeclaration.class.isAssignableFrom(type.getInstanceClass())) {
			return new SimpleScope(IScope.NULLSCOPE, Iterables.transform(grammar.getMetamodelDeclarations(),
					new Function<AbstractMetamodelDeclaration,IScopedElement>(){
						public IScopedElement apply(AbstractMetamodelDeclaration from) {
							return ScopedElement.create(from.getAlias(), from);
						}
					}));
		}
		final List<Grammar> allGrammars = getAllGrammars(grammar);
		IScope current = IScope.NULLSCOPE;
		for (int i = allGrammars.size() - 1; i >= 0; i--) {
			current = createScope(allGrammars.get(i), type, current);
		}
		return current;
	}

	protected IScope createScope(final Grammar grammar, EClass type, IScope parent) {
		return new SimpleScope(parent, ScopedElements.allInResource(grammar.eResource(), type, SimpleAttributeResolver.NAME_RESOLVER));
	}

	private List<Grammar> getAllGrammars(Grammar grammar) {
		Collection<Grammar> visitedGrammars = new LinkedHashSet<Grammar>();
		collectAllUsedGrammars(grammar, visitedGrammars);
		return new ArrayList<Grammar>(visitedGrammars);
	}

	private void collectAllUsedGrammars(Grammar grammar, Collection<Grammar> visited) {
		if (!visited.add(grammar))
			return;
		for(Grammar usedGrammar: grammar.getUsedGrammars()) {
			collectAllUsedGrammars(usedGrammar, visited);
		}
	}

	private IScope createEPackageScope(final Grammar grammar, IScope parent) {
		return new SimpleScope(parent, Iterables.transform(grammar.getMetamodelDeclarations(),
				new Function<AbstractMetamodelDeclaration,IScopedElement>(){
			public IScopedElement apply(AbstractMetamodelDeclaration from) {
				return ScopedElement.create(from.getEPackage().getNsURI(), from.getEPackage());
			}
		}));
	}

	private IScope createEPackageScope(final Grammar grammar) {
		final List<Grammar> allGrammars = getAllGrammars(grammar);
		IScope current = new StringScope(EPackage.Registry.INSTANCE.keySet(), valueConverterService);
		for (int i = allGrammars.size() - 1; i >= 0; i--) {
			current = createEPackageScope(allGrammars.get(i), current);
		}
		return current;
	}

}
