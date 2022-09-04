package test1.test1hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping
    public String hello(){
        return "Hello first spring boot app";
    }
    
}
