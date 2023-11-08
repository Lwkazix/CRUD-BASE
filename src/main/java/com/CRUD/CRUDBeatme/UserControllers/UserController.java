package com.CRUD.CRUDBeatme.UserControllers;


import com.CRUD.CRUDBeatme.UsersModels.UserModels;
import com.CRUD.CRUDBeatme.UsersServices.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@Controller
@RequestMapping(value = "")
public class UserController {

//    Injeção do service
    @Autowired
    private UserServices userServices;

//    metodo de encontrar usuarios
    @GetMapping(value = "/find")
    public String findUsers(UserModels userModels){
        userServices.findAll(userModels);
        return "";
    }
//metodo de postagem no banco
    @PostMapping(value = "/posting")
    public String saveUser(UserModels userModels){
        userServices.save(userModels);
        return "";
    }
//    metodo de consuatar dados no banco
    @GetMapping(value = "/queryFind")
    public String ifUsers(@PathVariable Integer id,@RequestBody  Model model){
        Optional<UserModels> users = userServices.getById(id);
        if (users.isPresent()){
            userServices.getById(id);
//            fazer algo aqui se usuario existir;
            return "";
        } else {
//            fazer algo aqui se usuario não existir.
            return "";
        }
    }
//    metodo de atualizar dados se quiser
    @PutMapping(value = "/queryUpdate")
    public String updateUsers(@PathVariable Integer id , UserModels userModels){
        Optional<UserModels> users = userServices.getById(id);
        if (users.isPresent()){
            userServices.save(userModels);
            //            fazer alterações nos dados do banco;
            return "";
        }else {
            //            não fazer alterações no banco caso existir.
            return "";
        }
    }
//    metodo de deletar dados do banco pelo id do usuario
    @GetMapping(value = "/deleteUserById")
    public String deleteUserById(Integer id){
        userServices.deleteUserById(id);
        return "";
    }
}
