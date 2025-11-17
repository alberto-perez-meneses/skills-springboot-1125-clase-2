package com.ennovate.emailTool.service.impl;

import com.ennovate.emailTool.config.EmailValidator;
import com.ennovate.emailTool.service.EmailService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
// todo: camilo cambiar constructor por anotacion de lombok
@RequiredArgsConstructor
public class EmailServiceImpl implements EmailService {

    private final EmailValidator emailValidator;

    // todo: jhonathan agregar comentarios con uso del metodo
    @Override
    public void addEmail(String email) {
        if(!this.emailValidator.isValid(email)){
            log.error("Email no valido :{}",email);
            throw new IllegalArgumentException("Email no es valido");
        }
        log.info("email valido");
    }
}
