package com.gsh.httpsexample.springboothttpsexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest")
public class HelloController {

    @GetMapping("hello")
    public String sayHello(@RequestParam String name){
        return "Hi "+name;
    }
}
