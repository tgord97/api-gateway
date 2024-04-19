package com.iprody.aptgateway.filter;

import com.iprody.aptgateway.model.Payment;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class RequestFilter implements GatewayFilter {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        Object body = exchange.getAttribute("cachedRequestBodyObject");
        System.out.println("in request filter");
        if(body instanceof Payment) {
            System.out.println("body:" + (Payment) body);
        }
        return chain.filter(exchange);
    }
}
