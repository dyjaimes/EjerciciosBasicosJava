package principal;
import java.util.Scanner;
import java.util.Set;



public class Principal {

  
    public static void main(String[] args) {
      
        Scanner obtener =new Scanner(System.in);
        System.out.println("Ejercicios de programacion basica con metodologia Poo");
        int numero, peso, piso, temperatura;
        String mensaje;
               
        
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
         System.out.println("escriba el numero del ejercico a realizar:  ");
         numero=obtener.nextInt();
        }while(numero<0 || numero>10);
         
        switch (numero){
            
            case 1:
                Ejercicio1 miEjercicio1 =new Ejercicio1();
                miEjercicio1.tomarDatos(obtener);
                System.out.println("Desplazandose al piso #: "+miEjercicio1.mostrarDatos());
                obtener.close();
                break;
                
            case 2:
                
                        System.out.println("ingrese la edad: ");
                        do{
                            piso=obtener.nextInt();    
                            if(piso<0)
                            System.out.println("vuelva a ingresar la edad: ");

                        }while(piso<0);
                   
                         System.out.println("ingrese su peso: ");
                         do{
                             peso=obtener.nextInt();
                             if(peso<0)
                             System.out.println("vuelva a ingresar su peso: ");
                         }while(peso<0);
                         
                Ejercicio2 miEjercicio2=new Ejercicio2(peso,piso, obtener);
                System.out.println("Peso permitido, peso total "+miEjercicio2.getPesoPermitido()+"kilogramos");
                break;
                
            case 3:
                
                Ejercicio3 miEjercicio3=new Ejercicio3();
                temperatura=miEjercicio3.obtenerNumero(obtener, "ingrese la temperatura actual: ");
                System.out.println("el numero ingresado es "+temperatura);
                
                if(temperatura>=18&& temperatura<=25)
                    System.out.println("la temperatura es adecuada");
                
                else if(temperatura>25)
                    System.out.println("el ambiente es caloroso");
                
                else
                    System.out.println("el ambiente es frio");
                
                miEjercicio3.setTemperatura(temperatura);
                System.out.println("temperatura de "+  miEjercicio3.getRegistroTemperatura()+" grados registrada en el campo ");
                break;
                
            case 4:
                
                System.out.print(" ingrese la temperatura ambiente: ");
                temperatura=obtener.nextInt();
                Ejercicio4 miEjercicio4=new Ejercicio4(obtener, temperatura);
                
              
                if(miEjercicio4.setTemperatura()>8&&miEjercicio4.setTemperatura()<34)
                    System.out.println("la temperatura es ideal con  "+  miEjercicio4.setTemperatura()+" grados ");
                
                else
                  System.out.println("la temperatura es de  "+  miEjercicio4.setTemperatura()+" grados ");
        }
        
    }
    
}
