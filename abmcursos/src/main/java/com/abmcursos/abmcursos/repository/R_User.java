package com.abmcursos.abmcursos.repository;

import java.util.List;
import java.util.stream.Collectors;

import com.abmcursos.abmcursos.models.TUsers;

public class R_User {
    private UserRepository _userRepository;

    public R_User(UserRepository userRepository){
        _userRepository = userRepository;
    }

    //Metodo que obtiene la coleccion de usuarios
    public List<TUsers> getTUsers(TUsers user){
        //Verifica si el correo electronico ingresado en la interfaz login esta registrado, en caso negativo, userData quedara vacio.
        var userData = _userRepository.findAll().stream()
                .filter(u -> u.getEmail().equals(user.getEmail()))
                .collect(Collectors.toList());
        return userData;
    }
}
