package com.example.helloworld;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String sayHi(){
        return "hi";
    }
}
