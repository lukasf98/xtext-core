/*
 * generated by Xtext
 */
package org.eclipse.xtext.serializer.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.contextFinderTest.AttributeExclusionTest;
import org.eclipse.xtext.serializer.contextFinderTest.ContextFinderTestPackage;
import org.eclipse.xtext.serializer.contextFinderTest.Model;
import org.eclipse.xtext.serializer.contextFinderTest.NestedTypeChild1;
import org.eclipse.xtext.serializer.contextFinderTest.NestedTypeChild2;
import org.eclipse.xtext.serializer.contextFinderTest.NestedTypeRecursiveTest;
import org.eclipse.xtext.serializer.contextFinderTest.NestedTypeRecursiveTest1;
import org.eclipse.xtext.serializer.contextFinderTest.NestedTypeRecursiveTest2;
import org.eclipse.xtext.serializer.contextFinderTest.NestedTypeTest;
import org.eclipse.xtext.serializer.contextFinderTest.NodeExclusion;
import org.eclipse.xtext.serializer.contextFinderTest.NodeExclusionList;
import org.eclipse.xtext.serializer.contextFinderTest.ParentRefTest1;
import org.eclipse.xtext.serializer.contextFinderTest.ParentRefTest2;
import org.eclipse.xtext.serializer.contextFinderTest.ParentRefTestChild;
import org.eclipse.xtext.serializer.contextFinderTest.QuantityExclusionTest;
import org.eclipse.xtext.serializer.contextFinderTest.ValueExclusionTest;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.eclipse.xtext.serializer.services.ContextFinderTestLanguageGrammarAccess;

@SuppressWarnings("all")
public class ContextFinderTestLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ContextFinderTestLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ContextFinderTestPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ContextFinderTestPackage.ATTRIBUTE_EXCLUSION_TEST:
				if (rule == grammarAccess.getAttributeExclusionTest1Rule()) {
					sequence_AttributeExclusionTest1(context, (AttributeExclusionTest) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getAttributeExclusionTest2Rule()) {
					sequence_AttributeExclusionTest2(context, (AttributeExclusionTest) semanticObject); 
					return; 
				}
				else break;
			case ContextFinderTestPackage.MODEL:
				if (rule == grammarAccess.getModel2Rule()) {
					sequence_Model2(context, (Model) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case ContextFinderTestPackage.NESTED_TYPE_CHILD1:
				sequence_NestedTypeChild1(context, (NestedTypeChild1) semanticObject); 
				return; 
			case ContextFinderTestPackage.NESTED_TYPE_CHILD2:
				sequence_NestedTypeChild2(context, (NestedTypeChild2) semanticObject); 
				return; 
			case ContextFinderTestPackage.NESTED_TYPE_RECURSIVE_TEST:
				if (rule == grammarAccess.getNestedTypeRecursiveTest1Rule()
						|| action == grammarAccess.getNestedTypeRecursiveTest1Access().getNestedTypeRecursiveTestLeftAction_2_0()) {
					sequence_NestedTypeRecursiveTest1(context, (NestedTypeRecursiveTest) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getNestedTypeRecursiveTest2Rule()
						|| action == grammarAccess.getNestedTypeRecursiveTest2Access().getNestedTypeRecursiveTestLeftAction_2_0()) {
					sequence_NestedTypeRecursiveTest2(context, (NestedTypeRecursiveTest) semanticObject); 
					return; 
				}
				else break;
			case ContextFinderTestPackage.NESTED_TYPE_RECURSIVE_TEST1:
				sequence_NestedTypeRecursiveTest1_NestedTypeRecursiveTest_2_0(context, (NestedTypeRecursiveTest1) semanticObject); 
				return; 
			case ContextFinderTestPackage.NESTED_TYPE_RECURSIVE_TEST2:
				sequence_NestedTypeRecursiveTest2_NestedTypeRecursiveTest_2_0(context, (NestedTypeRecursiveTest2) semanticObject); 
				return; 
			case ContextFinderTestPackage.NESTED_TYPE_TEST:
				if (rule == grammarAccess.getNestedTypeTest1Rule()) {
					sequence_NestedTypeTest1(context, (NestedTypeTest) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getNestedTypeTest2Rule()) {
					sequence_NestedTypeTest2(context, (NestedTypeTest) semanticObject); 
					return; 
				}
				else break;
			case ContextFinderTestPackage.NODE_EXCLUSION:
				if (rule == grammarAccess.getNodeExclusion1Rule()) {
					sequence_NodeExclusion1(context, (NodeExclusion) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getNodeExclusion2Rule()) {
					sequence_NodeExclusion2(context, (NodeExclusion) semanticObject); 
					return; 
				}
				else break;
			case ContextFinderTestPackage.NODE_EXCLUSION_LIST:
				if (rule == grammarAccess.getNodeExclusion1ListRule()) {
					sequence_NodeExclusion1List(context, (NodeExclusionList) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getNodeExclusion2ListRule()) {
					sequence_NodeExclusion2List(context, (NodeExclusionList) semanticObject); 
					return; 
				}
				else break;
			case ContextFinderTestPackage.PARENT_REF_TEST1:
				sequence_ParentRefTest1(context, (ParentRefTest1) semanticObject); 
				return; 
			case ContextFinderTestPackage.PARENT_REF_TEST2:
				sequence_ParentRefTest2(context, (ParentRefTest2) semanticObject); 
				return; 
			case ContextFinderTestPackage.PARENT_REF_TEST_CHILD:
				if (rule == grammarAccess.getParentRefTestChild1Rule()) {
					sequence_ParentRefTestChild1(context, (ParentRefTestChild) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getParentRefTestChild2Rule()) {
					sequence_ParentRefTestChild2(context, (ParentRefTestChild) semanticObject); 
					return; 
				}
				else break;
			case ContextFinderTestPackage.QUANTITY_EXCLUSION_TEST:
				if (rule == grammarAccess.getQuantityExclusionTest1Rule()) {
					sequence_QuantityExclusionTest1(context, (QuantityExclusionTest) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getQuantityExclusionTest2Rule()) {
					sequence_QuantityExclusionTest2(context, (QuantityExclusionTest) semanticObject); 
					return; 
				}
				else break;
			case ContextFinderTestPackage.VALUE_EXCLUSION_TEST:
				if (rule == grammarAccess.getValueExclusionTest1Rule()) {
					sequence_ValueExclusionTest1(context, (ValueExclusionTest) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getValueExclusionTest2Rule()) {
					sequence_ValueExclusionTest2(context, (ValueExclusionTest) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     AttributeExclusionTest1 returns AttributeExclusionTest
	 *
	 * Constraint:
	 *     attr1=ID
	 * </pre>
	 */
	protected void sequence_AttributeExclusionTest1(ISerializationContext context, AttributeExclusionTest semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ContextFinderTestPackage.Literals.ATTRIBUTE_EXCLUSION_TEST__ATTR1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ContextFinderTestPackage.Literals.ATTRIBUTE_EXCLUSION_TEST__ATTR1));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeExclusionTest1Access().getAttr1IDTerminalRuleCall_1_0(), semanticObject.getAttr1());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AttributeExclusionTest2 returns AttributeExclusionTest
	 *
	 * Constraint:
	 *     attr2=ID
	 * </pre>
	 */
	protected void sequence_AttributeExclusionTest2(ISerializationContext context, AttributeExclusionTest semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ContextFinderTestPackage.Literals.ATTRIBUTE_EXCLUSION_TEST__ATTR2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ContextFinderTestPackage.Literals.ATTRIBUTE_EXCLUSION_TEST__ATTR2));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeExclusionTest2Access().getAttr2IDTerminalRuleCall_1_0(), semanticObject.getAttr2());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model2 returns Model
	 *
	 * Constraint:
	 *     {Model}
	 * </pre>
	 */
	protected void sequence_Model2(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (
	 *         model=Model2 | 
	 *         attributeExclusion=AttributeExclusionTest1 | 
	 *         attributeExclusion=AttributeExclusionTest2 | 
	 *         nestedType=NestedTypeTest1 | 
	 *         nestedType=NestedTypeTest2 | 
	 *         nestedTypeRecursiveTest2=NestedTypeRecursiveTest1 | 
	 *         nestedTypeRecursiveTest2=NestedTypeRecursiveTest2 | 
	 *         parentRef=ParentRefTest1 | 
	 *         parentRef=ParentRefTest2 | 
	 *         quantityExclusion=QuantityExclusionTest1 | 
	 *         quantityExclusion=QuantityExclusionTest2 | 
	 *         valueExclusion=ValueExclusionTest1 | 
	 *         valueExclusion=ValueExclusionTest2 | 
	 *         (name=STRING (nodeExclusion=NodeExclusion1 | nodeExclusion=NodeExclusion2)) | 
	 *         (name=STRING (nodeExclusionList=NodeExclusion1List | nodeExclusionList=NodeExclusion2List))
	 *     )
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NestedTypeChild returns NestedTypeChild1
	 *     NestedTypeChild1 returns NestedTypeChild1
	 *
	 * Constraint:
	 *     val=ID
	 * </pre>
	 */
	protected void sequence_NestedTypeChild1(ISerializationContext context, NestedTypeChild1 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ContextFinderTestPackage.Literals.NESTED_TYPE_CHILD__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ContextFinderTestPackage.Literals.NESTED_TYPE_CHILD__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNestedTypeChild1Access().getValIDTerminalRuleCall_1_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NestedTypeChild returns NestedTypeChild2
	 *     NestedTypeChild2 returns NestedTypeChild2
	 *
	 * Constraint:
	 *     val=ID
	 * </pre>
	 */
	protected void sequence_NestedTypeChild2(ISerializationContext context, NestedTypeChild2 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ContextFinderTestPackage.Literals.NESTED_TYPE_CHILD__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ContextFinderTestPackage.Literals.NESTED_TYPE_CHILD__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNestedTypeChild2Access().getValIDTerminalRuleCall_1_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NestedTypeRecursiveTest1 returns NestedTypeRecursiveTest
	 *     NestedTypeRecursiveTest1.NestedTypeRecursiveTest_2_0 returns NestedTypeRecursiveTest
	 *
	 * Constraint:
	 *     left=NestedTypeRecursiveTest1_NestedTypeRecursiveTest_2_0
	 * </pre>
	 */
	protected void sequence_NestedTypeRecursiveTest1(ISerializationContext context, NestedTypeRecursiveTest semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ContextFinderTestPackage.Literals.NESTED_TYPE_RECURSIVE_TEST__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ContextFinderTestPackage.Literals.NESTED_TYPE_RECURSIVE_TEST__LEFT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNestedTypeRecursiveTest1Access().getNestedTypeRecursiveTestLeftAction_2_0(), semanticObject.getLeft());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NestedTypeRecursiveTest1.NestedTypeRecursiveTest_2_0 returns NestedTypeRecursiveTest1
	 *
	 * Constraint:
	 *     {NestedTypeRecursiveTest1}
	 * </pre>
	 */
	protected void sequence_NestedTypeRecursiveTest1_NestedTypeRecursiveTest_2_0(ISerializationContext context, NestedTypeRecursiveTest1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NestedTypeRecursiveTest2 returns NestedTypeRecursiveTest
	 *     NestedTypeRecursiveTest2.NestedTypeRecursiveTest_2_0 returns NestedTypeRecursiveTest
	 *
	 * Constraint:
	 *     left=NestedTypeRecursiveTest2_NestedTypeRecursiveTest_2_0
	 * </pre>
	 */
	protected void sequence_NestedTypeRecursiveTest2(ISerializationContext context, NestedTypeRecursiveTest semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ContextFinderTestPackage.Literals.NESTED_TYPE_RECURSIVE_TEST__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ContextFinderTestPackage.Literals.NESTED_TYPE_RECURSIVE_TEST__LEFT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNestedTypeRecursiveTest2Access().getNestedTypeRecursiveTestLeftAction_2_0(), semanticObject.getLeft());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NestedTypeRecursiveTest2.NestedTypeRecursiveTest_2_0 returns NestedTypeRecursiveTest2
	 *
	 * Constraint:
	 *     {NestedTypeRecursiveTest2}
	 * </pre>
	 */
	protected void sequence_NestedTypeRecursiveTest2_NestedTypeRecursiveTest_2_0(ISerializationContext context, NestedTypeRecursiveTest2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NestedTypeTest1 returns NestedTypeTest
	 *
	 * Constraint:
	 *     nested=NestedTypeChild1
	 * </pre>
	 */
	protected void sequence_NestedTypeTest1(ISerializationContext context, NestedTypeTest semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ContextFinderTestPackage.Literals.NESTED_TYPE_TEST__NESTED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ContextFinderTestPackage.Literals.NESTED_TYPE_TEST__NESTED));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNestedTypeTest1Access().getNestedNestedTypeChild1ParserRuleCall_0(), semanticObject.getNested());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NestedTypeTest2 returns NestedTypeTest
	 *
	 * Constraint:
	 *     nested=NestedTypeChild2
	 * </pre>
	 */
	protected void sequence_NestedTypeTest2(ISerializationContext context, NestedTypeTest semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ContextFinderTestPackage.Literals.NESTED_TYPE_TEST__NESTED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ContextFinderTestPackage.Literals.NESTED_TYPE_TEST__NESTED));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNestedTypeTest2Access().getNestedNestedTypeChild2ParserRuleCall_0(), semanticObject.getNested());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NodeExclusion1List returns NodeExclusionList
	 *
	 * Constraint:
	 *     ref+=[Model|ID]+
	 * </pre>
	 */
	protected void sequence_NodeExclusion1List(ISerializationContext context, NodeExclusionList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NodeExclusion1 returns NodeExclusion
	 *
	 * Constraint:
	 *     ref=[Model|ID]
	 * </pre>
	 */
	protected void sequence_NodeExclusion1(ISerializationContext context, NodeExclusion semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ContextFinderTestPackage.Literals.NODE_EXCLUSION__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ContextFinderTestPackage.Literals.NODE_EXCLUSION__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNodeExclusion1Access().getRefModelIDTerminalRuleCall_0_1(), semanticObject.eGet(ContextFinderTestPackage.Literals.NODE_EXCLUSION__REF, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NodeExclusion2List returns NodeExclusionList
	 *
	 * Constraint:
	 *     ref+=[Model|STRING]+
	 * </pre>
	 */
	protected void sequence_NodeExclusion2List(ISerializationContext context, NodeExclusionList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NodeExclusion2 returns NodeExclusion
	 *
	 * Constraint:
	 *     ref=[Model|STRING]
	 * </pre>
	 */
	protected void sequence_NodeExclusion2(ISerializationContext context, NodeExclusion semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ContextFinderTestPackage.Literals.NODE_EXCLUSION__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ContextFinderTestPackage.Literals.NODE_EXCLUSION__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNodeExclusion2Access().getRefModelSTRINGTerminalRuleCall_0_1(), semanticObject.eGet(ContextFinderTestPackage.Literals.NODE_EXCLUSION__REF, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ParentRefTest1 returns ParentRefTest1
	 *
	 * Constraint:
	 *     child1=ParentRefTestChild1
	 * </pre>
	 */
	protected void sequence_ParentRefTest1(ISerializationContext context, ParentRefTest1 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ContextFinderTestPackage.Literals.PARENT_REF_TEST1__CHILD1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ContextFinderTestPackage.Literals.PARENT_REF_TEST1__CHILD1));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParentRefTest1Access().getChild1ParentRefTestChild1ParserRuleCall_1_0(), semanticObject.getChild1());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ParentRefTest2 returns ParentRefTest2
	 *
	 * Constraint:
	 *     child2=ParentRefTestChild2
	 * </pre>
	 */
	protected void sequence_ParentRefTest2(ISerializationContext context, ParentRefTest2 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ContextFinderTestPackage.Literals.PARENT_REF_TEST2__CHILD2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ContextFinderTestPackage.Literals.PARENT_REF_TEST2__CHILD2));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParentRefTest2Access().getChild2ParentRefTestChild2ParserRuleCall_1_0(), semanticObject.getChild2());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ParentRefTestChild1 returns ParentRefTestChild
	 *
	 * Constraint:
	 *     child=ParentRefTestChild1?
	 * </pre>
	 */
	protected void sequence_ParentRefTestChild1(ISerializationContext context, ParentRefTestChild semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ParentRefTestChild2 returns ParentRefTestChild
	 *
	 * Constraint:
	 *     child=ParentRefTestChild2?
	 * </pre>
	 */
	protected void sequence_ParentRefTestChild2(ISerializationContext context, ParentRefTestChild semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     QuantityExclusionTest1 returns QuantityExclusionTest
	 *
	 * Constraint:
	 *     (attr1=ID attr2=ID?)
	 * </pre>
	 */
	protected void sequence_QuantityExclusionTest1(ISerializationContext context, QuantityExclusionTest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     QuantityExclusionTest2 returns QuantityExclusionTest
	 *
	 * Constraint:
	 *     (attr1=ID? attr2=ID)
	 * </pre>
	 */
	protected void sequence_QuantityExclusionTest2(ISerializationContext context, QuantityExclusionTest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ValueExclusionTest1 returns ValueExclusionTest
	 *
	 * Constraint:
	 *     val=ValueExclusionTestEn1
	 * </pre>
	 */
	protected void sequence_ValueExclusionTest1(ISerializationContext context, ValueExclusionTest semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ContextFinderTestPackage.Literals.VALUE_EXCLUSION_TEST__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ContextFinderTestPackage.Literals.VALUE_EXCLUSION_TEST__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getValueExclusionTest1Access().getValValueExclusionTestEn1EnumRuleCall_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ValueExclusionTest2 returns ValueExclusionTest
	 *
	 * Constraint:
	 *     val=ValueExclusionTestEn2
	 * </pre>
	 */
	protected void sequence_ValueExclusionTest2(ISerializationContext context, ValueExclusionTest semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ContextFinderTestPackage.Literals.VALUE_EXCLUSION_TEST__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ContextFinderTestPackage.Literals.VALUE_EXCLUSION_TEST__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getValueExclusionTest2Access().getValValueExclusionTestEn2EnumRuleCall_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
}
