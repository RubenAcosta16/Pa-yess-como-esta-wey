/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistproyecto;

import ArrayLists.CocinaArrayList;
import ArrayLists.IngredientesArrayList;
import ArrayLists.OrdenArrayList;
import ArrayLists.PlatillosArrayList;
import ArrayLists.Platillos_IngredientesArrayList;
import ArrayLists.ReservacionArrayList;
import ClasesArrayList.Cocina;
import ClasesArrayList.Ingrediente;
import ClasesArrayList.Orden;
import ClasesArrayList.Platillo;
import ClasesArrayList.Platillos_Ingredientes;
import ClasesArrayList.Reservacion;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class ArrayListProyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PlatillosArrayList platillos = new PlatillosArrayList();
        ReservacionArrayList reservaciones=new ReservacionArrayList();
        OrdenArrayList ordenes = new OrdenArrayList();
        CocinaArrayList cocinas = new CocinaArrayList();
        IngredientesArrayList ingredientes=new IngredientesArrayList();
        Platillos_IngredientesArrayList platillos_Ingredientes=new Platillos_IngredientesArrayList();
        
        
//        System.out.println("Cargue todo");

        
        
//platillos ejemplos-------------------------------------------------------------------------------------------------------

//        // Agregar algunos platillos al menú
//        platillos.agregarPlatillo(new Platillo(1, "Hamburguesa", 70.0, "ham.jpg", "Tapa arterias"));
//        platillos.agregarPlatillo(new Platillo(2, "Pizza", 10.99, "pizza.jpg", "Pizza recién horneada con tus ingredientes favoritos"));
//        platillos.agregarPlatillo(new Platillo(3, "Ensalada César", 6.99, "ensalada.jpg", "Ensalada fresca con aderezo César"));
//
//        platillos.agregarPlatillo(new Platillo(4, "Tacos de birria", 70.0, "ham.jpg", "Tapa arterias"));
//        platillos.agregarPlatillo(new Platillo(5, "Burrito de la cafe", 10.99, "pizza.jpg", "Pizza recién horneada con tus ingredientes favoritos"));
            

          

        //para actualizar
        //platillos.actualizarPlatillo(1, new Platillo(1, "Hamburguesa", 5.0, "ham.jpg", "Tapa arterias"));

            //eliminar
//        platillos.eliminarPlatillo(4);




//        System.out.println("imp todos los platillos");
//            List<Platillo> platillosCargados = platillos.getTodosLosPlatillos();
//                System.out.println("Todos los platillos cargados:");
//                for (Platillo platillo : platillosCargados) {
//                    System.out.println(platillo);
//                }














//platilloIngredientes ejemplos-------------------------------------------------------------------------------------------------------

        //agregar
//    reservaciones.agregarReservacion(new Reservacion(1, 4, "24/04/2024","14:30:50"));
//    reservaciones.agregarReservacion(new Reservacion(2, 5, "25/04/2024","14:30:25"));
//    reservaciones.agregarReservacion(new Reservacion(3, 3, "27/04/2024","13:40:25"));

        //actualizar
//        reservaciones.actualizarReservacion(1, new Reservacion(1, 5, "24/04/2024","14:30:50"));

        //eliminar
//        reservaciones.eliminarReservacion(1);

//           System.out.println("imp todas las reservaciones");
//            List<Reservacion> reservacionesCargadas = reservaciones.getTodosLasReservaciones();
//                System.out.println("Todos las reservaciones cargados:");
//                for (Reservacion reservacion : reservacionesCargadas) {
//                    System.out.println(reservacion);
//                }
// 

        












//ordenes ejemplos-------------------------------------------------------------------------------------------------------
    //si idReservacion la ponen como 0 es que no tiene y que es para llevar
    
    //agregar
//        ordenes.agregarOrden(new Orden(1, 1,1, 2, "24/07/2001"));
//        ordenes.agregarOrden(new Orden(1, 2,2, 1, "24/07/2024"));
//        ordenes.agregarOrden(new Orden(2, 1,2, 1, "24/07/3000"));
//        ordenes.agregarOrden(new Orden(3, 3,3, 1, "24/07/2020"));

            //actualizar
//          ordenes.actualizarOrden(1, 1, new Orden(1, 1,1, 3, "24/07/2001"));

            //eliminar
//            ordenes.eliminarOrden(1, 1);
 

//        System.out.println("imp todas las ordenes");
//            List<Orden> ordenesCargadas = ordenes.getTodasLasOrdenes();
//                System.out.println("Todos los ordnees cargados:");
//                for (Orden orden : ordenesCargadas) {
//                    System.out.println(orden);
//                }


//        
        

//        System.out.println("imp platiloos de la orden");
//        List<Platillo> platillosDeLaOrdenCargados = ordenes.getPlatillosDeLaOrden( 1);
////        System.out.println(platillosDeLaOrdenCargados);
//        for (Platillo platillo : platillosDeLaOrdenCargados){
//            System.out.println(platillo.toString());
//        }
//        







//cocina ejemplos-------------------------------------------------------------------------------------------------------

//          agregar
//
//        cocinas.agregarCocina(new Cocina(1, 1, "en proceso", "fd"));
//        cocinas.agregarCocina(new Cocina(1, 2, "en proceso", "fd"));
//        cocinas.agregarCocina(new Cocina(2, 3, "terminado", "fd"));

            //actualiazr
//         cocinas.actualizarCocina(1, 1, 0, "en proceso", "fd");

            //eliminar
//           cocinas.eliminarCocina(1, 1);


//        System.out.println("imp cocina todo");
//            List<Cocina> cocinaCargada = cocinas.getTodasLasCocinas();
//                System.out.println("Todos los ordnees cargados:");
//                for (Cocina cocina : cocinaCargada) {
//                    System.out.println(cocina);
//                }
////

        
       
//        System.out.println("imp ordenes de la cocina");
//        List<List<Orden>> ordenesDeLaCocina = cocinas.getOrdenesParaLaCocina(1);
//        for (List<Orden> ordenesObtenidas : ordenesDeLaCocina){
//            
//            
//            //obviamente esta idOrden debe estar dentro de las ordenes de la cocina
//                int idOrdenDeLaQueQuieroPlatillos=1;
//                int contadorYaPaso=0;
//                
//            for (Orden orden : ordenesObtenidas){
//                System.out.println(orden.toString());
//                System.out.println("");
//                System.out.println("");
//                System.out.println("");
//                System.out.println("");
////                
//                //---------------------ya si quieres obtener los platillos copiar y pegar el ejemplo 
//                //---------------------del orden de arriba o usa esto we
//                if(idOrdenDeLaQueQuieroPlatillos==orden.getIdOrden()&&contadorYaPaso==0){
//                    contadorYaPaso++;
////                     idPlatillosOrdenes=orden.getIdOrden();
//    
//                    System.out.println("imp platiloos de la orden "+idOrdenDeLaQueQuieroPlatillos);
//                    List<Platillo> platillosDeLaOrdenCargados = ordenes.getPlatillosDeLaOrden( idOrdenDeLaQueQuieroPlatillos);
////                  System.out.println(platillosDeLaOrdenCargados);
//                    for (Platillo platillo : platillosDeLaOrdenCargados){
//                      System.out.println(platillo.toString());
//                    }
//                }
//               
//        
//                
//            }
//        }




//ingredientes ejemplos-------------------------------------------------------------------------------------------------------

//              agregar
//      ingredientes.agregarIngrediente(new Ingrediente(1, "Harina", "Kg", 20, "bajo", "Alsuper"));
//      ingredientes.agregarIngrediente(new Ingrediente(2, "Azucar", "Kg", 24, "bajo", "Alsuper"));
//      ingredientes.agregarIngrediente(new Ingrediente(3, "Leche", "L", 40, "alto", "Lala"));
//      ingredientes.agregarIngrediente(new Ingrediente(4, "Limon", "Kg", 57, "bajo", "Abarrotes el wero"));
          
            //actualizar
//            ingredientes.actualizarIngrediente(1, new Ingrediente(1, "Trigo", "Kg", 20, "bajo", "Alsuper"));
            
            //eliminar
//            ingredientes.eliminarIngrediente(1);

//        System.out.println("imp todos los ingredientes");
//            List<Ingrediente> ingredientesCargados = ingredientes.getTodosLosIngredientes();
//                for (Ingrediente ingrediente : ingredientesCargados) {
//                    System.out.println(ingrediente.toString());
//                }

















//platilloIngredientes ejemplos-------------------------------------------------------------------------------------------------------

    //              agregar
//platillos_Ingredientes.agregarPlatillos_Ingredientes(new Platillos_Ingredientes(1, 1, 2));
//platillos_Ingredientes.agregarPlatillos_Ingredientes(new Platillos_Ingredientes(1, 3, 2.4));
//platillos_Ingredientes.agregarPlatillos_Ingredientes(new Platillos_Ingredientes(1, 4, 2.4));
//
//platillos_Ingredientes.agregarPlatillos_Ingredientes(new Platillos_Ingredientes(2, 1, 2.4));
//platillos_Ingredientes.agregarPlatillos_Ingredientes(new Platillos_Ingredientes(2, 3, 2.4));


            //actualizar
//            platillos_Ingredientes.actualizarPlatillos_Ingredientes(1, 1, 4);

            
             //eliminar
//             platillos_Ingredientes.eliminarPlatillos_Ingredientes(1);

//        System.out.println("imp todas las Platillo_INgredientes");
//            List<Platillos_Ingredientes> platillos_IngredientesCargadas = platillos_Ingredientes.getTodasLasPlatillos_Ingredientes();
//                System.out.println("Todos los ordnees cargados:");
//                for (Platillos_Ingredientes platillos_Ingrediente : platillos_IngredientesCargadas) {
//                    System.out.println(platillos_Ingrediente.toString());
//                }
////

        
        
//
//        System.out.println("imp ingredientes de los platillos");
//        List<Ingrediente> ingredientesDeLosPlatillos = platillos_Ingredientes.getIngredientesDelPlatillo(1);
////        System.out.println(platillosDeLaOrdenCargados);
//        for (Ingrediente ingrediente : ingredientesDeLosPlatillos){
//            System.out.println(ingrediente.toString());
//        }
//        

    




    }



}
