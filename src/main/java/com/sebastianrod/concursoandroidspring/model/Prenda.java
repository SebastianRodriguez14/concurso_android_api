package com.sebastianrod.concursoandroidspring.model;


import javax.persistence.*;

@Table(name = "prenda")
@Entity
public class Prenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer prenda_id;
    private String nombre;
    private Double precio;
    private Integer stock;
    private String url_tienda;
    private String url_imagen;
    @ManyToOne
    @JoinColumn(name = "marca_id", nullable = false)
    private Marca marca;

    public Prenda(Integer prenda_id, String nombre, Double precio, Integer stock, String url_tienda, String url_imagen, Marca marca) {
        this.prenda_id = prenda_id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.url_tienda = url_tienda;
        this.url_imagen = url_imagen;
        this.marca = marca;
    }

    public Prenda() {
    }

    public Integer getPrenda_id() {
        return prenda_id;
    }

    public void setPrenda_id(Integer prenda_id) {
        this.prenda_id = prenda_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getUrl_tienda() {
        return url_tienda;
    }

    public void setUrl_tienda(String url_tienda) {
        this.url_tienda = url_tienda;
    }

    public String getUrl_imagen() {
        return url_imagen;
    }

    public void setUrl_imagen(String url_imagen) {
        this.url_imagen = url_imagen;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}
