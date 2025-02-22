/*
 * generated by Xtext
 */
package org.eclipse.xtext.parser.fragments.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.parser.fragments.fragmentTestLanguage.FragmentTestLanguagePackage;
import org.eclipse.xtext.parser.fragments.fragmentTestLanguage.PRFNamed;
import org.eclipse.xtext.parser.fragments.fragmentTestLanguage.PRFNamedWithAction;
import org.eclipse.xtext.parser.fragments.fragmentTestLanguage.ParserRuleFragments;
import org.eclipse.xtext.parser.fragments.services.FragmentTestLanguageGrammarAccess;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractFragmentTestLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FragmentTestLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == FragmentTestLanguagePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case FragmentTestLanguagePackage.PRF_NAMED:
				if (rule == grammarAccess.getNamedByActionRule()) {
					sequence_NamedByAction(context, (PRFNamed) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getNamedInParenthesesRule()) {
					sequence_NamedInParentheses(context, (PRFNamed) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPRFNamedRefFirstRule()) {
					sequence_PRFNamedFragment_PRFNamedRefFirst(context, (PRFNamed) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPRFWithPredicateRule()) {
					sequence_PRFNamedFragment_PRFNamedRef(context, (PRFNamed) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPRFNamedWithFQNRule()) {
					sequence_PRFNamedWithFQN(context, (PRFNamed) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPRFNamedRule()
						|| action == grammarAccess.getPRFNamedWithActionAccess().getPRFNamedWithActionPrevAction_1()) {
					sequence_PRFNamed_PRFNamedFragment_PRFNamedRef(context, (PRFNamed) semanticObject); 
					return; 
				}
				else break;
			case FragmentTestLanguagePackage.PRF_NAMED_WITH_ACTION:
				if (rule == grammarAccess.getPRFNamedRecursiveFragmentRule()) {
					sequence_PRFNamedRecursiveFragment_RecursiveFragment(context, (PRFNamedWithAction) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPRFNamedRecursiveRule()) {
					sequence_PRFNamedRecursive_RecursiveFromFragment(context, (PRFNamedWithAction) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPRFNamedWithActionRule()) {
					sequence_PRFNamedWithAction(context, (PRFNamedWithAction) semanticObject); 
					return; 
				}
				else break;
			case FragmentTestLanguagePackage.PARSER_RULE_FRAGMENTS:
				sequence_ParserRuleFragments(context, (ParserRuleFragments) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     NamedByAction returns PRFNamed
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_NamedByAction(ISerializationContext context, PRFNamed semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FragmentTestLanguagePackage.Literals.PRF_NAMED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FragmentTestLanguagePackage.Literals.PRF_NAMED__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNamedByActionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NamedInParentheses returns PRFNamed
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_NamedInParentheses(ISerializationContext context, PRFNamed semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FragmentTestLanguagePackage.Literals.PRF_NAMED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FragmentTestLanguagePackage.Literals.PRF_NAMED__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNamedInParenthesesAccess().getNameIDTerminalRuleCall_1_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PRFNamedRefFirst returns PRFNamed
	 *
	 * Constraint:
	 *     (ref=[PRFNamed|ID] name=ID)
	 * </pre>
	 */
	protected void sequence_PRFNamedFragment_PRFNamedRefFirst(ISerializationContext context, PRFNamed semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FragmentTestLanguagePackage.Literals.PRF_NAMED__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FragmentTestLanguagePackage.Literals.PRF_NAMED__REF));
			if (transientValues.isValueTransient(semanticObject, FragmentTestLanguagePackage.Literals.PRF_NAMED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FragmentTestLanguagePackage.Literals.PRF_NAMED__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPRFNamedRefFirstAccess().getRefPRFNamedIDTerminalRuleCall_0_0_1(), semanticObject.eGet(FragmentTestLanguagePackage.Literals.PRF_NAMED__REF, false));
		feeder.accept(grammarAccess.getPRFNamedFragmentAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PRFWithPredicate returns PRFNamed
	 *
	 * Constraint:
	 *     (name=ID ref=[PRFNamed|ID]?)
	 * </pre>
	 */
	protected void sequence_PRFNamedFragment_PRFNamedRef(ISerializationContext context, PRFNamed semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PRFNamedRecursiveFragment returns PRFNamedWithAction
	 *
	 * Constraint:
	 *     (name=ID prev=NamedByAction)
	 * </pre>
	 */
	protected void sequence_PRFNamedRecursiveFragment_RecursiveFragment(ISerializationContext context, PRFNamedWithAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FragmentTestLanguagePackage.Literals.PRF_NAMED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FragmentTestLanguagePackage.Literals.PRF_NAMED__NAME));
			if (transientValues.isValueTransient(semanticObject, FragmentTestLanguagePackage.Literals.PRF_NAMED_WITH_ACTION__PREV) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FragmentTestLanguagePackage.Literals.PRF_NAMED_WITH_ACTION__PREV));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPRFNamedRecursiveFragmentAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRecursiveFragmentAccess().getPrevNamedByActionParserRuleCall_1_0(), semanticObject.getPrev());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PRFNamedRecursive returns PRFNamedWithAction
	 *
	 * Constraint:
	 *     (name=ID prev=NamedInParentheses)
	 * </pre>
	 */
	protected void sequence_PRFNamedRecursive_RecursiveFromFragment(ISerializationContext context, PRFNamedWithAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FragmentTestLanguagePackage.Literals.PRF_NAMED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FragmentTestLanguagePackage.Literals.PRF_NAMED__NAME));
			if (transientValues.isValueTransient(semanticObject, FragmentTestLanguagePackage.Literals.PRF_NAMED_WITH_ACTION__PREV) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FragmentTestLanguagePackage.Literals.PRF_NAMED_WITH_ACTION__PREV));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPRFNamedRecursiveAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRecursiveFromFragmentAccess().getPrevNamedInParenthesesParserRuleCall_0(), semanticObject.getPrev());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PRFNamedWithAction returns PRFNamedWithAction
	 *
	 * Constraint:
	 *     (prev=PRFNamedWithAction_PRFNamedWithAction_1 name=ID (ref=[PRFNamed|ID] ref2=[PRFNamed|ID])?)
	 * </pre>
	 */
	protected void sequence_PRFNamedWithAction(ISerializationContext context, PRFNamedWithAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PRFNamedWithFQN returns PRFNamed
	 *
	 * Constraint:
	 *     (name=FQN ref=[PRFNamed|FQN2]?)
	 * </pre>
	 */
	protected void sequence_PRFNamedWithFQN(ISerializationContext context, PRFNamed semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PRFNamed returns PRFNamed
	 *     PRFNamedWithAction.PRFNamedWithAction_1 returns PRFNamed
	 *
	 * Constraint:
	 *     (name=ID (ref=[PRFNamed|ID] | ref=[PRFNamed|ID])?)
	 * </pre>
	 */
	protected void sequence_PRFNamed_PRFNamedFragment_PRFNamedRef(ISerializationContext context, PRFNamed semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ParserRuleFragments returns ParserRuleFragments
	 *
	 * Constraint:
	 *     (
	 *         element=PRFNamed | 
	 *         (element=PRFNamed ref=[PRFNamed|ID]) | 
	 *         element=PRFNamedRefFirst | 
	 *         element=PRFNamedWithAction | 
	 *         element=PRFNamedWithFQN | 
	 *         element=PRFWithPredicate | 
	 *         element=PRFNamedRecursive | 
	 *         element=PRFNamedRecursiveFragment
	 *     )
	 * </pre>
	 */
	protected void sequence_ParserRuleFragments(ISerializationContext context, ParserRuleFragments semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
