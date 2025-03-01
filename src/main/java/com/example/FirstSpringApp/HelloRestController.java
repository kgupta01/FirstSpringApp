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
    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + "!";
    }
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        return "Hello " + firstName + " " + lastName + "!";
    }
}
