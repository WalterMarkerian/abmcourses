package com.abmcursos.abmcursos.models;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tusers")
@EntityListeners(AuditingEntityListener.class)
public class TUsers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "El nombre es requerido")
    private String FirstName;
    @NotBlank(message = "El apellido es requerido")
    private String LastName;
    @CreatedDate
    private Date LastLogin;
    private Boolean IsActive;
    @NotBlank(message = "El usuario es requerido")
    private String UserName;
    @Pattern(regexp = "^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"
    ,message = "Ingrese un correo electrónico válido")
    @Email(message = "Ingrese un correo electronico valido")
    @NotEmpty(message = "El email es requerido")
    private String Email;
    @Size(min = 6, max = 20, message = "El password debe contener entre 6 y 20 caracteres")
    @NotEmpty(message = "El password es requerido")
    private String Password;
    private Boolean IsSuperUser;

    public TUsers(){}
    
    public TUsers(Long id, @NotBlank(message = "El nombre es requerido") String firstName,
            @NotBlank(message = "El apellido es requerido") String lastName, Date lastLogin, Boolean isActive,
            @NotBlank(message = "El usuario es requerido") String userName,
            @Pattern(regexp = "^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", message = "Ingrese un correo electrónico válido") @jakarta.validation.constraints.Email(message = "Ingrese un correo electronico valido") @NotEmpty(message = "El email es requerido") String email,
            @Size(min = 6, max = 20, message = "El password debe contener entre 6 y 20 caracteres") @NotEmpty(message = "El password es requerido") String password,
            Boolean isSuperUser) {
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
        LastLogin = lastLogin;
        IsActive = isActive;
        UserName = userName;
        Email = email;
        Password = password;
        IsSuperUser = isSuperUser;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFirstName() {
        return FirstName;
    }
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }
    public String getLastName() {
        return LastName;
    }
    public void setLastName(String lastName) {
        LastName = lastName;
    }
    public Date getLastLogin() {
        return LastLogin;
    }
    public void setLastLogin(Date lastLogin) {
        LastLogin = lastLogin;
    }
    public Boolean getIsActive() {
        return IsActive;
    }
    public void setIsActive(Boolean isActive) {
        IsActive = isActive;
    }
    public String getUserName() {
        return UserName;
    }
    public void setUserName(String userName) {
        UserName = userName;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        Password = password;
    }
    public Boolean getIsSuperUser() {
        return IsSuperUser;
    }
    public void setIsSuperUser(Boolean isSuperUser) {
        IsSuperUser = isSuperUser;
    }
   

    
}
