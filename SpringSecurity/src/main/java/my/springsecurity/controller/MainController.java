package my.springsecurity.controller;

import my.springsecurity.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    UserService userService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("users", userService.getAll());
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

}
