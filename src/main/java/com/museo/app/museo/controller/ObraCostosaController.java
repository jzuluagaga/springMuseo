package com.museo.app.museo.controller;

import com.museo.app.museo.service.ObraCostosaService;
import com.museo.app.museo.model.ObraCostosa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ObraCostosaController {

    @Autowired
    private ObraCostosaService service;

    @GetMapping("/obras/costosas")
    public String mostrarObrasCostosas(Model model) {
        List<ObraCostosa> lista = service.listarObrasCostosas();
        model.addAttribute("obrasCostosas", lista);
        return "obras-costosas";
    }
}

