
package calculadora;


public class Restar extends Calculadora {
    
   public Restar(){
    
    
   }
    public Restar(double numa, double numb){
        super(numa, numb);
    }
    

public void operacion(){
    double resta=getNumA()-getNumB();
    System.out.println("la resta es "+resta);
}
}