package pl.warkoczewski.foodspot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.warkoczewski.foodspot.dto.RegistrationDataDTO;

@Controller
@RequestMapping("/register")
public class RegistrationController {
    @GetMapping("/registrationForm")
    public String displayRegistrationFormPage(Model model){
        model.addAttribute("registrationData", new RegistrationDataDTO());
        return "/register/registrationForm";
    }

    @GetMapping("/signIn")
    public String displayHomePage(){
        return "/register/registrationForm";
    }
}
