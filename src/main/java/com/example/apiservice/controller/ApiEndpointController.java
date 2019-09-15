package com.example.apiservice.controller;

import com.example.apiservice.util.JsonStringBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiservice")
public class ApiEndpointController {

  @GetMapping(value = "/", produces = "application/json")
  public ResponseEntity<String> index() {
    return ResponseEntity.ok(new JsonStringBuilder()
        .start()
        .entry("response", "OK")
        .entry("type", "success")
        .entry("statusCode", "200")
        .end()
        .jsonString()
    );
  }

}
