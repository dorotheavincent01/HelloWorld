package com.Helloworld;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Value;

@Controller
@ConfigurationProperties("spring")
@Component
public class HelloWorldController {

    //@Value(value = "${spring.name}")
     @Value("${spring.name}")
    private String name;

    @RequestMapping("/helloWorld")
    @ResponseBody
    @GetMapping
    public String index()
    {
        if(name.equalsIgnoreCase("error")){
            throw new RuntimeException("Opss error!!!");
        }
        return name;
      //  return "Hello World :) (:";
    }
}
