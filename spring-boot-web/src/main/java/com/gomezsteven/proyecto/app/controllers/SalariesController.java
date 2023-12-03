package com.gomezsteven.proyecto.app.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/salario")
public class SalariesController {

    @GetMapping("/verSalario")
    public String salariosParametrizados(@RequestParam(defaultValue = "No se proporciono ningun valor", required = false) String salario, Model model){
        model.addAttribute("salario", salario);
        return "parameters/verSalario";
    }

    @GetMapping("/verSalarioHttpRequest")
    public String salariosParametrizadosConHttp(HttpServletRequest request, Model model){
        String salario = request.getParameter("salario");
        model.addAttribute("salario", salario);
        return "parameters/verSalario";
    }

    @GetMapping("/verSalarioMasComision")
    public String salariosMasComision(@RequestParam String salario, @RequestParam Integer comision, Model model){
        model.addAttribute("salario", salario);
        model.addAttribute("comision", comision);
        return "parameters/verSalario";
    }

    @GetMapping("/")
    public String seleccionarSalario(){
        return "parameters/seleccionarSalario";
    }

}
