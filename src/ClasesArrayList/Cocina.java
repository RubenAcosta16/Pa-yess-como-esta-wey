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

/**
 *
 * @author hp
 */
public class Cocina implements Serializable{
    private int idCocina;
    private int idOrden;
    private String statusProceso;
    private String revision;

    public Cocina() {
    }

    public Cocina(int idCocina, int idOrden, String statusProceso, String revision) {
        this.idCocina = verificarNumero(idCocina);
        this.idOrden = verificarNumero(idOrden);
        this.statusProceso = statusProceso;
        this.revision = revision;
    }

    public int getIdCocina() {
        return idCocina;
    }

    public void setIdCocina(int idCocina) {
        this.idCocina = idCocina;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = verificarNumero(idOrden);
    }

    public String getStatusProceso() {
        return statusProceso;
    }

    public void setStatusProceso(String statusProceso) {
        this.statusProceso = statusProceso;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

        @Override
    public String toString() {
        return "Orden{"
                + "idCocina=" + idCocina
                + "idOrden=" + idOrden
                + ", Status Proceso='" + statusProceso + '\''
                + ", Revision=" + revision
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
    
    

    
}
