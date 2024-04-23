package com.iprody.aptgateway.services;

import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "auth-server", url = "http://localhost:8088")
@Headers("Authorization: {token}")
public interface ServiceFeignClient {

    String AUTH_TOKEN = "Authorization";

    @GetMapping("/test")
    @Headers("Content-Type: application/json")
     String test(@RequestHeader("Authorization") String token);
}
