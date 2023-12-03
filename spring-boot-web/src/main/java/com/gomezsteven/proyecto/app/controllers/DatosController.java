package com.gomezsteven.proyecto.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class DatosController
{

    @GetMapping("/path/{texto}")
    public String datosConPath(@PathVariable String texto, Model model){
        model.addAttribute("resultado", texto);
        return "variable/verDatos";
    }

    @GetMapping("/path/{texto}/{texto2}")
    public String datosConVariosPath(@PathVariable String texto, @PathVariable Integer texto2,Model model){
        model.addAttribute("resultado", texto + " Numero = '" + texto2 + " ' " );
        return "variable/verDatos";
    }

}
