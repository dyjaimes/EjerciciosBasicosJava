package principal;
import java.util.HashSet;
import java.util.Scanner;



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
        
        if(numero>=1 && numero <=5 || numero >=7) {
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
                break;
                
            case 5:
                Ejercicio5 miEjercicio5 =  new Ejercicio5();
                
                temperatura=miEjercicio5.solicitarTemperatura(obtener, "detectando la temperatura ambiente ");
                System.out.println( temperatura+ " grados");
                if(temperatura<=33)
                {
                piso=miEjercicio5.solicitarPiso(obtener, "ingrese el piso al cual se dirije: ");
                miEjercicio5.setpiso(piso);
                }
                miEjercicio5.settemperatura(temperatura);
               break;
               
            case 7:
                double pesoss;
                Ejercicio7 miEjercicio7 = new Ejercicio7(obtener, "ingrese su peso");
                pesoss=miEjercicio7.getpeso();
                miEjercicio7.alturas(obtener, "ingrese la altura");
                double altura=miEjercicio7.getaltura();
                
                double imc;
                imc=pesoss/(altura*altura);
                miEjercicio7.setimc(imc);
                
                
                System.out.print("su IMC es de "+imc);
                
                break;
                
                
                
                    }
        }
                    
                    if (numero==6){
                        int cantidad;
                        double precio;
                        String product;
                        int seleccion, descuento=0;
                        
                        Ejercicio6 miEjercicio6 =new Ejercicio6("ingrese el tipo de producto: ");
                        
                        cantidad=miEjercicio6.cantidad(obtener, "digite la cantidad del producto: ");
                        miEjercicio6.setCantidad(cantidad);
                        precio=miEjercicio6.precio(obtener, "dijite el precio del producto: ");
                        product=miEjercicio6.getProducto();
                        
                        
                        if(product.equals("ALIMENTOS"))
                        { seleccion=1;
                        descuento=10;
                        miEjercicio6.setDescuento(descuento);
                        }  
                        
                        else if(product.equals("VESTIMENTA"))
                        {seleccion=2;
                        descuento=5;
                        miEjercicio6.setDescuento(descuento);}
                        else{
                            seleccion=3;
                            miEjercicio6.setDescuento(descuento);
                        }
                        
                        switch (seleccion){
                            case 1:
                                
                                                 System.out.print("Factura");
                                System.out.print("\nproducto "+product );
                                System.out.print("\ncantidad "+cantidad);
                                System.out.print("\nprecio "+precio);
                                System.out.print("\ndescuento "+descuento+" %");
                                System.out.print("\ntotal "+ ((precio*cantidad)-(precio*cantidad/descuento))+" pesos");       
                                miEjercicio6.setTotal((precio*cantidad)-(precio*cantidad/descuento));
                                break;
                            case 2:
                                                                 System.out.print("Factura");
                                System.out.print("\nproducto "+product );
                                System.out.print("\ncantidad "+cantidad);
                                System.out.print("\nprecio "+precio);
                                System.out.print("\ndescuento "+descuento+" %");
                                System.out.print("\ntotal "+ ((precio*cantidad)-(precio*cantidad/descuento))+" pesos");     
                                miEjercicio6.setTotal((precio*cantidad)-(precio*cantidad/descuento));
                                break;
                            case 3:
                                                        System.out.print("Factura");
                                System.out.print("\nproducto "+product );
                                System.out.print("\ncantidad "+cantidad);
                                System.out.print("\nprecio "+precio);
                                System.out.print("\ndescuento "+descuento+" %");
                                System.out.print("\ntotal "+ (precio*cantidad)+" pesos");   
                                miEjercicio6.setTotal((precio*cantidad)-(precio*cantidad/descuento));
                        }
                    
                        
                        
                    }
                    
    }
  
    }
    

