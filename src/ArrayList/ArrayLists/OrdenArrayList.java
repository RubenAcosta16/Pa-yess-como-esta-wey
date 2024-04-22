/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList.ArrayLists;

import ArrayList.ClasesArrayList.Orden;
import ArrayList.ClasesArrayList.Platillo;

//import ClasesArrayList.Platillo;
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
public class OrdenArrayList {

    private String archivo = "db/ordenes.txt";

    public List<Orden> ordenList = new ArrayList<>();

    private PlatillosArrayList platillosList = new PlatillosArrayList();

    //---------------------------------------------------------------------------------------------
    public OrdenArrayList() {
        cargarOrdenes();
    }

    // Método para agregar un platillo al menú
    public void agregarOrden(Orden orden) {
        ordenList.add(orden);
        guardarOrdenes();
    }

//    public void mostrarTodosLosPlatillos (){
//        System.out.println("platillos");
//        for (Platillo platillo : platillosList){
//            System.out.println(platillo.toString());
//            System.out.println();
//        }
//    }
    public List<Orden> getTodasLasOrdenes() {
        return ordenList;
    }
    
    public List<Platillo> getPlatillosDeLaOrden(int idOrden) {
        List<Platillo> platillosDeLaOrden = new ArrayList<>();
        for (Orden orden : ordenList) {
            if (orden.getIdOrden()== idOrden) {

                platillosDeLaOrden.add(platillosList.buscarPlatillo(orden.getIdPlatillo()));

            }
        }

        return platillosDeLaOrden;

    }
    
    
    
    
    
    
    
    
    
    
    
     // Método para buscar un platillo por su id
    public List<Orden> buscarTodaslasOrdenesPorId(int idOrdenBuscar) {
        List<Orden> ordenesEncontradas = new ArrayList<>();
        for (Orden orden : ordenList) {
            if (orden.getIdOrden() == idOrdenBuscar) {
                ordenesEncontradas.add(orden);
            }
        }
        return ordenesEncontradas;
    }

    // Método para actualizar un platillo por su id
    public void actualizarOrden(int idOrdenBuscar, int idPlatilloBuscar, Orden nuevaOrden) {
        List<Orden> ordenesEncontradas = buscarTodaslasOrdenesPorId(idOrdenBuscar);
        for (Orden orden : ordenesEncontradas) {

            if (orden.getIdPlatillo() == idPlatilloBuscar) {
                
                orden.setIdPlatillo(nuevaOrden.getIdPlatillo());
                orden.setIdReservacion(nuevaOrden.getIdReservacion());
                orden.setCantidad(nuevaOrden.getCantidad());
                
                guardarOrdenes();
            }
        }
    }

    // Método para eliminar un platillo del menú por su id
    public void eliminarOrden(int idOrdenBuscar,int idPlatilloBuscar) {
        Iterator<Orden> iterator = ordenList.iterator();
        while (iterator.hasNext()) {
            Orden orden = iterator.next();
            if (orden.getIdOrden() == idOrdenBuscar || orden.getIdPlatillo()== idPlatilloBuscar) {
                iterator.remove();
                guardarOrdenes();
            }
        }
    }

    
    
    
    
    
    
    
    
    
    

    private void guardarOrdenes() {
        try {
            FileOutputStream fileOut = new FileOutputStream(archivo);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(ordenList);
            objectOut.close();
            fileOut.close();
//            System.out.println("Datos de platillos guardados en " + archivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void cargarOrdenes() {
        try {
            FileInputStream fileIn = new FileInputStream(archivo);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            ordenList = (ArrayList<Orden>) objectIn.readObject();
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
