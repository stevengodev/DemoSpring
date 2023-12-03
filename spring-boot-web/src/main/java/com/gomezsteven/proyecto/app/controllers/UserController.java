package com.gomezsteven.proyecto.app.controllers;


import com.gomezsteven.proyecto.app.models.Usuario;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/usuarios")
public class UserController {

    @Value("${texto.usercontroller.consultar.nombres}")
    private String nombres;

    @Value("${texto.usercontroller.consultar.apellidos}")
    private String apellidos;

    @Value("${texto.usercontroller.consultar.correo}")
    private String correo;

    @GetMapping("/consultar")
    public String verUsuarios(Model model){
        Usuario usuario = new Usuario();
        usuario.setNombres(nombres);
        usuario.setApellidos(apellidos);
        usuario.setCorreo(correo);
        model.addAttribute("usuario", usuario);
        return "perfil";
    }

    @GetMapping("/listar")
    public String listarUsuarios(Model model){
        /*

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Steven", "Gomez", "steven@gmail.com"));
        usuarios.add(new Usuario("Leonardo", "Lazaro", "leo@gmail.com"));
        usuarios.add(new Usuario("Maria", "Lucia", "maria@gmail.com"));
        model.addAttribute("usuarios", usuarios);

         */
        return "listaUsuarios";
    }

    //Esta lista va a estar disponible en todos los metodos de aqui
    @ModelAttribute("usuarios")
    public List<Usuario> obtenerUsuarios(){

        List<Usuario> usuarios = Arrays.asList(new Usuario("Steven", "Gomez", "steven@gmail.com"),
                                    new Usuario("Leonardo", "Lazaro", "leo@gmail.com"),
                                    new Usuario("Maria", "Lucia", "maria@gmail.com"));
        return usuarios;
    }

}
