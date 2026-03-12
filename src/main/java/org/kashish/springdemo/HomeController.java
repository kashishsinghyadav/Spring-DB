package org.kashish.springdemo;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        System.out.println("Home Controller called");
        return "index";
    }

//    @RequestMapping("add")
//    public String add(@RequestParam("num1") int num, int num2, Model model) {
//        System.out.println("Add Controller called");
////        int num1 = Integer.parseInt(request.getParameter("num1"));
////        int num2 = Integer.parseInt(request.getParameter("num2"));
//        int result = num + num2;
//        model.addAttribute("result", result);
//
//        return "Result";
//    }
//@RequestMapping("added")
//public ModelAndView add(@RequestParam("num1") int num, int num2, ModelAndView model) {
//    System.out.println("Add Controller called");
//    int result = num + num2;
//    model.addObject("result", result);
//    model.setViewName("Result");
//
//    return model;
//}


    @RequestMapping("adddetails")
    public String addDetail(@ModelAttribute("alien") Alein alein) {
        System.out.println(alein);

        return "Result";
    }

}
