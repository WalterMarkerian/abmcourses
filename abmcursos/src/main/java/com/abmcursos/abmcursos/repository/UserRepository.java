package com.abmcursos.abmcursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abmcursos.abmcursos.models.TUsers;

@Repository
public interface UserRepository extends JpaRepository<TUsers,Long> {
    
}
