package com.example.helloworld.ServiceTest;

import com.example.helloworld.HelloService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class HelloServiceTest {
    @BeforeAll
    public static void prepare(){
        System.out.println("Hello Service Test started");
    }
    @AfterAll
    public static void done(){
        System.out.println("test is finished");
    }
    @InjectMocks
    HelloService helloService;
    @Test
    public void SayHiTest(){
        String res = helloService.sayHi();
        assertEquals(res, "hi");
    }
}
