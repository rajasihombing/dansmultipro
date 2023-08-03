package com.example.dansmultipro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class JobService {

    @Autowired
    private RestTemplate restTemplate;

    public ResponseEntity<?> getJobList() {
        URI uri = URI.create("http://dev3.dansmultipro.co.id/api/recruitment/positions.json");

        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", "application/json");

        HttpEntity<?> request = new HttpEntity<>(headers);

        return restTemplate.exchange(
                uri,
                HttpMethod.GET,
                request,
                String.class
            );
        }

    public ResponseEntity<?> getJobDetail(String id) {
        URI uri = URI.create("http://dev3.dansmultipro.co.id/api/recruitment/positions/"+id);

        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", "application/json");

        HttpEntity<?> request = new HttpEntity<>(headers);

        return restTemplate.exchange(
                uri,
                HttpMethod.GET,
                request,
                String.class
        );
    }
}
