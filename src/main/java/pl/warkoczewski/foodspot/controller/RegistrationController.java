package pl.warkoczewski.foodspot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.warkoczewski.foodspot.dto.RegistrationDataDTO;
import pl.warkoczewski.foodspot.service.registration.RegistrationServiceImpl;

@Controller
@RequestMapping("/register")
public class RegistrationController {
    private final RegistrationServiceImpl registrationService;

    public RegistrationController(RegistrationServiceImpl registrationService) {
        this.registrationService = registrationService;
    }

    @GetMapping("/registrationForm")
    public String displayRegistrationFormPage(Model model){
        model.addAttribute("registrationData", new RegistrationDataDTO());
        return "/register/registrationForm";
    }
    @PostMapping("/registrationForm")
    public String processRegistrationForm(@ModelAttribute RegistrationDataDTO registrationDataDTO, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            return "/register/registrationForm";
        }
        registrationService.register(registrationDataDTO);
        return "/register/registrationSuccess";
    }

    @GetMapping("/signIn")
    public String displayHomePage(){
        return "/register/registrationForm";
    }
}
