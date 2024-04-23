package com.iprody.aptgateway.util;

import com.iprody.aptgateway.model.Credential;
import com.iprody.aptgateway.services.ServiceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AuthUtil {

    @Autowired
    ServiceFeignClient serviceFeignClient;

    @Autowired
    private RestTemplate restTemplate;

    public Boolean checkToken(String token) {
//        HttpHeaders headers = new HttpHeaders();
//        headers.set("Authorization", "Bearer " + token);
//        ResponseEntity<String> responseEntity = restTemplate.exchange("http://localhost:8088/test", HttpMethod.GET, new HttpEntity<>(headers), String.class);
        serviceFeignClient.test(token);
        return true;
    }
}
