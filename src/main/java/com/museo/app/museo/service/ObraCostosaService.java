package com.museo.app.museo.service;

import com.museo.app.museo.model.ObraCostosa;
import com.museo.app.museo.repository.ObraCostosaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObraCostosaService {

    @Autowired
    private ObraCostosaRepository repository;

    public List<ObraCostosa> listarObrasCostosas() {
        return repository.findAll();
    }
}

