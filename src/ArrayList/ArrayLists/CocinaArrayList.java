/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList.ArrayLists;


import ArrayList.ClasesArrayList.Cocina;
import ArrayList.ClasesArrayList.Orden;
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
public class CocinaArrayList {
    
    private String archivo = "db/cocina.txt";

    //    private ArrayList<Orden> ordenList = new ArrayList<>();
    public List<Cocina> cocinaList = new ArrayList<>();

    OrdenArrayList ordenesList = new OrdenArrayList();

    public CocinaArrayList() {
        cargarCocina();
    }
    
    
    
    
    
    
    


    // Método para agregar un platillo al menú
    public void agregarCocina(Cocina cocina) {
        cocinaList.add(cocina);
        
        guardarCocina();
    }
    
     public List<Cocina> getTodasLasCocinas() {
        return cocinaList;
    }
     
     
     
     
     

    
    public List<List<Orden>> getOrdenesParaLaCocina(int idCocina) {
        List<List<Orden>> ordenesParaLaCocina = new ArrayList<>();
        for (Cocina cocina : cocinaList) {
            if (cocina.getIdCocina()== idCocina) {

                ordenesParaLaCocina.add(ordenesList.buscarTodaslasOrdenesPorId(cocina.getIdOrden()));

            }
        }

        return ordenesParaLaCocina;

    }
    
    
    
    
    
    
    
    
    
    
    

    // Método para buscar un platillo por su id
    public List<Cocina> buscarCocinaPorId(int idOrdenBuscar) {
        List<Cocina> cocinasEncontradas = new ArrayList<>();
        for (Cocina cocina : cocinaList) {
            if (cocina.getIdCocina() == idOrdenBuscar) {
                cocinasEncontradas.add(cocina);
            }
        }
        return cocinasEncontradas;
    }

    // Método para actualizar un platillo por su id
    public void actualizarCocina(int idCocinaBuscar,int idOrdenBuscar, int nuevoIdOrden, String nuevoProceso,String nuevaRevision) {
        List<Cocina> ordenesEncontradas = buscarCocinaPorId(idCocinaBuscar);
        for (Cocina cocina : ordenesEncontradas) {
            if(cocina.getIdOrden()==idOrdenBuscar){
                cocina.setIdOrden(nuevoIdOrden);
            cocina.setStatusProceso(nuevoProceso);
            cocina.setRevision(nuevaRevision);
            
            guardarCocina();
            }
            
        }
    }

    // Método para eliminar un platillo del menú por su id
    public void eliminarCocina(int idCocinaBuscar,int idOrdenBuscar) {
        Iterator<Cocina> iterator = cocinaList.iterator();
        while (iterator.hasNext()) {
            Cocina cocina = iterator.next();
            if (cocina.getIdCocina()== idCocinaBuscar||cocina.getIdOrden()==idOrdenBuscar) {
                iterator.remove();
                
                guardarCocina();
            }
        }
    }
    
    
    
    
    
    
    
    
    
    

    private void guardarCocina() {
        try {
            FileOutputStream fileOut = new FileOutputStream(archivo);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(cocinaList);
            objectOut.close();
            fileOut.close();
//            System.out.println("Datos de platillos guardados en " + archivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void cargarCocina() {
        try {
            FileInputStream fileIn = new FileInputStream(archivo);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            cocinaList = (ArrayList<Cocina>) objectIn.readObject();
            objectIn.close();
            fileIn.close();
//            System.out.println("Datos de platillos cargados desde " + archivo);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
