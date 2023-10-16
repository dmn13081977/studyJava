package my.springrest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController//это @Controller плюс над каждым методом @ResponseBody
@Controller
@RequestMapping("/api")
public class RESTController {

    @ResponseBody//данные конвертируются Jackson в JSON и возвращаются клиенту
    @GetMapping("sayHi")
    public String sayHi() {
        return "Hi All!";
    }
}
