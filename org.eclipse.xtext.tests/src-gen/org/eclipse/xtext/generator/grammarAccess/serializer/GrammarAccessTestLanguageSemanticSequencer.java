/*
 * generated by Xtext
 */
package org.eclipse.xtext.generator.grammarAccess.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.generator.grammarAccess.ametamodel.asubpackage.AModel;
import org.eclipse.xtext.generator.grammarAccess.ametamodel.asubpackage.AType;
import org.eclipse.xtext.generator.grammarAccess.ametamodel.asubpackage.AsubpackagePackage;
import org.eclipse.xtext.generator.grammarAccess.ametamodel.asubpackage.emptyPackage.subsubpackage.AnotherType;
import org.eclipse.xtext.generator.grammarAccess.ametamodel.asubpackage.emptyPackage.subsubpackage.SubsubpackagePackage;
import org.eclipse.xtext.generator.grammarAccess.services.GrammarAccessTestLanguageGrammarAccess;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class GrammarAccessTestLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GrammarAccessTestLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == AsubpackagePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case AsubpackagePackage.AMODEL:
				sequence_Root(context, (AModel) semanticObject); 
				return; 
			case AsubpackagePackage.ATYPE:
				sequence_AType(context, (AType) semanticObject); 
				return; 
			}
		else if (epackage == SubsubpackagePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SubsubpackagePackage.ANOTHER_TYPE:
				sequence_AnotherType(context, (AnotherType) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Type returns AType
	 *     AType returns AType
	 *
	 * Constraint:
	 *     {AType}
	 * </pre>
	 */
	protected void sequence_AType(ISerializationContext context, AType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Type returns AnotherType
	 *     AnotherType returns AnotherType
	 *
	 * Constraint:
	 *     {AnotherType}
	 * </pre>
	 */
	protected void sequence_AnotherType(ISerializationContext context, AnotherType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Root returns AModel
	 *
	 * Constraint:
	 *     elements+=Type+
	 * </pre>
	 */
	protected void sequence_Root(ISerializationContext context, AModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
