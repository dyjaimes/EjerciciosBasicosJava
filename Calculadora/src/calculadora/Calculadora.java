
package calculadora;


public abstract class Calculadora {
    
    private double numA;
    private double numB;
    
    public Calculadora(){}
    
    public Calculadora(double numa, double numb){
        numA=numa;
        numB=numb;
    }
    
      public double getNumA() {
        return numA;
    }

    public double getNumB() {
        return numB;
    }
    
    public abstract void operacion();
        
    
    
    
}
