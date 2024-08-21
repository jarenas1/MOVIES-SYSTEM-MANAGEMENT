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
}
