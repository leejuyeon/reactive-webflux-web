package com.reactive.webflux.context;

import java.util.function.Function;

import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;
import reactor.util.context.Context;

public class ReactiveRequestContextHolder {
	static final Class<ServerWebExchange> REQUEST_CONTEXT_KEY = ServerWebExchange.class;

    
    public static Mono<ServerWebExchange> getRequest() {
        return Mono.subscriberContext()
                .map(ctx -> ctx.get(REQUEST_CONTEXT_KEY));
    }
    
	public static Function<Context, Context> clearRequest() {
		return context -> context.delete(REQUEST_CONTEXT_KEY);
	}

	public static Context withRequest(Mono<? extends ServerHttpRequest> serverHttpRequest) {
		return Context.of(REQUEST_CONTEXT_KEY, serverHttpRequest);
	}
}
