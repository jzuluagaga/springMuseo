package com.museo.app.museo.controller;

import com.museo.app.museo.model.Obra;
import com.museo.app.museo.service.ObraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ObraController {

    @Autowired
    private ObraService obraService;

    @GetMapping("/obras/por-tipo")
    public String mostrarFormulario() {
        return "formulario-obras"; // obras/por-tipo spring busca archivo formulario-obras
    }

    @GetMapping("/obras")
    public String mostrarObras(Model model) {
        List<Obra> obras = obraService.findAll(); //llamo metodo que me da todas las obras
        model.addAttribute("obras", obras);
        return "obras";
    }

    @PostMapping("/obras/resultado")
    public String mostrarObrasPorTipo(@RequestParam("tipo") String tipo, Model model) {
        List<Obra> obras = obraService.obtenerObrasPorTipo(tipo); // llamo metodo que me da obras por tipo
        model.addAttribute("tipo", tipo);
        model.addAttribute("obras", obras);
        return "obras-filtradas";
    }
}


