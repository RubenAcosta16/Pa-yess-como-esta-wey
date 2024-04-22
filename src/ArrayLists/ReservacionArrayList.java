/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayLists;

import ClasesArrayList.Reservacion;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1511r
 */
public class ReservacionArrayList {

    private String archivo = "db/reservacion.txt";

    public List<Reservacion> reservacionList = new ArrayList<>();

    public ReservacionArrayList() {
        cargarReservaciones();
    }

    // Método para agregar un platillo al menú
    public void agregarReservacion(Reservacion reservacion) {
        reservacionList.add(reservacion);
        guardarReservaciones();
    }

    public List<Reservacion> getTodosLasReservaciones() {
        return reservacionList;
    }

    // Método para buscar un platillo por su id
    public Reservacion buscarReservacion(int id) {
        for (Reservacion reservacion : reservacionList) {
            if (reservacion.getIdReservacion() == id) {
                return reservacion;
            }
        }
        return null; // Retorna null si no se encuentra el platillo
    }

    // Método para actualizar un platillo por su id
    public void actualizarReservacion(int id, Reservacion nuevaReservacion) {
        Reservacion reservacion = buscarReservacion(id);
        if (reservacion != null) {
            reservacion.setFecha(nuevaReservacion.getFecha());
            reservacion.setNumMesa(nuevaReservacion.getNumMesa());
            reservacion.setHora(nuevaReservacion.getHora());

            eliminarReservacion(id);
            agregarReservacion(reservacion);

            guardarReservaciones();
        } else {
            System.out.println("Platillo no encontrado.");
        }
    }

    // Método para eliminar un platillo por su id
    public void eliminarReservacion(int id) {
        Reservacion reservacion = buscarReservacion(id);
        if (reservacion != null) {
            reservacionList.remove(reservacion);
            System.out.println("Platillo eliminado: " + reservacion);

            guardarReservaciones();
        } else {
            System.out.println("Reservacion no encontrado.");
        }
    }

    private void guardarReservaciones() {
        try {
            FileOutputStream fileOut = new FileOutputStream(archivo);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(reservacionList);
            objectOut.close();
            fileOut.close();
//            System.out.println("Datos de platillos guardados en " + archivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void cargarReservaciones() {
        try {
            FileInputStream fileIn = new FileInputStream(archivo);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            reservacionList = (ArrayList<Reservacion>) objectIn.readObject();
            objectIn.close();
            fileIn.close();
//            System.out.println("Datos de platillos cargados desde " + archivo);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
