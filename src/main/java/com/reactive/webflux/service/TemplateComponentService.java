package com.reactive.webflux.service;

import org.springframework.context.ApplicationContext;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ServerWebExchange;

@Service
public class TemplateComponentService {
	
	public String test (ServerWebExchange exchange) {
		ApplicationContext context = exchange.getApplicationContext();
		ServerHttpRequest request = exchange.getRequest();
		
		System.out.println(context.getApplicationName());
		System.out.println(request.getPath().toString());
		
		return context.getApplicationName();
	}
	
	public String test ()  {
		//final IEngineContext engineContext =
        //EngineContextManager.prepareEngineContext(this.configuration, template.getTemplateData(), context.getTemplateResolutionAttributes(), context);

		//HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
		
		
		
		//String path = springWebFluxThymeleafRequestContext.getContextPath();
		
		//ApplicationContext ctc = thymeleafReactiveViewResolver.getApplicat0ionContext();
		/*
		 * return ReactiveRequestContextHolder.getRequest().flatMap(v -> {
		 * System.out.println(v); return Mono.just("ee"); });
		 */
		
		return "ttest";	
	}
}