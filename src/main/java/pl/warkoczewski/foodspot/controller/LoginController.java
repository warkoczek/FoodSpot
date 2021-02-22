package pl.warkoczewski.foodspot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.warkoczewski.foodspot.dto.SignInData;

@Controller
@RequestMapping("/sign_in")
public class LoginController {
    @GetMapping
    public String displayHomePage(Model model){
        model.addAttribute("signInData", new SignInData());
        return "/login/sign_in";
    }
}
