/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;


public class Dividir extends Calculadora {
    
    
    public Dividir(){
        
    }
    public Dividir(double numa, double numb){
        super(numa,numb);
    }
    
    public void operacion(){
        double dividir=getNumA()/getNumB();
        System.out.println("la division es: "+dividir);
    }
    
}
