package pl.warkoczewski.foodspot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.warkoczewski.foodspot.dto.RegistrationDataDTO;
import pl.warkoczewski.foodspot.service.registration.RegistrationServiceImpl;

import javax.validation.Valid;

@Controller
@RequestMapping("/register")
public class RegistrationController {
    private final RegistrationServiceImpl registrationService;

    public RegistrationController(RegistrationServiceImpl registrationService) {
        this.registrationService = registrationService;
    }

    @GetMapping("/registrationForm")
    public ModelAndView displayRegistrationFormPage(ModelAndView modelAndView){
        modelAndView.setViewName("/register/registrationForm");
        modelAndView.addObject("registrationData", new RegistrationDataDTO());
        return modelAndView;
    }
    @PostMapping("/registrationForm")
    public ModelAndView processRegistrationForm(@ModelAttribute("registrationData") @Valid RegistrationDataDTO registrationDataDTO, BindingResult bindingResult, ModelAndView modelAndView){
        if(bindingResult.hasErrors()){
            modelAndView.setViewName("/register/registrationForm");
            return modelAndView;
        }
        registrationService.register(registrationDataDTO);
        modelAndView.setViewName("redirect:/sign_in");
        return modelAndView;
    }


}
