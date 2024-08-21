package com.riwi.JPA.entities;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "purchase")
public class PurchaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date date;

    //CDEBEMOS ASEGURARNOS DE QUE EL ID SE LLAME ID, YA QUE EL PROGRAMA AUTOMATICAMENTE VA A HACER UNA FK CON ESTE

    @ManyToOne(fetch = FetchType.EAGER)//INDICAMS QUE VA A SER UNA RELACION DE MUCHOS A UNO, TENIENDO EN CUENTA QUE MUCHOS O LA PRTE INICIAL DE LA ANOTACION S DONDE ESTAMOS PARADOS
    private UserEntity userId; //INDICAMOS QUE VAMOS A TRABAJAR CON ESA CLASE(TABLA) Y EL AUTOMATICAMENTE INFIERE QUE SE DEBE RELACIONAR CON EL ID

    //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    @ManyToOne(fetch = FetchType.EAGER) //indicamos que va a hacer al momento de unir las tablas
    private MovieEntity movieId; //Decimos que id sera una instancia de movie entity, por ende va a deducir que tiene que ir a esta tabla a sacar la columna id

    //TODO ESTO NOS GENERA UNA RELACION DE UN SOLO LADO, SOLO PODEMOS TRAER COSAS DE LAS OTRAS TABLAS A ESTAS, PERO DE LAS OTRAS TABLAS NO PODEMOS LLAMAR NADA DE ESTA, PARA PODER HACER ESTO DEBEMOS............



    public PurchaseEntity() {
    }


    @Override
    public String toString() {
        return "PurchaseEntity{" +
                "date=" + date +
                ", id=" + id +
                ", userId='" + userId + '\'' +
                ", movieId='" + movieId + '\'' +
                '}';
    }
}
