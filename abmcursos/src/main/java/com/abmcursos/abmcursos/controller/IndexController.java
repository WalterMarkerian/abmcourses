package com.abmcursos.abmcursos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.abmcursos.abmcursos.models.TUsers;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "/index/index";
    }

    // @RequestMapping(value = "/login",method = RequestMethod.POST)
    @PostMapping("/login")
    // @GetMapping("/get/{user}/{password}")
    public String login(TUsers user) {
        // var list = new ArrayList<TUsers>();
        // list.add(new TUsers(user, password));
        // list.add(new TUsers("user", "password"));
        return "/index/index";
    }
}
