package com.tuxedo_jca_sdk.openlegacy;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Configuration;
import com.tuxedo_jca_sdk.openlegacy.config.TuxedoJcaSdkConfiguration;

/**
 * no-op marker class for spring boot's auto-configuration
 */
@Configuration
@Import(value = {TuxedoJcaSdkConfiguration.class})
public class TuxedoJcaSdkAutoConfiguration {
}
