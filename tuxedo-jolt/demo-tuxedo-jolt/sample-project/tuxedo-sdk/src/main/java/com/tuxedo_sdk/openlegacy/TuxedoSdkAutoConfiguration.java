package com.tuxedo_sdk.openlegacy;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Configuration;
import com.tuxedo_sdk.openlegacy.config.TuxedoSdkConfiguration;

/**
 * no-op marker class for spring boot's auto-configuration
 */
@Configuration
@Import(value = {TuxedoSdkConfiguration.class})
public class TuxedoSdkAutoConfiguration {
}
