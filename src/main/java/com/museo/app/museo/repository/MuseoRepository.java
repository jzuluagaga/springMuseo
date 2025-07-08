package com.museo.app.museo.repository;

import com.museo.app.museo.model.Museo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MuseoRepository extends JpaRepository<Museo, Integer> {
}

