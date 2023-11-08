package com.CRUD.CRUDBeatme.UsersServices;

import com.CRUD.CRUDBeatme.UsersModels.UserModels;
import com.CRUD.CRUDBeatme.UsersRepositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {
//    injeção do repository
    @Autowired
    private UserRepository userRepository;

//    metodo criado de postar o banco
    public UserModels save(UserModels userModels){
        return userRepository.save(userModels);
    }
//    metodo criado de encontrar todos os usuarios
    public List<UserModels> findAll(UserModels userModels){
        return userRepository.findAll();
    }
//    metodo criado de encontrar pelo id do usuario
    public Optional<UserModels> getById(Integer id){
        return userRepository.findById(id);
    }
//    metodo criado de deletar pelo id do usuario
    public void deleteUserById(Integer id){
        userRepository.deleteById(id);
    }
}
