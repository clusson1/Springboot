package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormController {

    @GetMapping("/form")
    public String showForm(Model model) {
        return "form";
    }
}
