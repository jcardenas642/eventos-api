/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unab.sebca.eventosapi.modelos;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author sebca
 */

@Entity
@Table(name = "salones")
public class Salon implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "precio")
    private double precio;
    
    @Column(name = "cantidad_meseros")
    private int cantidadMeseros;
    
    @Column(name = "extra_mesero")
    private double extraMesero;
    
    @Column(name = "plato")
    private double plato;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadMeseros() {
        return cantidadMeseros;
    }

    public void setCantidadMeseros(int cantidadMeseros) {
        this.cantidadMeseros = cantidadMeseros;
    }

    public double getExtraMesero() {
        return extraMesero;
    }

    public void setExtraMesero(double extraMesero) {
        this.extraMesero = extraMesero;
    }

    public double getPlato() {
        return plato;
    }

    public void setPlato(double plato) {
        this.plato = plato;
    }
    
    
    
    
    
}
