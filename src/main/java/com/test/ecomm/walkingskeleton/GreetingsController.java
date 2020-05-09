package com.test.ecomm.walkingskeleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class GreetingsController {

    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {

        String greeting = "Hello " + name;
        mongoTemplate.save(new Greeting(greeting));
        return greeting;
    }

    @GetMapping("/greetings")
    public List<Greeting> getGreetings() {
       return mongoTemplate.findAll(Greeting.class);
    }

}
