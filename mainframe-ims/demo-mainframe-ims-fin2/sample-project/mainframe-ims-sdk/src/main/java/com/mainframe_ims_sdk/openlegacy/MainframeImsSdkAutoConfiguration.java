package com.mainframe_ims_sdk.openlegacy;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Configuration;
import com.mainframe_ims_sdk.openlegacy.config.MainframeImsSdkConfiguration;

/**
 * no-op marker class for spring boot's auto-configuration
 */
@Configuration
@Import(value = {MainframeImsSdkConfiguration.class})
public class MainframeImsSdkAutoConfiguration {
}
