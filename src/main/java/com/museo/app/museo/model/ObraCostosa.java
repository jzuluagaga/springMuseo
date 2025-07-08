package com.museo.app.museo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.*;

@Entity
@Table(name = "vista_obras_costosas")  // Usa el nombre exacto de la vista
public class ObraCostosa {

    @Id
    @Column(name = "ob_id")
    private int id;

    @Column(name = "ob_nombre")
    private String nombre;

    @Column(name = "ob_tipo")
    private String tipo;

    @Column(name = "ob_costo")
    private float costo;

    // Getters y setters

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
}

