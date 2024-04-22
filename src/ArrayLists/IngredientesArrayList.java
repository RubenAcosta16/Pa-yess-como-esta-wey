/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayLists;

import java.util.ArrayList;
import java.util.List;
import ClasesArrayList.Ingrediente;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author 1511r
 */
public class IngredientesArrayList {

    private String archivo = "db/ingredientes.txt";

    public List<Ingrediente> ingredientesList = new ArrayList<>();

    public IngredientesArrayList() {
        cargarIngredientes();
    }

    // Método para agregar un platillo al menú
    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientesList.add(ingrediente);
        guardarIngredientes();
    }

    public List<Ingrediente> getTodosLosIngredientes() {
        return ingredientesList;
    }

    // Método para buscar un platillo por su id
    public Ingrediente buscarIngrediente(int id) {
        for (Ingrediente ingrediente : ingredientesList) {
            if (ingrediente.getIdIngrediente() == id) {
                return ingrediente;
            }
        }
        return null; // Retorna null si no se encuentra el platillo
    }

    // Método para actualizar un platillo por su id
    public void actualizarIngrediente(int id, Ingrediente nuevoIngrediente) {
        Ingrediente ingrediente = buscarIngrediente(id);
        if (ingrediente != null) {
            ingrediente.setNombre(nuevoIngrediente.getNombre());
            ingrediente.setUnidadTipo(nuevoIngrediente.getUnidadTipo());
            ingrediente.setPrecio(nuevoIngrediente.getPrecio());
            ingrediente.setPuntoReorden(nuevoIngrediente.getPuntoReorden());
            ingrediente.setProveedor(nuevoIngrediente.getProveedor());
            ingrediente.setCantidad(nuevoIngrediente.getCantidad());

            eliminarIngrediente(id);
            agregarIngrediente(ingrediente);

            guardarIngredientes();
        } else {
            System.out.println("Platillo no encontrado.");
        }
    }

    // Método para eliminar un platillo por su id
    public void eliminarIngrediente(int id) {
        Ingrediente ingrediente = buscarIngrediente(id);
        if (ingrediente != null) {
            ingredientesList.remove(ingrediente);
            System.out.println("Platillo eliminado: " + ingrediente);

            guardarIngredientes();
        } else {
            System.out.println("Platillo no encontrado.");
        }
    }

    private void guardarIngredientes() {
        try {
            FileOutputStream fileOut = new FileOutputStream(archivo);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(ingredientesList);
            objectOut.close();
            fileOut.close();
//            System.out.println("Datos de platillos guardados en " + archivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void cargarIngredientes() {
        try {
            FileInputStream fileIn = new FileInputStream(archivo);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            ingredientesList = (ArrayList<Ingrediente>) objectIn.readObject();
            objectIn.close();
            fileIn.close();
//            System.out.println("Datos de platillos cargados desde " + archivo);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
