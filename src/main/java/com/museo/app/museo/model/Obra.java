package com.museo.app.museo.model;

import jakarta.persistence.*;


@NamedStoredProcedureQuery(
        name = "Obra.obras_por_tipo",
        procedureName = "obras_por_tipo",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "tipo_param", type = String.class)
        },
        resultClasses = Obra.class
)

@Entity
@Table(name = "obra")
public class Obra {

    @Id
    @Column(name = "ob_id")
    private int id;

    @Column(name = "ob_nombre")
    private String nombre;

    @Column(name = "ob_tipo")
    private String tipo;

    @Column(name = "ob_costo")
    private float costo;

    @Column(name = "ob_ex_id")
    private int exposicionId;






    // Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public int getExposicionId() {
        return exposicionId;
    }

    public void setExposicionId(int exposicionId) {
        this.exposicionId = exposicionId;
    }
}

