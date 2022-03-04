package com.bigbasket.sponsoredcontent;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SponsoredContentApplication {

    public static void main(String[] args) {
        log.info("Welcome Atlantis");
        SpringApplication.run(SponsoredContentApplication.class, args);
    }
}
