
package divisible;


public class FizzBuzz {
    int[] numero;
    
    
    public FizzBuzz(int[] numeros){
        numero=numeros;
    }
    
    public int[] getMostrar(){
        return numero;
    }
    
    public void divisibleTres(){
      for(int i=0;i<numero.length;i++){
          if(numero[i]%3==0){
              System.out.println(numero[i]+" Fizz");
          }
          
      }
      
    }
     public void divisibleCinco(){
      for(int i=0;i<numero.length;i++){
          if(numero[i]%5==0){
              System.out.println(numero[i]+" Buzz");
          }
          
      }
}
     public void ambosDivisible(){
         for(int i=0;i<numero.length;i++){
             if(numero[i]%5==0 &&numero[i]%3==0){
                 System.out.println(numero[i]+" FizzBuzz");
             }
         }
     }
     
     public void noDivisibles(){
         System.out.println("no divisibles por 3 y 5");
         for(int i=0; i<numero.length;i++){
             if(!(numero[i]%5==0 && numero[i]%3==0)){
                 
                 System.out.println(numero[i]);
             }
         }
         
         
     }
}
