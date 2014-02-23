package com.thoughtworks.nightschool;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NameController {

    @RequestMapping("/name")
    public String loadHomePage(Model m) {
        m.addAttribute("name", "lihongjing!");
        return "home";
    }
}