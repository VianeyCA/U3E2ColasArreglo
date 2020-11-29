package ejerciciou3u2;

import java.util.Scanner;

public class EjercicioU3U2 {
     public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     ColaD Obj = new ColaD();  
     int opc, opc2=0;
       do{ 
         System.out.println("~~~~~~~~~~~~Menú~~~~~~~~~~~~");
           System.out.println("1.- Insertar");
           System.out.println("2.- Mostar Lista");
           System.out.println("3.- Eliminar Elementos");
           System.out.println("4.- Salir");
           System.out.println("Eliga una opción");
         
        opc=leer.nextInt();
        switch(opc){
             case 1:
                 Scanner Leer = new Scanner(System.in);
                 System.out.println("inserte un numero: ");
                 String palabra=Leer.nextLine();
                 Obj.Insertar(palabra);
                 break;
            case 2:
                 Obj.Mostrar();
                 break;
            case 3:
                 Obj.Eliminar();
                break;
            case 4: 
                System.exit(0);
            break;
            default:System.out.println("Opción erronea, intente de nuevo");
        }
       }while(opc2!=4);
        
    }
}
