/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesArrayList;

import Excepciones.FechaException;
import Excepciones.NumException;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 *
 * @author 1511r
 */
public class Reservacion implements Serializable{

    private int idReservacion;
    private int numMesa;
    private LocalDate fecha;
    private LocalTime hora;

    public Reservacion() {
    }

    public Reservacion(int idReservacion, int numMesa, String fecha, String hora) {
        this.idReservacion =verificarNumero( idReservacion);
        this.numMesa = verificarNumero(numMesa);
        
        LocalTime horaConvertida = convertirStringALocalTime(hora, "HH:mm:ss");
        this.hora = horaConvertida;
        
        LocalDate fechaConvertida = convertirStringALocalDate(fecha, "dd/MM/yyyy");
        
        this.fecha = fechaConvertida;
    }

    public String getHora() {
         DateTimeFormatter formateador = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaComoString2 = hora.format(formateador);
        
        return horaComoString2;
    }

    public void setHora(String hora) {
       LocalTime horaConvertida = convertirStringALocalTime(hora, "HH:mm:ss");
        this.hora = horaConvertida;
    }



    public int getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(int idReservacion) {
        this.idReservacion = idReservacion;
    }

    public int getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(int numMesa) {
       this.numMesa = verificarNumero(numMesa);
    }

    public String getFecha() {
        
          DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Formatear el LocalDate a String
        String fechaComoString = fecha.format(formateador);
        return fechaComoString;
    }

    public void setFecha(String fecha) {
        LocalDate fechaConvertida = convertirStringALocalDate(fecha, "dd/MM/yyyy");
        
        this.fecha = fechaConvertida;
    }

    @Override
    public String toString() {
        return "Platillo{"
                + "idReservacion=" + idReservacion + "\n"
                + ", numero de mesa=" + numMesa + "\n"
                + ", fecha='" + getFecha() + "\n"
                + ", hora='" + getHora() + "\n"
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
    
    
    private LocalTime convertirStringALocalTime(String horaEnString, String formato) {
        try {
            DateTimeFormatter formateador = DateTimeFormatter.ofPattern(formato);
            return LocalTime.parse(horaEnString, formateador);
        } catch (DateTimeParseException e) {
            throw new FechaException(e.getMessage());
        }
    }

}
