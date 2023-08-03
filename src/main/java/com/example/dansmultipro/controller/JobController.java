package com.example.dansmultipro.controller;

import com.example.dansmultipro.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/job")
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping("/list")
    public ResponseEntity<?> getJobList() {
        return ResponseEntity.ok(jobService.getJobList().getBody());
    }

    @GetMapping("/detail")
    public ResponseEntity<?> getJobDetail(
            @RequestParam(name = "id") String id) {
        return ResponseEntity.ok(jobService.getJobDetail(id).getBody());
    }
}
