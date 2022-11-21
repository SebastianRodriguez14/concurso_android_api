package com.sebastianrod.concursoandroidspring.model;


import javax.persistence.*;

@Table(name = "marca")
@Entity
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer marca_id;
    private String nombre;


    public Marca(Integer marca_id, String nombre) {
        this.marca_id = marca_id;
        this.nombre = nombre;
    }

    public Marca() {

    }

    public Integer getMarca_id() {
        return marca_id;
    }

    public void setMarca_id(Integer marca_id) {
        this.marca_id = marca_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
