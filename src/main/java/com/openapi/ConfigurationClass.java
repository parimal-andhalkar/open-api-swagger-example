package com.openapi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.reflectoring.api.UserApiDelegate;

@Configuration
public class ConfigurationClass {

	
	
	/*
	 * @Bean public UserApiDelegateImpl userApiDelegate() { return new
	 * UserApiDelegateImpl(); }
	 */
	@Bean
	public UserApiDelegate userApiDelegate()
	{
		return new UserApiDelegateImpl();
	}

}
