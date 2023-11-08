package com.CRUD.CRUDBeatme.UserControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class HomeController {

//    pagina principal do site exemplo: HOME PAGE
    @GetMapping
    public String user(){
//        endereço do redirect:/index
        return "";
    }
}
