package com.ennovate.emailTool.controller;

import com.ennovate.emailTool.service.EmailService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class EmailToolController {

    private final EmailService emailService;

 @GetMapping("/validation")
    public String isValidEmail(@RequestParam String email){
     emailService.addEmail(email);
     return "ok";
 }

}
