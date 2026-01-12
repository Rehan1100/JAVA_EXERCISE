package com.example.demo.service.imp;

import com.example.demo.service.ExternalUserService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExternalUserServiceImpl implements ExternalUserService {

    private final RestTemplate restTemplate;

    public ExternalUserServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getExternalUsers() {
        String url = "https://jsonplaceholder.typicode.com/photos";
        return restTemplate.getForObject(url, String.class);
    }
}
