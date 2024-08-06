package com.edteam.curso.controlles;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("user")
public class userController {

    @RequestMapping(value = "/holamundo", method = RequestMethod.GET)
    String holamundo(){
        return "Hola Mundo";
    }


}



