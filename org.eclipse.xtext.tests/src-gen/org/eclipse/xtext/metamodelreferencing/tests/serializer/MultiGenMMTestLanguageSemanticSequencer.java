/*
 * generated by Xtext
 */
package org.eclipse.xtext.metamodelreferencing.tests.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.metamodelreferencing.tests.otherTest.FooBar;
import org.eclipse.xtext.metamodelreferencing.tests.otherTest.OtherTestPackage;
import org.eclipse.xtext.metamodelreferencing.tests.services.MultiGenMMTestLanguageGrammarAccess;
import org.eclipse.xtext.metamodelreferencing.tests.simpleTest.Foo;
import org.eclipse.xtext.metamodelreferencing.tests.simpleTest.SimpleTestPackage;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class MultiGenMMTestLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MultiGenMMTestLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == OtherTestPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case OtherTestPackage.FOO_BAR:
				sequence_NameRef(context, (FooBar) semanticObject); 
				return; 
			}
		else if (epackage == SimpleTestPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SimpleTestPackage.FOO:
				sequence_Foo(context, (Foo) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Foo returns Foo
	 *
	 * Constraint:
	 *     (name=ID nameRefs+=NameRef*)
	 * </pre>
	 */
	protected void sequence_Foo(ISerializationContext context, Foo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NameRef returns FooBar
	 *
	 * Constraint:
	 *     name=STRING
	 * </pre>
	 */
	protected void sequence_NameRef(ISerializationContext context, FooBar semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OtherTestPackage.Literals.FOO_BAR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OtherTestPackage.Literals.FOO_BAR__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNameRefAccess().getNameSTRINGTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
