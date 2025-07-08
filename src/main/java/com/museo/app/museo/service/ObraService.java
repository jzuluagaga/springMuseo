package com.museo.app.museo.service;

import com.museo.app.museo.model.Obra;
import com.museo.app.museo.repository.ObraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ObraService {

    @Autowired
    private ObraRepository obraRepository;


    @Transactional
    public List<Obra> obtenerObrasPorTipo(String tipo) {
        return obraRepository.obtenerObrasPorTipo(tipo);
    }

    public List<Obra> findAll() {
        return obraRepository.findAll();
    }

    public Obra findById(int id) {
        return obraRepository.findById(id).orElse(null);
    }

    public Obra save(Obra obra) {
        return obraRepository.save(obra);
    }

    public void delete(int id) {
        obraRepository.deleteById(id);
    }
}

