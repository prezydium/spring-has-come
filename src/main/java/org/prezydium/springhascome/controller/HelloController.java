package org.prezydium.springhascome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    ApplicationContext localApplicationContext;

    @Autowired
    public HelloController(ApplicationContext applicationContext){
        this.localApplicationContext =applicationContext;
    }

    @RequestMapping("/hello")
    public String helloMessage(){

        return "HELLO";
    }

    @RequestMapping("/context")
    public String checkApplicationContext(){
        String[] show =  localApplicationContext.getBeanDefinitionNames();
        StringBuilder sb = new StringBuilder("");
        for (String s : show ) {
            sb.append(s + "\n");

        }
        return sb.toString();
    }

}
