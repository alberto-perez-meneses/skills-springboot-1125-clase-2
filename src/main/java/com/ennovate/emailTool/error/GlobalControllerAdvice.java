package com.ennovate.emailTool.error;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalControllerAdvice {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<?> illegalArgumentExceptionHandler(Exception ex){
        return ResponseEntity.badRequest().body("Error al procesar la petición");
    }

    // todo: agregar validaciones para manejar errores de formato

}
