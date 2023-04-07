package com.abmcursos.abmcursos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.abmcursos.abmcursos.models.TUsers;
import com.abmcursos.abmcursos.repository.R_User;
import com.abmcursos.abmcursos.repository.UserRepository;

import jakarta.validation.Valid;

@Controller
public class IndexController {

    private R_User _user;

    public IndexController(UserRepository userRepository){
        _user = new R_User(userRepository);
    }

    @GetMapping("/")
    public String index(TUsers user, Model model) {
        model.addAttribute("TUsers", user);
        return "/index/index";
    }

    @PostMapping("/login")
    public String login(@Valid TUsers user, BindingResult result, Model model) {
        if(result.hasFieldErrors("Email") || result.hasFieldErrors("Password")){
            model.addAttribute("TUsers", user);
            return "/index/index";
        }else{
            try{//Obtiene la coleccion de usuarios con getTUsers
                var userData = _user.getTUsers(user);
                //Si el objeto esta vacio
                if(userData.isEmpty()){
                    //Si el email ingresado en la interfaz no esta cargado en la bd, mostrara este mensaje
                    result.rejectValue("Email", "error.user", "El email no esta registrado");
                    //Enviamos la informacion a la interfaz login utilizando model
                    model.addAttribute("TUsers", user);
                    return "/index/index";
                //Si el objeto trae informacion
                }else{
                    //Crear objeto dataUser y asignarle la info que encontro
                    var dataUser = userData.get(0);
                    //variable donde almacenara la contraseña del usuario
                    var pass = dataUser.getPassword();
                    //compara las password de la bd con la obtenida de la interfaz login
                    if(pass.equals(user.getPassword())){
                        Object[] data = {
                            dataUser.getEmail()
                        };
                        return "redirect:/main";
                    }else{
                         //Si el email ingresado en la interfaz no esta cargado en la bd, mostrara este mensaje
                        result.rejectValue("Password", "error.user", "Contraseña incorrecta");
                        //Enviamos la informacion a la interfaz login utilizando model
                        model.addAttribute("TUsers", user);
                        return "/index/index";
                    }
                }
            }catch(Exception e){

            }
        }
        return "/index/index";
    }
}
