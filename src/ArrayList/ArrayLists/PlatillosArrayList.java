/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList.ArrayLists;

import ArrayList.ClasesArrayList.Platillo;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class PlatillosArrayList {
    
    private String archivo = "db/platillos.txt";

    public List<Platillo> platillosList = new ArrayList<>();

    public PlatillosArrayList() {
        cargarPlatillos();
    }
    
    

    // Método para agregar un platillo al menú
    public void agregarPlatillo(Platillo platillo) {
        platillosList.add(platillo);
        guardarPlatillos();
    }
    
//    public void mostrarTodosLosPlatillos (){
//        System.out.println("platillos");
//        for (Platillo platillo : platillosList){
//            System.out.println(platillo.toString());
//            System.out.println();
//        }
//    }
    
    public List<Platillo> getTodosLosPlatillos() {
        return platillosList;
    }

    // Método para buscar un platillo por su id
    public Platillo buscarPlatillo(int id) {
        for (Platillo platillo : platillosList) {
            if (platillo.getIdPlatillo() == id) {
                return platillo;
            }
        }
        return null; // Retorna null si no se encuentra el platillo
    }

    // Método para actualizar un platillo por su id
    public void actualizarPlatillo(int id, Platillo nuevoPlatillo) {
        Platillo platillo = buscarPlatillo(id);
        if (platillo != null) {
            platillo.setNombre(nuevoPlatillo.getNombre());
            platillo.setPrecio(nuevoPlatillo.getPrecio());
            
            eliminarPlatillo(id);
            agregarPlatillo(platillo);
            
            guardarPlatillos();
        } else {
            System.out.println("Platillo no encontrado.");
        }
    }

    // Método para eliminar un platillo por su id
    public void eliminarPlatillo(int id) {
        Platillo platillo = buscarPlatillo(id);
        if (platillo != null) {
            platillosList.remove(platillo);
            System.out.println("Platillo eliminado: " + platillo);
            
            guardarPlatillos();
        } else {
            System.out.println("Platillo no encontrado.");
        }
    }
    
    
    
    
    private void guardarPlatillos() {
        try {
            FileOutputStream fileOut = new FileOutputStream(archivo);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(platillosList);
            objectOut.close();
            fileOut.close();
//            System.out.println("Datos de platillos guardados en " + archivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void cargarPlatillos() {
        try {
            FileInputStream fileIn = new FileInputStream(archivo);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            platillosList = (ArrayList<Platillo>) objectIn.readObject();
            objectIn.close();
            fileIn.close();
//            System.out.println("Datos de platillos cargados desde " + archivo);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    
    

//    // Método para eliminar un platillo del menú por su id
//    public void eliminarPlatillo(int idPlatillo) {
//        for (Platillo platillo : platillosList) {
//            if (platillo.getIdPlatillo() == idPlatillo) {
//                platillosList.remove(platillo);
//                return; // Salir del bucle una vez eliminado
//            }
//        }
//        System.out.println("No se encontró un platillo con el ID proporcionado.");
//    }
    // Método para imprimir el menú
//    public void imprimirMenu() {
//        System.out.println("Menú:");
//        for (Platillo platillo : platillosList) {
//            System.out.println(platillo);
//        }
//    }

}
