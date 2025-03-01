
package divisible;
import java.util.Scanner;

public class Divisible {

    
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int repetir;
        System.out.println("");
        do{
        int[] numero=new int[100];
       for (int i = 0; i < 100; i++) {
            numero[i] = i + 1;  
        }
        for(int j=0;j<numero.length;j++){
            System.out.println(numero[j]);
        }
        
        FizzBuzz numDivisible=new FizzBuzz(numero);
            System.out.println("numeros divisible por 3");
        numDivisible.divisibleTres();
                    System.out.println("numeros divisible por 5");

        numDivisible.divisibleCinco();
            System.out.println("numeros divisble por 3 y 5");
        numDivisible.ambosDivisible();
            System.out.println("no divisibles");
        numDivisible.noDivisibles();
   
        System.out.println("\n ingrese 1 para repetir o cualquier otro numero para salir");
        repetir=input.nextInt();
        }while(repetir==1);
}
}