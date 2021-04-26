package com.oracle_sp_sdk.openlegacy;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Configuration;
import com.oracle_sp_sdk.openlegacy.config.OracleSpSdkConfiguration;

/**
 * no-op marker class for spring boot's auto-configuration
 */
@Configuration
@Import(value = {OracleSpSdkConfiguration.class})
public class OracleSpSdkAutoConfiguration {
}
