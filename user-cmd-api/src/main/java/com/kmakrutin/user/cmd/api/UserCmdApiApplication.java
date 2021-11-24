package com.kmakrutin.user.cmd.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import com.kmakrutin.user.core.configuration.AxonConfig;

@SpringBootApplication
@Import(AxonConfig.class)
public class UserCmdApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserCmdApiApplication.class, args);
    }

}
