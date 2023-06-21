package com.example.helloworld.ControllerTest;

import com.example.helloworld.HelloController;
import com.example.helloworld.HelloService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
@ExtendWith(MockitoExtension.class)
@WebMvcTest(controllers = HelloController.class)
public class ControllerTest {
    @BeforeAll
    public static void prepare(){
        System.out.println("Controller Test started");
    }
    @AfterAll
    public static void done(){
        System.out.println("test is finished");
    }
    @MockBean
    HelloService helloService;
    @Autowired
    MockMvc mockMvc;
    @Test
    public void hiTest()throws Exception{
        when(helloService.sayHi()).thenReturn("hi");
        MvcResult result = mockMvc.perform(get("/hi"))
                .andExpect(status().isOk())
                .andReturn();
        assertEquals(result.getResponse().getContentAsString(), "hi");
    }
}
