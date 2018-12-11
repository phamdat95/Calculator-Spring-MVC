package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping(value = "/calculator")
    public String showCalculator(){
        return "calculator";
    }
    @PostMapping(value = "/result")
    public String showResult(Model model, @RequestParam("numberOne") String numberOne, @RequestParam("numberTwo") String numberTwo, @RequestParam(value = "add",required = false) String add, @RequestParam(value = "sub",required = false) String sub, @RequestParam(value = "mul", required = false) String mul, @RequestParam(value = "div",required = false) String div){
        int numberone = Integer.parseInt(numberOne);
        int numbertwo = Integer.parseInt(numberTwo);
        model.addAttribute("numberOne", numberOne);
        model.addAttribute("numberTwo", numberTwo);
        int result;
        if (add != null){
            result = numberone+numbertwo;
            model.addAttribute("result", result);
            model.addAttribute("ap", "Addition");
        } else if (sub != null){
            result = numberone-numbertwo;
            model.addAttribute("result", result);
            model.addAttribute("ap", "Subtraction");
        } else if (mul != null){
            result = numberone*numbertwo;
            model.addAttribute("result", result);
            model.addAttribute("ap", "Multiplication");
        } else if (div != null){
            if (numbertwo == 0){
                return "error";
            } else {
            result = numberone/numbertwo;
            model.addAttribute("result", result);
            model.addAttribute("ap", "Division");
            }
        }
        return "result";
    }
}
