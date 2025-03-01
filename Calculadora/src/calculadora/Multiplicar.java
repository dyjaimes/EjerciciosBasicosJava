
package calculadora;


public class Multiplicar extends Calculadora {
    
    public Multiplicar(){
        
    }
    public Multiplicar(double num, double numd){
        super(num, numd);
    }
    
    public void operacion(){
        double multiplicar=getNumA()+getNumB();
        System.out.println("la multiplicacion es "+multiplicar);
    }
}
