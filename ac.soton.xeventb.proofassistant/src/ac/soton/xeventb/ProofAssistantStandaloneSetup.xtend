/*
 * generated by Xtext 2.16.0
 */
package ac.soton.xeventb


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class ProofAssistantStandaloneSetup extends ProofAssistantStandaloneSetupGenerated {

	def static void doSetup() {
		new ProofAssistantStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}