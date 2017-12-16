package com.hs.configuration;

import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.hs")
public class ApplicationConfiguration extends WebMvcConfigurerAdapter{

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		InternalResourceViewResolver view=new InternalResourceViewResolver();
		view.setPrefix("/WEB-INF/pages/");
		view.setSuffix(".jsp");
		registry.viewResolver(view);
	
	}
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**").addResourceLocations("/static/");
	}
	
	
}
