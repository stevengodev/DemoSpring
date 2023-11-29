package com.gomezsteven.proyecto.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SearchController {

    @GetMapping({"/buscarPersona", "/buscarEmpleado"})
    public ModelAndView searchEmployee(ModelAndView mv){
        mv.addObject("empleado", "Maria Lucia");
        mv.setViewName("buscarEmpleado");
        return mv;
    }


    @GetMapping("/mostrarContacto")
    public String showContact(ModelMap model){
        model.addAttribute("nombres", "Steven David");
        model.addAttribute("apellidos", "Gomez Foliaco");
        model.addAttribute("telefono", "3218146258");
        return "contacto";
    }



}
