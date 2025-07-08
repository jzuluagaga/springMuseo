package com.museo.app.museo.controller;

import com.museo.app.museo.model.Museo;
import com.museo.app.museo.repository.MuseoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MuseoController {

    @Autowired
    private MuseoRepository museoRepository;

    @GetMapping("/museos")
    public String listarMuseos(Model model) {
        List<Museo> museos = museoRepository.findAll();
        model.addAttribute("museos", museos);
        return "museos"; // Nombre del HTML en /templates
    }
}

