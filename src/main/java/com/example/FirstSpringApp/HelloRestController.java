package com.example.FirstSpringApp;

import org.springframework.web.bind.annotation.*;
import com.example.FirstSpringApp.User;
@RestController
@RequestMapping("/hello")
public class HelloRestController {
    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello from BridgeLabz!";
    }
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHelloQuery(@RequestParam("name") String name) {
        return "Hello " + name + "!";
    }
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + "!";
    }

}
