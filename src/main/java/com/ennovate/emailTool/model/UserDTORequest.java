package com.ennovate.emailTool.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class UserDTORequest {

    @NotBlank
    private String nombre;

    @NotBlank(message = "El email es obligatorio.")
    @Email(message = "El formato de email no es valido.")
    private String email;

    @Positive(message = "La edad no puede ser igual o menor a cero.")
    private Integer edad;

}
