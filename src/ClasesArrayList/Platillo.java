/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesArrayList;

import Excepciones.NumException;
import java.io.Serializable;

/**
 *
 * @author hp
 */
public class Platillo implements Serializable{

    private int idPlatillo;
    private String nombre;
    private double precio;
    private String img;
    private String descripcion;

    public Platillo() {
    }

    public Platillo(int idPlatillo, String nombre, double precio, String img, String descripcion) {
        
        this.idPlatillo = verificarNumero(idPlatillo);
        this.nombre = nombre;
        this.precio = verificarNumero(precio);
        this.img = img;
        this.descripcion = descripcion;
    }

    public int getIdPlatillo() {
        return idPlatillo;
    }

//    public void setIdPlatillo(int idPlatillo) {
//        this.idPlatillo = idPlatillo;
//    }
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
        this.precio = verificarNumero(precio);
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Platillo{"
                + "idPlatillo=" + idPlatillo + "\n"
                + ", nombre='" + nombre +"\n"
                + ", precio=" + precio+"\n"
                + ", descripcion=" + descripcion
                + '}';
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

}
