package com.gomezsteven.proyecto.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/redirigir")
public class RedirigirController {

    @GetMapping("/irIndex")
    public String irAlIndexConRedirect(){
        return "redirect:/usuarios/consultar";
    }

    @GetMapping("/irGoogle")
    public String irGoogle(){
        return "redirect:https://www.google.com/";
    }

    @GetMapping("/irIndexConForward")
    public String irAlIndexConForward(){
        return "forward:/usuarios/consultar";
    }
}
