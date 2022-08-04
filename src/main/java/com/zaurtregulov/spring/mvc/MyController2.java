package com.zaurtregulov.spring.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/employee2")
public class MyController2 {

    @RequestMapping("/f")
    public String showFirstView() {
        return "first-view_mvc";
    }

    @RequestMapping("/askDetails_mvc")
    public String askEmployeeDetails(Model model) {

        model.addAttribute("employee", new Employee());

        return "ask-emp-details-view_mvc";
    }

    @RequestMapping("/showDetails_mvc")
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee employee
            , BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "ask-emp-details-view_mvc";
        } else {
            return "show-emp-details-view_mvc";
        }
    }
}
