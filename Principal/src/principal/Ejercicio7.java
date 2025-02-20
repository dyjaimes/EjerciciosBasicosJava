
package principal;
import java.util.Scanner;

public class Ejercicio7 {
    private double peso, altura, imc;

    public Ejercicio7(Scanner obt, String mesn){
        peso=pesos(obt,  mesn);
        
    }
    
    
   public double pesos(  Scanner obte,  String mensa){
       double pes=0;
       System.out.print(mensa);
       do{
           
           if(!obte.hasNextDouble()){
                System.out.print("valor incorrecto, ingrese nuevamente");
       obte.next(); 
           }
           
        pes=obte.nextDouble();
        if(pes<=0)
          System.out.print("debe ser mayor a cero");
          
       }while(pes<=0);
      

       return pes;
       
   }
   
   public void alturas(Scanner ob, String mes){
       double altura=0;
       System.out.print(mes);
       do{
          if(!ob.hasNextDouble()){
              System.out.print("valor incorrecto, ingrese nuevamente su altura en centimetros");
              ob.next();
              continue;
          }
          altura=ob.nextDouble();
 
         
       }while(altura<30);
       
       this.altura=altura/100;
   }
   
   
   
   public double getpeso(){
       return peso;
   }
    public double getaltura(){
        return altura;
    }
    
   public double setIMC(){
       return altura;
   }
   public void setimc(double imc){
       this.imc=imc;
   }
}
