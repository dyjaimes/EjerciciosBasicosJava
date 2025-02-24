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
         System.out.println("Ejercicio 11");
         System.out.println("Ejercicio 12");
         System.out.println("Ejercicio 13");
         
         
         System.out.println("escriba el numero del ejercico a realizar:  ");
         numero=obtener.nextInt();
        }while(numero<0 || numero>10);
        
        if(numero>=1 && numero <=5 || numero ==7  || numero >=9) {
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
                System.out.println(imc < 18.5 ? "su imc es de "+imc+" peso bajo" : (imc <= 24.9 ?"su imc es de "+imc+ " peso normal" : (imc<=29.9?"su imc es de "+imc+" sobrepeso":"su imc es de "+imc+" obsidad")) );

                break;
                
            case 9:
                    
                System.out.println("Ingrese el número de equipos:");
        int cantidadEquipos = obtener.nextInt();
        obtener.nextLine(); 

        ejercicio9 campeonato = new ejercicio9(cantidadEquipos);

       
        for (int i = 0; i < cantidadEquipos; i++) {
            System.out.print("Ingrese el nombre del equipo " + (i + 1) + ": ");
            String nombreEquipo = obtener.nextLine();
            campeonato.agregarEquipo(i, nombreEquipo);
        }

        
        String continuar;
        do {
            System.out.print("\nIngrese el nombre del equipo que jugó: ");
            String equipo = obtener.nextLine();
            System.out.print("Ingrese el resultado (ganado, empatado, perdido): ");
            String resultado = obtener.nextLine();

            campeonato.registrarPartido(equipo, resultado);

            System.out.print("\n¿Desea ingresar otro partido? (si/no): ");
            continuar = obtener.nextLine().toLowerCase();
        } while (continuar.equals("si"));

        
        campeonato.mostrarClasificacion();
                break;
        
            case 10:
                
                
            Ejercicio10[] menu = {
            new Ejercicio10("Hamburguesa", 15000),
            new Ejercicio10("Pizza", 20000),
            new Ejercicio10("Ensalada", 12000),
            new Ejercicio10("Refresco", 5000),
            new Ejercicio10("Jugo Natural", 7000),
            new Ejercicio10("Cerveza", 10000)
        };

        // Array para almacenar cantidades de cada plato pedido
        int[] cantidades = new int[menu.length];

        // Mostrar el menú
        System.out.println("\n----- MENÚ DEL RESTAURANTE -----");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%d. %-15s $%.2f%n", i + 1, menu[i].nombre, menu[i].precio);
        }

        // Selección de platos
        while (true) {
            System.out.print("\nSeleccione un número del menú para agregar al pedido (0 para finalizar): ");
            int opcion = obtener.nextInt();

            if (opcion == 0) break; // Salir del ciclo si el usuario ingresa 0

            if (opcion > 0 && opcion <= menu.length) {
                cantidades[opcion - 1]++;
                System.out.println(menu[opcion - 1].nombre + " agregado.");
            } else {
                System.out.println("Opción no válida.");
            }
        }

        // Calcular total sin descuento
        double total = 0;
        System.out.println("\n----- PEDIDO FINAL -----");
        for (int i = 0; i < menu.length; i++) {
            if (cantidades[i] > 0) {
                System.out.printf("%-15s x%d  $%.2f%n", menu[i].nombre, cantidades[i], menu[i].precio * cantidades[i]);
                total += menu[i].precio * cantidades[i];
            }
        }
        System.out.printf("TOTAL: $%.2f%n", total);

        // Método de pago y descuento
        System.out.print("\nIngrese su método de pago (efectivo, tarjeta, cheque): ");
        obtener.nextLine(); // Limpiar buffer
        String metodoPago = obtener.nextLine().toLowerCase();

        double descuento = 0;
        switch (metodoPago) {
            case "efectivo": descuento = total * 0.10; break;
            case "tarjeta":  descuento = total * 0.05; break;
            case "cheque":   descuento = total * 0.02; break;
            default: System.out.println("Método no válido. No hay descuento.");
        }

        System.out.printf("\nDescuento aplicado: $%.2f%n", descuento);
        System.out.printf("Total a pagar: $%.2f%n", total - descuento);
        
        break;
        
            case 11:
                
                 Ejercicio11 cuenta = new Ejercicio11(100000); // Saldo inicial

        System.out.println(" Bienvenido al Cajero Automático");
        System.out.printf("Su saldo actual es: $%.2f%n", cuenta.getSaldo());

        while (true) {
            System.out.print("\nIngrese el monto a retirar (0 para salir): ");
            double monto = obtener.nextDouble();

            if (monto == 0) {
                System.out.println(" Gracias por usar el cajero. ¡Hasta luego!");
                break;
            }

            if (cuenta.retirar(monto)) {
                System.out.printf("Retiro exitoso. Saldo restante: $%.2f%n", cuenta.getSaldo());
            } else {
                System.out.println(" Error: Fondos insuficientes.");
            }
        }
        break;
        
        
        
        
        
        
            case 12:
                  Ejercicio12 tienda = new Ejercicio12(); // Crear un objeto de Tienda
        tienda.realizarCompra(); // Llamar al método para iniciar la compra
                
                break;
                
                
                
            case 13:
                System.out.print("Ingrese la cantidad inicial de papel en la impresora: ");
        int capacidad = obtener.nextInt();

       Ejercicio13 impresora = new Ejercicio13(capacidad);

        // Bucle "mientras" haya papel
        while (impresora.hayPapel()) {
            System.out.print("\nIngrese la cantidad de páginas a imprimir: ");
            int paginas = obtener.nextInt();

            impresora.imprimir(paginas);

            if (!impresora.hayPapel()) {
                System.out.println("\n Papel agotado. No se pueden imprimir más páginas.");
            }
        }

        System.out.println("\n Fin del programa.");
                break;
                
                
                
                
            case 14:
                
                Ejercicio14 coche = new Ejercicio14();
        String continuarr;

        // Bucle para simular múltiples viajes
        do {
            System.out.print("\nIngrese la distancia total del viaje (km): ");
            double distancia = obtener.nextDouble();

            System.out.print("Ingrese la velocidad promedio del coche (km/h): ");
            double velocidad = obtener.nextDouble();

            double tiempo = coche.calcularTiempo(distancia, velocidad);
            if (tiempo > 0) {
                System.out.printf("⏳ Tiempo estimado de viaje: %.2f horas\n", tiempo);
            }

            System.out.print("\n¿Desea hacer otro viaje? (si/no): ");
            obtener.nextLine(); // Limpiar buffer
            continuarr = obtener.nextLine().toLowerCase();

        } while (continuarr.equals("si"));

        System.out.println("\n Fin del programa.");
                break;
                
                
            case 15:
                
       
        System.out.print("Ingrese un número entero positivo para la cuenta regresiva: ");
        int numeroo = obtener.nextInt();

        if (numeroo >= 0) {
            System.out.println("\n Iniciando cuenta regresiva...");
            Ejercicio15 cuentas = new Ejercicio15(numeroo); // Pasamos el número al constructor
            cuentas.iniciarCuentaRegresiva();
        } else {
            System.out.println("❌ Error: Ingrese un número positivo.");
        }
                break;
                
                
            case 16:
                      Ejercicio16  juego = new Ejercicio16();
        juego.jugar();
                
                
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
                                break;
                        }
                    
                        
                            
                        }
                        if(numero==8){
                            String categorias;
                            System.out.println("bienvenido al cine");
                            Ejercicio8 miEjercicio8 = new Ejercicio8();
                            miEjercicio8.setEdad(obtener, "ingrese su edad");
                            int edad1= miEjercicio8.getEdad();
                            int cel;
                            System.out.println("tiene "+edad1+" años, las peliculas recomendadas son: ");
                            if(edad1<7)
                                cel=1;
                            else if (edad1>=7 && edad1<17)
                                    cel=2;
                             else if (edad1>=8 && edad1<30)
                                    cel=3;   
                             else{
                                 cel=4;
                             }
                            
                            switch(cel){
                                case 1:
                                    categorias=miEjercicio8.getCategoria();
                                    System.out.println(categorias);
                                    break;
                                case 2:
                                    categorias=miEjercicio8.getCategoria();
                                    System.out.println(categorias);
                                    break;
                                    
                                case 3:
                                categorias=miEjercicio8.getCategoria();
                                System.out.println(categorias);
                                break;
                                case 4:
                                    categorias=miEjercicio8.getCategoria();
                                    System.out.println(categorias);
                                    break;
                            }
                            
                            
                    }
                    
    }
  
    }
    

