package dev.m.controller;

import dev.m.entity.Coffee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CoffeeWebController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "manhnd dang test");
        model.addAttribute("coffee", new Coffee(1L, "Ca phe pho", 10.000));
        return "index";
    }
}
