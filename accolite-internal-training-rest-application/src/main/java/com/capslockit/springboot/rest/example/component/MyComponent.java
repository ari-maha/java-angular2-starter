package com.capslockit.springboot.rest.example.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyComponent implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void run(String... args) {
        logger.info("Server Up and now ready to process the request");
    }
}
