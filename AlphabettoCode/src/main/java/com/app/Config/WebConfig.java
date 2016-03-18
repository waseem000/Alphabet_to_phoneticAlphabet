package com.app.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.app")
public class WebConfig {

	@Bean
	public InternalResourceViewResolver getInternalResourceViewResolver()
	{
		InternalResourceViewResolver intResolver = new InternalResourceViewResolver();
		intResolver.setPrefix("WEB-INF/JSP/");
		intResolver.setSuffix(".jsp");
		return intResolver;
	}
	//for I18n more methods are needed
}
