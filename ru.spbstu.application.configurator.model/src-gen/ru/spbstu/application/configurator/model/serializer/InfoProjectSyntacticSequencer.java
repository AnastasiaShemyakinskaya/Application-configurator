/*
 * generated by Xtext 2.14.0
 */
package ru.spbstu.application.configurator.model.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import ru.spbstu.application.configurator.model.services.InfoProjectGrammarAccess;

@SuppressWarnings("all")
public class InfoProjectSyntacticSequencer extends AbstractSyntacticSequencer {

	protected InfoProjectGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Category_IDTerminalRuleCall_0_5_q;
	protected AbstractElementAlias match_Category_SPACETerminalRuleCall_0_4_q;
	protected AbstractElementAlias match_Category___ADDITIONTerminalRuleCall_1_1_or_IDTerminalRuleCall_1_0_or_VERSION_NUMBERTerminalRuleCall_1_2__a;
	protected AbstractElementAlias match_CloseMode___SPACETerminalRuleCall_3_0_IDTerminalRuleCall_3_1__a;
	protected AbstractElementAlias match_Description___SPACETerminalRuleCall_4_0_IDTerminalRuleCall_4_1__a;
	protected AbstractElementAlias match_HoldType_HoldTypeKeyword_0_p;
	protected AbstractElementAlias match_Include_IncludesKeyword_1_p;
	protected AbstractElementAlias match_PaddingScheme_VERSION_NUMBERTerminalRuleCall_1_1_or___PaddingSchemeKeyword_0_1_SPACETerminalRuleCall_0_2__;
	protected AbstractElementAlias match_ReceiveNode_ReceiverNodeKeyword_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (InfoProjectGrammarAccess) access;
		match_Category_IDTerminalRuleCall_0_5_q = new TokenAlias(false, true, grammarAccess.getCategoryAccess().getIDTerminalRuleCall_0_5());
		match_Category_SPACETerminalRuleCall_0_4_q = new TokenAlias(false, true, grammarAccess.getCategoryAccess().getSPACETerminalRuleCall_0_4());
		match_Category___ADDITIONTerminalRuleCall_1_1_or_IDTerminalRuleCall_1_0_or_VERSION_NUMBERTerminalRuleCall_1_2__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getCategoryAccess().getADDITIONTerminalRuleCall_1_1()), new TokenAlias(false, false, grammarAccess.getCategoryAccess().getIDTerminalRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getCategoryAccess().getVERSION_NUMBERTerminalRuleCall_1_2()));
		match_CloseMode___SPACETerminalRuleCall_3_0_IDTerminalRuleCall_3_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getCloseModeAccess().getSPACETerminalRuleCall_3_0()), new TokenAlias(false, false, grammarAccess.getCloseModeAccess().getIDTerminalRuleCall_3_1()));
		match_Description___SPACETerminalRuleCall_4_0_IDTerminalRuleCall_4_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getDescriptionAccess().getSPACETerminalRuleCall_4_0()), new TokenAlias(false, false, grammarAccess.getDescriptionAccess().getIDTerminalRuleCall_4_1()));
		match_HoldType_HoldTypeKeyword_0_p = new TokenAlias(true, false, grammarAccess.getHoldTypeAccess().getHoldTypeKeyword_0());
		match_Include_IncludesKeyword_1_p = new TokenAlias(true, false, grammarAccess.getIncludeAccess().getIncludesKeyword_1());
		match_PaddingScheme_VERSION_NUMBERTerminalRuleCall_1_1_or___PaddingSchemeKeyword_0_1_SPACETerminalRuleCall_0_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPaddingSchemeAccess().getPaddingSchemeKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getPaddingSchemeAccess().getSPACETerminalRuleCall_0_2())), new TokenAlias(false, false, grammarAccess.getPaddingSchemeAccess().getVERSION_NUMBERTerminalRuleCall_1_1()));
		match_ReceiveNode_ReceiverNodeKeyword_0_p = new TokenAlias(true, false, grammarAccess.getReceiveNodeAccess().getReceiverNodeKeyword_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getADDITIONRule())
			return getADDITIONToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSPACERule())
			return getSPACEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getVERSION_NUMBERRule())
			return getVERSION_NUMBERToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getWSRule())
			return getWSToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ADDITION:
	 * 	('$')*|('{')*|('}')*|('-')*|('.')*|(' ')*|(':')*
	 * ;
	 */
	protected String getADDITIONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal SPACE:
	 * 	' '
	 * ;
	 */
	protected String getSPACEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return " ";
	}
	
	/**
	 * terminal VERSION_NUMBER: 
	 *     ('0'..'9')('.' | '0'..'9')*;
	 */
	protected String getVERSION_NUMBERToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal WS         : (' '|'\t'|'\r'|'\n')+;
	 */
	protected String getWSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return " ";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Category_IDTerminalRuleCall_0_5_q.equals(syntax))
				emit_Category_IDTerminalRuleCall_0_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Category_SPACETerminalRuleCall_0_4_q.equals(syntax))
				emit_Category_SPACETerminalRuleCall_0_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Category___ADDITIONTerminalRuleCall_1_1_or_IDTerminalRuleCall_1_0_or_VERSION_NUMBERTerminalRuleCall_1_2__a.equals(syntax))
				emit_Category___ADDITIONTerminalRuleCall_1_1_or_IDTerminalRuleCall_1_0_or_VERSION_NUMBERTerminalRuleCall_1_2__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_CloseMode___SPACETerminalRuleCall_3_0_IDTerminalRuleCall_3_1__a.equals(syntax))
				emit_CloseMode___SPACETerminalRuleCall_3_0_IDTerminalRuleCall_3_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Description___SPACETerminalRuleCall_4_0_IDTerminalRuleCall_4_1__a.equals(syntax))
				emit_Description___SPACETerminalRuleCall_4_0_IDTerminalRuleCall_4_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_HoldType_HoldTypeKeyword_0_p.equals(syntax))
				emit_HoldType_HoldTypeKeyword_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Include_IncludesKeyword_1_p.equals(syntax))
				emit_Include_IncludesKeyword_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PaddingScheme_VERSION_NUMBERTerminalRuleCall_1_1_or___PaddingSchemeKeyword_0_1_SPACETerminalRuleCall_0_2__.equals(syntax))
				emit_PaddingScheme_VERSION_NUMBERTerminalRuleCall_1_1_or___PaddingSchemeKeyword_0_1_SPACETerminalRuleCall_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ReceiveNode_ReceiverNodeKeyword_0_p.equals(syntax))
				emit_ReceiveNode_ReceiverNodeKeyword_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ID?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID SPACE? (ambiguity) (rule end)
	 */
	protected void emit_Category_IDTerminalRuleCall_0_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     SPACE?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) ID? (rule end)
	 */
	protected void emit_Category_SPACETerminalRuleCall_0_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (ID | ADDITION | VERSION_NUMBER)*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Category___ADDITIONTerminalRuleCall_1_1_or_IDTerminalRuleCall_1_0_or_VERSION_NUMBERTerminalRuleCall_1_2__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (SPACE ID)*
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) (rule end)
	 */
	protected void emit_CloseMode___SPACETerminalRuleCall_3_0_IDTerminalRuleCall_3_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (SPACE ID)*
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) (rule end)
	 */
	protected void emit_Description___SPACETerminalRuleCall_4_0_IDTerminalRuleCall_4_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'holdType:'+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) WS features+=FeatureName
	 *     (rule start) (ambiguity) WS features+=TypeAttribute
	 */
	protected void emit_HoldType_HoldTypeKeyword_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'includes:'+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) WS (rule start)
	 *     (rule start) (ambiguity) WS files+=FileDeclaration
	 */
	protected void emit_Include_IncludesKeyword_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('paddingScheme:' SPACE) | VERSION_NUMBER
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_PaddingScheme_VERSION_NUMBERTerminalRuleCall_1_1_or___PaddingSchemeKeyword_0_1_SPACETerminalRuleCall_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'receiverNode:'+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) WS features+=FeatureName
	 */
	protected void emit_ReceiveNode_ReceiverNodeKeyword_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
