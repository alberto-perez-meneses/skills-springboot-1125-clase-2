package com.ennovate.emailTool.controller;

import com.ennovate.emailTool.model.UserDTORequest;
import com.ennovate.emailTool.service.EmailService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class EmailToolController {

    private final EmailService emailService;

 @GetMapping("/validation")
    public String isValidEmail(@RequestParam String email){
     emailService.addEmail(email);
     return "ok";
 }

    @PostMapping("/user")
    public UserDTORequest addUser(@RequestBody @Valid UserDTORequest userDTO){
        return userDTO;
    }

}
