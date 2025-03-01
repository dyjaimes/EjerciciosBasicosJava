
package calculadora;




public class Suma extends Calculadora {
    
    
    
    public Suma(){}
    
    
    public Suma(double numa, double numb){
        super( numa, numb);
    }
    
    
    
    
    public  void  operacion(){
        double sumar=getNumA()+getNumB();
             System.out.println("La suma es: "+sumar);
    }
}
