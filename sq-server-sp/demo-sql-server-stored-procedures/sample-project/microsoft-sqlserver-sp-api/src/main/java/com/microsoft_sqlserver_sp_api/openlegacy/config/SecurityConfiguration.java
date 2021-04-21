package com.microsoft_sqlserver_sp_api.openlegacy.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Spring security oauth2 resource server configuration
 */
@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    private final Environment environment;

    public SecurityConfiguration(Environment environment) {
        this.environment = environment;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
    List<String> ignored = environment.getProperty("ol.security.resourceserver.ignored", List.class, new ArrayList<String>());
        http
            .httpBasic().disable()
            .csrf().disable()
            .authorizeRequests()
            .antMatchers(ignored.toArray(new String[] {})).permitAll()
            .antMatchers("/**/swagger/**", "/**/actuator/health", "/**/actuator/info").permitAll()
            .anyRequest().authenticated()
            .and()
            .oauth2ResourceServer()
            .jwt();
    }

}

