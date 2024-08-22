package com.riwi.JPA.services.Implementations;

import com.riwi.JPA.entities.UserEntity;
import com.riwi.JPA.repositories.UserRepository;
import com.riwi.JPA.services.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserImp implements UserService {

    //INYECTAMOS REPOSITORY PARA ACCEDER A LOS METODOS
    @Autowired
    UserRepository userRepository;

    @Override
    public void archive(String s) {

    }

    @Override
    public List<UserEntity> readAll() {
        return List.of();
    }

    @Override
    public UserEntity readById(String s) {
        return null;
    }

    @Override
    public UserEntity save(UserEntity userEntity) {
        //TENEMOS EL METODO SAVE QUE GUARDA, Y SI NO SE LE PASA UN ID ACTUALIZA, POR ENDE NO TOCA HACER VERIFICACIONES DE SI ESTAMOS EN EL METODO DE ACTUALIZAR O CREAR
            return userRepository.save(userEntity);
    }
}
