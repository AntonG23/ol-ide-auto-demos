package com.soap_sdk.openlegacy;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Configuration;
import com.soap_sdk.openlegacy.config.SoapSdkConfiguration;

/**
 * no-op marker class for spring boot's auto-configuration
 */
@Configuration
@Import(value = {SoapSdkConfiguration.class})
public class SoapSdkAutoConfiguration {
}
