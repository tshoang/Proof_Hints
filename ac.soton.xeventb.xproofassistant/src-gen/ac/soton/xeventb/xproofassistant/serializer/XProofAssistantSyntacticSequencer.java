/*
 * generated by Xtext 2.16.0
 */
package ac.soton.xeventb.xproofassistant.serializer;

import ac.soton.xeventb.xproofassistant.services.XProofAssistantGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class XProofAssistantSyntacticSequencer extends AbstractSyntacticSequencer {

	protected XProofAssistantGrammarAccess grammarAccess;
	protected AbstractElementAlias match_XProofAssistant_HintsKeyword_4_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (XProofAssistantGrammarAccess) access;
		match_XProofAssistant_HintsKeyword_4_0_q = new TokenAlias(false, true, grammarAccess.getXProofAssistantAccess().getHintsKeyword_4_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_XProofAssistant_HintsKeyword_4_0_q.equals(syntax))
				emit_XProofAssistant_HintsKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'hints'?
	 *
	 * This ambiguous syntax occurs at:
	 *     hints+=XHint (ambiguity) hints+=XHint
	 */
	protected void emit_XProofAssistant_HintsKeyword_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
