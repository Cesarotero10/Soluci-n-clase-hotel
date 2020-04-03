/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoteldiamontinn1;
import componentes.diamontinn.fesaragon.Reserva;
import java.util.Date;

/**
 *
 * @author Windows
 */


public class HotelDiamontInn1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mostrarMenu();  
        
        
    

    }
        
       
        
       public static void mostrarMenu(){
           int salir = 0;
        do{
        
        System.out.println("--------- BIENVENIDO A HOTEL DIAMONT INN ---------");
        System.err.println("");
        System.out.println("\n Selecciona la opción deseada:");
        System.out.println("\n 1. Reserva de habitación");
        System.out.println("\n 2. Reservaciones");
        System.out.println("\n 3. Horario");
        System.out.println("\n 4. Reporte");
        System.out.println("\n 5. Reporte del dia");
        System.out.println("\n 0. Salir");
        
        int respuesta = 0;
        
        switch (respuesta){
            case 0:
                salir = 0;
                break;
            
            case 1:
                mostrarReservaDeHabitacion();
                break; 
                
                
            case 2:
                mostrarReservaciones();
                break;
            
            case 3:
                mostrarHorario(); 
                break;
                
            case 4:
                hacerReporte();
                break;
                
            case 5:
                //Date date = new Date();
                hacerReporte(new Date());
                    
            default:
                System.out.println();
                System.out.println("---- Selecciona una opción: ---- ");
                System.out.println();
                break; }
        
         
         } while(salir != 0);
       
}
       public static void mostrarReservaDeHabitacion(){
       int salir = 0;
       do{
           System.out.println();
           System.out.println("\n:: RESERVA TU HABITACION ::");
           System.out.println();
       }while(salir != 0);
       
       }
       public static void mostrarReservaciones(){
       int salir = 0;
       do{
           System.out.println();
           System.out.println("\n:: RESERVACIONES ::");
           System.out.println();
       }while(salir != 0);
       
        }
       public static void mostrarHorario(){
       int salir = 0;
       do{
           System.out.println();
           System.out.println("\n:: HORARIO DE ENTRADA Y SALIDA ::");
           System.out.println();
       }while(salir != 0);
       
       
       }
       
       public static void hacerReporte(){}
       public static void hacerReporte(Date date){}
}
        
        
        
        
    
    
    

