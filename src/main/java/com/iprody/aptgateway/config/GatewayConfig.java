package com.iprody.aptgateway.config;

import com.iprody.aptgateway.filter.AuthFilter;
import com.iprody.aptgateway.filter.PostGlobalFilter;
import com.iprody.aptgateway.filter.RequestFilter;
import com.iprody.aptgateway.model.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.WebFilter;

@Configuration
public class GatewayConfig {

    @Autowired
    RequestFilter requestFilter;

    @Autowired
    AuthFilter authFilter;

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        // adding 2 rotes to first microservice as we need to log request body if method is POST
        return builder.routes()
                .route("first-microservice",r -> r.path("/first")
                        .and().method("POST")
                        .and().readBody(Payment.class, s -> true).filters(f -> f.filters(requestFilter, authFilter))
                        .uri("http://localhost:8082"))
                .route("first-microservice",r -> r.path("/first")
                        .and().method("GET").filters(f-> f.filters(authFilter))
                        .uri("http://localhost:8081"))
                .route("auth-server",r -> r.path("/login")
                        .uri("http://localhost:8088"))
                .build();
    }

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public WebFilter responseFilter(){
        return new PostGlobalFilter();
    }

}
