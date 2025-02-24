
package principal;
import java.util.Scanner;

public class Ejercicio8 {
    private int edad;
    
public void setEdad(Scanner ob, String mensaje) {
        int ed = 0; 
        do{
                    System.out.print(mensaje + " "); 

            if(!ob.hasNextInt()){
                System.out.println("valor incorrecto");
                ob.next();
                continue;
            }
            else{System.out.println("un numero mayo a cero");}
            ed=ob.nextInt();
        }while(ed<0);
        
        
        /*
        while (true) { 
            if (ob.hasNextInt()) { 
                ed = ob.nextInt();
                    if (ed >= 0) {
                    break;
                    } else {
                    System.out.print("La edad no puede ser negativa. Intente de nuevo: ");
                    }
            } else { 
                System.out.print("Entrada inválida. Ingrese un número entero: ");
                ob.next(); 
            }
        }*/

        edad = ed;
    }
    public int getEdad(){
        return edad;
    }
    
    public String getCategoria(){
      
    
        if(edad<7){
         
        return  "animadas y educativas";
        }
        if ( edad<17){
            return "animaciones, aventuras y comedias familiares";
           
        }
            if ( edad<30){
            return "acción, drama, comedia y ciencia ficción";
           
        }
            else{
                return "películas clásicas y dramas";
            }
        
    }
}
