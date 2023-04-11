package com.abmcursos.abmcursos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
    
    @GetMapping(value = {"/main"})
    //inyeccion de dependencia para usar session 
    public String main(HttpSession session){
        //creacion de objeto user inicializado con la info obtenida de la variable de session
        var user = (Object[])session.getAttribute("usersession");
        if(user != null){
            return "main/main";
        }else{
            return "redirect:/";
        }
    }

    @GetMapping(value ={"/logout"})
    public String logout(HttpSession session){
        session.setAttribute("usersession", null);
        return "redirect:/";
    }

    @GetMapping(value ={"/main/*"})
    public String error(){
        return "error/error";
    }
}
