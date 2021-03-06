/*
 * generated by Xtext 2.16.0
 */
package ac.soton.xeventb.xproofassistant.tests

import ac.soton.eventb.emf.proofassistant.ProofAssistant
import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(XProofAssistantInjectorProvider)
class XProofAssistantParsingTest {
	@Inject
	ParseHelper<ProofAssistant> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		Assert.assertTrue('''Unexpected errors: «errors.join(", ")»''', errors.isEmpty)
	}
}
