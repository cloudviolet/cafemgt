package com.cafemgt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.cafemgt.interceptor.CommonInterceptor;
import com.cafemgt.interceptor.LoginInterceptor;


@Configuration
public class WebConfig implements WebMvcConfigurer{

	private final CommonInterceptor commonInterceptor;
	private final LoginInterceptor loginInterceptor; 
	
	public WebConfig(CommonInterceptor commonInterceptor, LoginInterceptor loginInterceptor) {
		this.commonInterceptor = commonInterceptor;
		this.loginInterceptor = loginInterceptor;
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(commonInterceptor)
				.addPathPatterns("/**")
				.excludePathPatterns("/")
				.excludePathPatterns("/build/**")
				.excludePathPatterns("/vendors/**")
				.excludePathPatterns("/images/**");
		
		registry.addInterceptor(loginInterceptor)
				.addPathPatterns("/**")
				.excludePathPatterns("/")
				.excludePathPatterns("/idCheck")
				.excludePathPatterns("/build/**")
				.excludePathPatterns("/vendors/**")
				.excludePathPatterns("/images/**")
				.excludePathPatterns("/join")
				.excludePathPatterns("/login")
				.excludePathPatterns("/logout");
	}

}
