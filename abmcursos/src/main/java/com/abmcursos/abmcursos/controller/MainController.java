package com.abmcursos.abmcursos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
    
    @GetMapping(value = {"/main"})
    public String main(){
        return "main/main";
    }

    @GetMapping(value ={"/logout"})
    public String logout(HttpSession session){
        session.setAttribute("usersession", null);
        return "redirect:/";
    }
}
