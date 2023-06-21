package com.example.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final HelloService helloService;
    @Autowired
    public HelloController(HelloService helloService){
        this.helloService = helloService;
    }
    @GetMapping("/hi")
    public ResponseEntity<String> hi(){
        return ResponseEntity.ok(this.helloService.sayHi());
    }
}
