/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList.ClasesArrayList;

import Excepciones.FechaException;
import Excepciones.NumException;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 *
 * @author hp
 */
public class Ingrediente implements Serializable{
    private int idIngrediente;
    private String nombre;
    private String unidadTipo;
    private double precio;
    private String puntoReorden;
    private String proveedor;

    public Ingrediente() {
    }

    public Ingrediente(int idIngrediente, String nombre, String unidadTipo, double precio, String puntoReorden, String proveedor) {
        this.idIngrediente = verificarNumero( idIngrediente);
        this.nombre = nombre;
        this.unidadTipo = unidadTipo;
        this.precio = verificarNumeroNegativo(precio);
        this.puntoReorden = puntoReorden;
        this.proveedor = proveedor;
    }

    public int getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidadTipo() {
        return unidadTipo;
    }

    public void setUnidadTipo(String unidadTipo) {
        this.unidadTipo = unidadTipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = verificarNumeroNegativo(precio);
    }

    public String getPuntoReorden() {
        return puntoReorden;
    }

    public void setPuntoReorden(String puntoReorden) {
        this.puntoReorden = puntoReorden;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    
    
    
     @Override
    public String toString() {
        return "Ingrediente{" +
                "nombre='" + nombre + '\'' +
                ", unidadTipo='" + unidadTipo + '\'' +
                ", precio=" + precio +
                ", puntoReorden='" + puntoReorden + '\'' +
                ", proveedor='" + proveedor + '\'' +
                '}';
    }
    
    private double verificarNumeroNegativo(double num) {
        if (num < 0) {
            throw new NumException("El número no debe ser negativo");
        }
        return num;
    }
    private int verificarNumeroNegativo(int num) {
        if (num < 0) {
            throw new NumException("El número no debe ser negativo");
        }
        return num;
    }
    
    private double verificarNumero(double num) {
        if (num <= 0) {
            throw new NumException("El número debe ser mayor que 0");
        }
        return num;
    }
    private int verificarNumero(int num) {
        if (num <= 0) {
            throw new NumException("El número debe ser mayor que 0");
        }
        return num;
    }
    
    
    
    private LocalDate convertirStringALocalDate(String fechaEnString, String formato) {
        try {
            DateTimeFormatter formateador = DateTimeFormatter.ofPattern(formato);
            return LocalDate.parse(fechaEnString, formateador);
        } catch (DateTimeParseException e) {
            throw new FechaException(e.getMessage());
          
        }
    }
}
