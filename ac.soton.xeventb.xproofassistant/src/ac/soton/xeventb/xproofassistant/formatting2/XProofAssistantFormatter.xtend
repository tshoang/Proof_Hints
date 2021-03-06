/*
 * generated by Xtext 2.16.0
 */
package ac.soton.xeventb.xproofassistant.formatting2

import ac.soton.eventb.emf.proofassistant.CasesHint
import ac.soton.eventb.emf.proofassistant.ProofAssistant
import ac.soton.xeventb.xproofassistant.services.XProofAssistantGrammarAccess
import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class XProofAssistantFormatter extends AbstractFormatter2 {
	
	@Inject extension XProofAssistantGrammarAccess

	def dispatch void format(ProofAssistant proofAssistant, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (hint : proofAssistant.hints) {
			hint.format
		}
	}

	def dispatch void format(CasesHint casesHint, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (_case : casesHint.cases) {
			_case.format
		}
	}
	
	// TODO: implement for 
}
