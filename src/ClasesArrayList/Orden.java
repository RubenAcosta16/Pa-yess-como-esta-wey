/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesArrayList;

import Excepciones.FechaException;
import Excepciones.NumException;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

/**
 *
 * @author hp
 */
public class Orden implements Serializable{

    private int idOrden;
    private int idPlatillo;
    private int idReservacion;
    private int cantidad;
    private LocalDate fecha;

    public Orden() {
    }

    public Orden(int idOrden, int idPlatillo, int idReservacion, int cantidad, String fecha) {
        this.idOrden =verificarNumero( idOrden);
        this.idPlatillo = verificarNumero(idPlatillo);
        this.idReservacion = verificarNumeroNegativo(idReservacion);
        this.cantidad = verificarNumero(cantidad);
        

        LocalDate fechaConvertida = convertirStringALocalDate(fecha, "dd/MM/yyyy");
        
        this.fecha = fechaConvertida;
    }

    public int getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(int idReservacion) {
        this.idReservacion = verificarNumeroNegativo(idReservacion);
    }


    

    public int getIdOrden() {
        return idOrden;
    }

//    public void setIdOrden(int idOrden) {
//        this.idOrden = idOrden;
//    }
    public int getIdPlatillo() {
        return verificarNumero(idPlatillo);
    }

    public void setIdPlatillo(int idPlatillo) {
        this.idPlatillo = idPlatillo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = verificarNumero(cantidad);
    }

    public String getFecha() {
        
          DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Formatear el LocalDate a String
        String fechaComoString = fecha.format(formateador);
        return fechaComoString;
    }

    // Setter para la fecha
    public void setFecha(String fecha) {
        LocalDate fechaConvertida = convertirStringALocalDate(fecha, "dd/MM/yyyy");
        
        this.fecha = fechaConvertida;
    }

    @Override
    public String toString() {
        return "Orden{"
                + "idOrden=" + idOrden
                + ", idPlatillo='" + idPlatillo + '\''
                + ", idReservacion='" + idReservacion + '\''
                + ", cantidad=" + cantidad
                + ", fecha =" + getFecha()
                + '}';
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
