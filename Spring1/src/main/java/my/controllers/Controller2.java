package my.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controller2 {
    @GetMapping("/exit")
    public String exit(){
        return "second/exit";
    }

}
