package com.museo.app.museo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "museo")
public class Museo {

    @Id
    private int mu_id;
    private String mu_nombre;

    // Getters y Setters
    public int getMu_id() {
        return mu_id;
    }

    public void setMu_id(int mu_id) {
        this.mu_id = mu_id;
    }

    public String getMu_nombre() {
        return mu_nombre;
    }

    public void setMu_nombre(String mu_nombre) {
        this.mu_nombre = mu_nombre;
    }
}

