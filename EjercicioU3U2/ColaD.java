
package ejerciciou3u2;

import java.util.Scanner;

public class ColaD {
    
    Scanner leer=new Scanner(System.in);
    int cima=-1; 
    String arr [];
    public ColaD() {
        arr=new String[5];
    }
 
        public void Insertar(String elemento){
        if(cima >=arr.length -1){
        System.out.println("No puede insertar mas datos, la cola esta llena. ");
        }
        else{
        arr[++cima]=elemento;
        System.out.println("Se inserto el elemento");}
    }
      
     public void Eliminar(){
       String elimina;
        if(cima==-1){
            System.out.println("cola vacia");
        }
        else{
        elimina=arr[cima];
        cima--;
         System.out.println("Se elimino el elemento");
        }
	} 
     
     public void Mostrar(){
         if(cima==-1){
             System.out.println("Cola vacia");
         }
        else{
        for(int i=0;i<=cima;i++) {
            System.out.println(arr[i]);
        }
     }
  }
}
