package pl.warkoczewski.foodspot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdministratorController {
    @GetMapping("/administrator")
    public String displayAdministratorPage(){
        return "/admin/administrator";
    }
    @GetMapping("/admin/accessDenied")
    public String getAccessDeniedPage(){
        return "/admin/accessDenied";
    }



}
