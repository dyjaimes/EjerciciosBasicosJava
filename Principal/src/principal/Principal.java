package principal;
import java.util.Scanner;



public class Principal {

  
    public static void main(String[] args) {
      
        Scanner obtener =new Scanner(System.in);
        System.out.println("escriba el numero del ejercico a realizar: ");
        int numero;
        
        
        do {
         System.out.println("Ejercicio 1");
         System.out.println("Ejercicio 2");
         System.out.println("Ejercicio 3");
         System.out.println("Ejercicio 4");
         System.out.println("Ejercicio 5");
         System.out.println("Ejercicio 6");
         System.out.println("Ejercicio 7");
         System.out.println("Ejercicio 8");
         System.out.println("Ejercicio 9");
         System.out.println("Ejercicio 10");
         numero=obtener.nextInt();
        }while(numero<0 || numero>10);
         
        switch (numero){
            case 1:
                Ejercicio1 miEjercicio1 =new Ejercicio1();
                miEjercicio1.tomarDatos(obtener);
                System.out.println("csdkcksdcsd"+miEjercicio1.mostrarDatos());
                break;
            case 2:
                
                
        }
        
    }
    
}
