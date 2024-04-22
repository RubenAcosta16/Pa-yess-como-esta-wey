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
public class Platillos_Ingredientes implements Serializable {

    private int idPlatillo;
    private int idIngrediente;
    private double  cantidad;

    public Platillos_Ingredientes() {
    }

    public Platillos_Ingredientes(int idPlatillo, int idIngrediente, double cantidad) {
        this.idPlatillo = verificarNumero(idPlatillo);
        this.idIngrediente =verificarNumero (idIngrediente);
        this.cantidad = verificarNumeroNegativo(cantidad);
    }

    public int getIdPlatillo() {
        return idPlatillo;
    }

//    public void setIdPlatillo(int idPlatillo) {
//        this.idPlatillo = idPlatillo;
//    }

    public int getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = verificarNumero(idIngrediente);
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = verificarNumeroNegativo(cantidad);
    }

    @Override
    public String toString() {
        return " idPlatillo: " + idPlatillo + "\n"
                + "idIngrediente: " + idIngrediente + "\n"
                + "cantidad" + "\n";
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
