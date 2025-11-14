package com.ennovate.emailTool.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
public class EmailValidator {
    @ConditionalOnProperty(name = "app.config.isBasic", havingValue="true", matchIfMissing = true)
    public boolean isValid(String email){
        return email.contains("@");
    }

    @ConditionalOnProperty(name = "app.config.isBasic", havingValue = "false", matchIfMissing = true)
    public boolean isValidByRegex(String email){
        return email != null && email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }
}
