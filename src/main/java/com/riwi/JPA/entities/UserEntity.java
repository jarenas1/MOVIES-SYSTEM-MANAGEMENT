package com.riwi.JPA.entities;

import jakarta.persistence.*;

//INDICAMOS QUE ES UNA ENTIDAD
@Entity
@Table(name="user") //INDICAMOS EL NOMBRE DE LA TABLA Y QUE ES UNA ENTIDAD
public class UserEntity {

    //CREAMOS LOS ATRIBUTOS DE LA CLASE USER

    @Id //INDICAMOS QUE ESTE ES EL ID
    @GeneratedValue(strategy = GenerationType.UUID) //INDICAMOS QUE SE VA A AUTOGENERAR UN ID CON UUID
    private String id;
    private String name;
    private String email;
    private String password;

    //CREAMOS TODO YA QUE NO SE USO LOOMBOK


    public UserEntity() {
    }

    public UserEntity(String id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "email='" + email + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
