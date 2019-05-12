/**
 * generated by Xtext 2.16.0
 */
package ac.soton.xeventb.xproofassistant;

import ac.soton.xeventb.common.EventBValueConverter;
import ac.soton.xeventb.xproofassistant.AbstractXProofAssistantRuntimeModule;
import org.eclipse.xtext.conversion.IValueConverterService;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("all")
public class XProofAssistantRuntimeModule extends AbstractXProofAssistantRuntimeModule {
  /**
   * Bind the value converter service for Event-B values, e.g., converting comments,
   * labels, etc.
   * 
   * @see EventBValueConverter
   */
  @Override
  public Class<? extends IValueConverterService> bindIValueConverterService() {
    return EventBValueConverter.class;
  }
}
