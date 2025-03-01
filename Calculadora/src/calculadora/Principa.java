
package calculadora;
import java.util.Scanner;

public class Principa {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       double num1=0.0;
       double num2=0.0;
        int continuar=0;
        char operador;
        do{
            System.out.println("el siguiente ejercicio implementa una calculadora que pide al usuario dos \n" +
"números y una operación (suma, resta, multiplicación o división).");
       
        System.out.println("que operador desea utilizar (+ - * /)");
        operador=input.next().charAt(0);
        if(operador=='*'){
            num1=solicitanumero(input);
            num2=solicitanumero(input);
            Multiplicar miMultiplicar=new Multiplicar(num1,num2);
            miMultiplicar.operacion();
        }
        else if (operador=='+'){
             num1=solicitanumero(input);
            num2=solicitanumero(input);
            Suma miSuma=new Suma(num1,num2);
            miSuma.operacion();
        }
        else if(operador=='-'){
             num1=solicitanumero(input);
            num2=solicitanumero(input);
            Restar miResta=new Restar(num1,num2);
             miResta.operacion();
        }
        else if(operador=='/'){
             num1=solicitanumero(input);
            num2=solicitanumero(input);
             Dividir miDivision =new Dividir(num1,num2);
             miDivision.operacion();
        }
        
            System.out.println("\nsi desea realizar otra operacion pulsa 1 o cualquier otro numero para salir");
            continuar=input.nextInt();
         }while(continuar==1 );
        System.out.println("muchas gracias");
    }
    
    public static double solicitanumero(Scanner input){
        System.out.println("ingrese un numero: ");
        
        double num=input.nextDouble();
        return num;
        
    }
    
    
    
    
    
}
