package com.museo.app.museo.repository;

import com.museo.app.museo.model.ObraCostosa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObraCostosaRepository extends JpaRepository<ObraCostosa, Integer> {
    // Nada extra: Spring ya sabe cómo mapear la vista
}

