package com.zaurtregulov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails() {
        return "ask-emp-details-view";
    }

    // просто читает наше вью
//    @RequestMapping("/showDetails")
//    public String showEmpDetails() {
//        return "show-emp-details-view";
//    }

    // читает вью, вытягивает введеный параметр, меняет его в моделе, выдает новое вью.
//    @RequestMapping("/showDetails")
//    public String showEmpDetails(HttpServletRequest request, Model model) {
//        String empName = request.getParameter("employeeName");
//        empName = "Ms. " + empName;
//        model.addAttribute("nameAttribute", empName);
//        model.addAttribute("description", " - udemy instructor");
//
//        return "show-emp-details-view";
//    }

    // второй способ чтения из формы: не использовать сервлет, а испол аннотацию
    @RequestMapping("/showDetails")
    public String showEmpDetails(@RequestParam("employeeName") String empName
                                , Model model) {
        empName = "Ms. " + empName + "!";
        model.addAttribute("nameAttribute", empName);

        return "show-emp-details-view";
    }
}
