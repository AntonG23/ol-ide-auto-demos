package com.microsoft_sqlserver_sp_api.openlegacy.config;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Enable eureka client and hystrix when running in any profile other than `dev` (development)
 */
@Configuration
@Profile("!dev")
@EnableDiscoveryClient
public class MicroserviceConfiguration {
}

