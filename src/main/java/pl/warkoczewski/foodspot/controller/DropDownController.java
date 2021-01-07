package pl.warkoczewski.foodspot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DropDownController {
    @GetMapping("/dropdown")
    public String getPage(){
        return "/dropDown/dropDown";
    }
}
