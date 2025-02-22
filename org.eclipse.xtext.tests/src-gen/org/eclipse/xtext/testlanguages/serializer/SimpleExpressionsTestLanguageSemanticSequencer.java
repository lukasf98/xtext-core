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
import org.eclipse.xtext.testlanguages.services.SimpleExpressionsTestLanguageGrammarAccess;
import org.eclipse.xtext.testlanguages.simpleExpressions.Atom;
import org.eclipse.xtext.testlanguages.simpleExpressions.Op;
import org.eclipse.xtext.testlanguages.simpleExpressions.Sequence;
import org.eclipse.xtext.testlanguages.simpleExpressions.SimpleExpressionsPackage;

@SuppressWarnings("all")
public class SimpleExpressionsTestLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SimpleExpressionsTestLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SimpleExpressionsPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SimpleExpressionsPackage.ATOM:
				sequence_Atom(context, (Atom) semanticObject); 
				return; 
			case SimpleExpressionsPackage.OP:
				sequence_Addition_Multiplication(context, (Op) semanticObject); 
				return; 
			case SimpleExpressionsPackage.SEQUENCE:
				sequence_Sequence(context, (Sequence) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Sequence returns Op
	 *     Sequence.Sequence_1_0 returns Op
	 *     Addition returns Op
	 *     Addition.Op_1_0 returns Op
	 *     Multiplication returns Op
	 *     Multiplication.Op_1_0 returns Op
	 *     Term returns Op
	 *     Parens returns Op
	 *
	 * Constraint:
	 *     (
	 *         (values+=Addition_Op_1_0 (operator='+' | operator='-') values+=Multiplication) | 
	 *         (values+=Multiplication_Op_1_0 (operator='*' | operator='/') values+=Term)
	 *     )
	 * </pre>
	 */
	protected void sequence_Addition_Multiplication(ISerializationContext context, Op semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Sequence returns Atom
	 *     Sequence.Sequence_1_0 returns Atom
	 *     Addition returns Atom
	 *     Addition.Op_1_0 returns Atom
	 *     Multiplication returns Atom
	 *     Multiplication.Op_1_0 returns Atom
	 *     Term returns Atom
	 *     Atom returns Atom
	 *     Parens returns Atom
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_Atom(ISerializationContext context, Atom semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimpleExpressionsPackage.Literals.ATOM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimpleExpressionsPackage.Literals.ATOM__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Sequence returns Sequence
	 *     Sequence.Sequence_1_0 returns Sequence
	 *
	 * Constraint:
	 *     (expressions+=Sequence_Sequence_1_0 expressions+=Addition)
	 * </pre>
	 */
	protected void sequence_Sequence(ISerializationContext context, Sequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
