package com.kmakrutin.user.query.api;

import com.kmakrutin.user.core.configuration.AxonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(AxonConfig.class)
public class UserQueryApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserQueryApiApplication.class, args);
    }

}
