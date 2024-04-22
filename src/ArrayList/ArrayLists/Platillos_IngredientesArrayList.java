/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList.ArrayLists;




import ArrayList.ClasesArrayList.Ingrediente;
import ArrayList.ClasesArrayList.Platillos_Ingredientes;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author 1511r
 */
public class Platillos_IngredientesArrayList {

    private String archivo = "db/platillos_ingredientes.txt";

    public List<Platillos_Ingredientes> platillos_IngredientesList = new ArrayList<>();
    
            IngredientesArrayList ingredientesListNOCONFUNDIR=new IngredientesArrayList();



    //---------------------------------------------------------------------------------------------
    public Platillos_IngredientesArrayList() {
        cargarPlatillos_Ingredientes();
    }

    // Método para agregar un platillo al menú
    public void agregarPlatillos_Ingredientes(Platillos_Ingredientes platillos_Ingredientes) {
        platillos_IngredientesList.add(platillos_Ingredientes);
        guardarPlatillos_Ingredientes();
    }

    public List<Platillos_Ingredientes> getTodasLasPlatillos_Ingredientes() {
        return platillos_IngredientesList;
    }
    
    public List<Ingrediente> getIngredientesDelPlatillo(int idPlatillo) {
        List<Ingrediente> ingredientesDelPlatillo = new ArrayList<>();
        
        for (Platillos_Ingredientes platillo_Ingrediente : platillos_IngredientesList) {
            if (platillo_Ingrediente.getIdPlatillo()== idPlatillo) {

                ingredientesDelPlatillo.add(ingredientesListNOCONFUNDIR.buscarIngrediente(platillo_Ingrediente.getIdIngrediente()));

            }
        }

        return ingredientesDelPlatillo;

    }
       
    
    
    
    
    
    
    
    
    
    
     // Método para buscar un platillo por su id
    public List<Platillos_Ingredientes> buscarTodaslasPlatillos_IngredientesPorId(int idPlatillos_IngredientesBuscar) {
        List<Platillos_Ingredientes> platillos_IngredientesEncontrados = new ArrayList<>();
        
        for (Platillos_Ingredientes platillos_Ingredientes : platillos_IngredientesEncontrados) {
            if (platillos_Ingredientes.getIdPlatillo()== idPlatillos_IngredientesBuscar) {
                platillos_IngredientesEncontrados.add(platillos_Ingredientes);
            }
        }
        return platillos_IngredientesEncontrados;
    }

    // Método para actualizar un platillo por su id
    public void actualizarPlatillos_Ingredientes(int idPlatilloBuscar, int nuevoIdPlatillo, int nuevaCantidad) {
        List<Platillos_Ingredientes> platillos_IngredientesEncontradas = buscarTodaslasPlatillos_IngredientesPorId(idPlatilloBuscar);
        for (Platillos_Ingredientes platillos_Ingredientes : platillos_IngredientesEncontradas) {

            if (platillos_Ingredientes.getIdPlatillo() == idPlatilloBuscar) {
                platillos_Ingredientes.setIdIngrediente(nuevoIdPlatillo);
                platillos_Ingredientes.setCantidad(nuevaCantidad);
                
                
                
                guardarPlatillos_Ingredientes();
            }
        }
    }

    // Método para eliminar un platillo del menú por su id
    public void eliminarPlatillos_Ingredientes(int idPlatilloBuscar) {
        Iterator<Platillos_Ingredientes> iterator = platillos_IngredientesList.iterator();
        while (iterator.hasNext()) {
            Platillos_Ingredientes platillos_Ingredientes = iterator.next();
            if (platillos_Ingredientes.getIdPlatillo() == idPlatilloBuscar) {
                iterator.remove();
                guardarPlatillos_Ingredientes();
            }
        }
    }

    
    
    
    
    
    
    
    
    
    

    private void guardarPlatillos_Ingredientes() {
        try {
            FileOutputStream fileOut = new FileOutputStream(archivo);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(platillos_IngredientesList);
            objectOut.close();
            fileOut.close();
//            System.out.println("Datos de platillos guardados en " + archivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void cargarPlatillos_Ingredientes() {
        try {
            FileInputStream fileIn = new FileInputStream(archivo);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            platillos_IngredientesList = (ArrayList<Platillos_Ingredientes>) objectIn.readObject();
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
}
