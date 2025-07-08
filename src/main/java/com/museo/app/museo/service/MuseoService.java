package com.museo.app.museo.service;

import com.museo.app.museo.model.Museo;
import com.museo.app.museo.repository.MuseoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MuseoService {

    @Autowired
    private MuseoRepository museoRepository;

    public List<Museo> findAll() {
        return museoRepository.findAll();
    }

    public Museo findById(int id) {
        return museoRepository.findById(id).orElse(null);
    }

    public Museo save(Museo museo) {
        return museoRepository.save(museo);
    }

    public void delete(int id) {
        museoRepository.deleteById(id);
    }
}

