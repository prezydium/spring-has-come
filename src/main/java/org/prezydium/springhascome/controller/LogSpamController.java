package org.prezydium.springhascome.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogSpamController {

    private final Logger logger = LoggerFactory.getLogger(LogSpamController.class);

    @RequestMapping("/spam")
    public String spamLogs(){
        for (int i =0; i < 10000; i++){
            logger.error("MSG : " + i);
        }
        return "spammed";
    }
}
