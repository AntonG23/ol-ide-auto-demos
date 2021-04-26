package com.as400_cobol_rpc_sdk.openlegacy;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Configuration;
import com.as400_cobol_rpc_sdk.openlegacy.config.As400CobolRpcSdkConfiguration;

/**
 * no-op marker class for spring boot's auto-configuration
 */
@Configuration
@Import(value = {As400CobolRpcSdkConfiguration.class})
public class As400CobolRpcSdkAutoConfiguration {
}
