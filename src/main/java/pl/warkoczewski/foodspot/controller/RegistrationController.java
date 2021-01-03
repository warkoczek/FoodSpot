package pl.warkoczewski.foodspot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegistrationController {
    @GetMapping("/registrationForm")
    public String displayRegistrationFormPage(){
        return "/register/registrationForm";
    }
    @GetMapping("/login")
    public String displayHomePage(){
        return "/register/registrationForm";
    }
}
