package com.ssa.ironyard;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
public class SpringStarter {

    static final Logger LOGGER = LogManager.getLogger(SpringStarter.class);
        
    public static void main(String[] args)
    {
        
        SpringApplication.run(SpringStarter.class, args);
    }
    
    
}
