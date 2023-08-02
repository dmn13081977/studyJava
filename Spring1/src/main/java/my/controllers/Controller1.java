package my.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/one")
public class Controller1 {
    @GetMapping("/hello")
    public String helloPage(HttpServletRequest request){
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        //System.out.println("Hello " + name + " " + surname);
        return "first/hello";
    }
    @GetMapping("/bye")
    public String goodByePage(@RequestParam(value = "name", required = false) String name,
                              @RequestParam(value = "surname", required = false) String surname,
                              Model model){
        //System.out.println("Hello " + name + " " + surname);
        model.addAttribute("message", "Hello " + name + " " + surname);
        return "first/bye";
    }
    @GetMapping("/calculator")
    public String calculator(@RequestParam("a") int a, @RequestParam("b") int b,
                             @RequestParam("action") String action, Model model){
        double result;

        switch (action){
            case "multiplication" -> result = a * b;
            case "subtraction" -> result = a - b;
            case "addition" -> result = a + b;
            case "division" -> { if (b != 0){
                result = a / (double)b;
                } else {
                return "first/division by 0";
                      }
                }
            default -> {
                return "first/wrong action";
            }
        }
        model.addAttribute("result", result);
        return "first/calculator";
    }

}
