package com.as400_pcml_rpc_sdk.openlegacy;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Configuration;
import com.as400_pcml_rpc_sdk.openlegacy.config.As400PcmlRpcSdkConfiguration;

/**
 * no-op marker class for spring boot's auto-configuration
 */
@Configuration
@Import(value = {As400PcmlRpcSdkConfiguration.class})
public class As400PcmlRpcSdkAutoConfiguration {
}
