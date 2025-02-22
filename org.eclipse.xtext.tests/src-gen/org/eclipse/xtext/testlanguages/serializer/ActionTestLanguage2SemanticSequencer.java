/*
 * generated by Xtext
 */
package org.eclipse.xtext.testlanguages.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.eclipse.xtext.testlanguages.actionLang2.ActionLang2Package;
import org.eclipse.xtext.testlanguages.actionLang2.ORing;
import org.eclipse.xtext.testlanguages.actionLang2.Value;
import org.eclipse.xtext.testlanguages.services.ActionTestLanguage2GrammarAccess;

@SuppressWarnings("all")
public class ActionTestLanguage2SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ActionTestLanguage2GrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ActionLang2Package.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ActionLang2Package.ORING:
				sequence_ORing(context, (ORing) semanticObject); 
				return; 
			case ActionLang2Package.VALUE:
				sequence_Value(context, (Value) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     ORing returns ORing
	 *     ORing.ORing_1_0 returns ORing
	 *
	 * Constraint:
	 *     (disjuncts+=ORing_ORing_1_0 disjuncts+=Value)
	 * </pre>
	 */
	protected void sequence_ORing(ISerializationContext context, ORing semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ORing returns Value
	 *     ORing.ORing_1_0 returns Value
	 *     Value returns Value
	 *
	 * Constraint:
	 *     value='a'
	 * </pre>
	 */
	protected void sequence_Value(ISerializationContext context, Value semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ActionLang2Package.Literals.VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ActionLang2Package.Literals.VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getValueAccess().getValueAKeyword_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
}
