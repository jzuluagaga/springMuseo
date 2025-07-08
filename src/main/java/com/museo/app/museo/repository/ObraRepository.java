package com.museo.app.museo.repository;

import com.museo.app.museo.model.Obra;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.query.Procedure;


import java.util.List;
@Repository
public interface ObraRepository extends JpaRepository<Obra, Integer> {



    // llamamos el procedure
    @Procedure(name = "Obra.obras_por_tipo")
    List<Obra> obtenerObrasPorTipo(@Param("tipo_param") String tipo);
}
