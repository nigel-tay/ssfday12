package sg.nus.iss.visa.ssf.day12demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class DemoController {

    @GetMapping("/home/{name}")
    public HelloWorld getHome(@PathVariable String name){


        //return "Hello world";
        return new HelloWorld(name);
    }
    

   
}
