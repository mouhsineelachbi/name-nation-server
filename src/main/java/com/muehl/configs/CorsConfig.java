package com.muehl.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
	
	@Value("${allowed.origin}")
	private String allowedOrigins;
	
	/*
	 * Allow method Get from specific origin
	 * Get allowed origins from properties by key
	 */
	@Bean
	public WebMvcConfigurer getCorsConfiguration() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registery) {
				registery.addMapping("/api/**")
							.allowedOrigins(allowedOrigins)
							.allowedMethods("GET")
							.allowedHeaders("*");
			}
		};
	}
}