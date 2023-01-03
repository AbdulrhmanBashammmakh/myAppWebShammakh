package net.Bashammakh.myAppWebShammakh.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

public class TestController {
    @RestController
    @RequestMapping("/api")
    public class firstController {
/*
    @Value("${name}")
    private  String name;

 */

        @GetMapping(value="/get")
        public String hello(){
            return "Hello, ";
        }

        @GetMapping("/hello")
        public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
            return String.format("Hello %s!", name);
        }
    }
}
