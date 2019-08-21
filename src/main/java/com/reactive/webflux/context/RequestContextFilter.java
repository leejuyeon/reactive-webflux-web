package com.reactive.webflux.context;

import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;

import reactor.core.publisher.Mono;
import reactor.util.context.Context;

public class RequestContextFilter implements WebFilter {

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();
        return chain.filter(exchange)
            .subscriberContext(ctx -> {
            	ctx.put(ReactiveRequestContextHolder.REQUEST_CONTEXT_KEY, request);
            	ctx.get(ReactiveRequestContextHolder.REQUEST_CONTEXT_KEY);
            	return (Context) Mono.just("").then();
            });
	}

}