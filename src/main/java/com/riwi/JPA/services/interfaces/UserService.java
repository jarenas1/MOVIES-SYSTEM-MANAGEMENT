package com.riwi.JPA.services.interfaces;

import com.riwi.JPA.entities.UserEntity;
import com.riwi.JPA.services.CRUD.Archive;
import com.riwi.JPA.services.CRUD.ReadAll;
import com.riwi.JPA.services.CRUD.ReadById;
import com.riwi.JPA.services.CRUD.Save;
import org.apache.catalina.User;

public interface UserService extends Save<UserEntity>, ReadById<UserEntity, String>, ReadAll<UserEntity>, Archive<String> {


}
