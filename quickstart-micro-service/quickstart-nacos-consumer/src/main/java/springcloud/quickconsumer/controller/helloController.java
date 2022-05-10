package springcloud.quickconsumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {


    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello, consumer.";
    }

}
