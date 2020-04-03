package com.lea.controller;

import com.lea.entity.User;
import com.lea.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserHandler {
    @Autowired
    private UserService userService;

    @GetMapping("/index")
    public ModelAndView findAll(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("list",userService.findAll());
        return modelAndView;
    }

    @RequestMapping("login")
    public String login(@RequestParam("name") String name, @RequestParam("password") String password, HttpSession session, Model model){
        User user = userService.login(name,password);
        if(user == null){
            return "login";
        }else{
            session.setAttribute("user",user);
            return "redirect:/user/index";
        }
    }


}
