package principal;
import java.util.HashSet;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


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
         System.out.println("Ejercicio 14");
         System.out.println("Ejercicio 15");
         System.out.println("Ejercicio 16");
         System.out.println("Ejercicio 17");
         System.out.println("Ejercicio 18");
         System.out.println("Ejercicio 19");
         System.out.println("Ejercicio 20");
         System.out.println("Ejercicio 21");
         System.out.println("Ejercicio 22");
         System.out.println("Ejercicio 23");
         System.out.println("Ejercicio 24");
         System.out.println("Ejercicio 25");
         System.out.println("Ejercicio 26");
         System.out.println("Ejercicio 27");
         System.out.println("Ejercicios de programacion basica con metodologia estructurada");
           System.out.println("Ejercicio 28");
         System.out.println("Ejercicio 29");
         System.out.println("Ejercicio 30");
         System.out.println("Ejercicio 31");
         System.out.println("Ejercicio 32");
         System.out.println("Ejercicio 33");
         System.out.println("Ejercicio 34");
        
         System.out.println("escriba el numero del ejercico a realizar:  ");
         numero=obtener.nextInt();
        }while(numero<0 || numero>34);
        
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

        
        int[] cantidades = new int[menu.length];

      
        System.out.println("\n----- MENÚ DEL RESTAURANTE -----");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%d. %-15s $%.2f%n", i + 1, menu[i].nombre, menu[i].precio);
        }

        while (true) {
            System.out.print("\nSeleccione un número del menú para agregar al pedido (0 para finalizar): ");
            int opcion = obtener.nextInt();

            if (opcion == 0) break; 

            if (opcion > 0 && opcion <= menu.length) {
                cantidades[opcion - 1]++;
                System.out.println(menu[opcion - 1].nombre + " agregado.");
            } else {
                System.out.println("Opción no válida.");
            }
        }

        double total = 0;
        System.out.println("\n----- PEDIDO FINAL -----");
        for (int i = 0; i < menu.length; i++) {
            if (cantidades[i] > 0) {
                System.out.printf("%-15s x%d  $%.2f%n", menu[i].nombre, cantidades[i], menu[i].precio * cantidades[i]);
                total += menu[i].precio * cantidades[i];
            }
        }
        System.out.printf("TOTAL: $%.2f%n", total);

        
        System.out.print("\nIngrese su método de pago (efectivo, tarjeta, cheque): ");
        obtener.nextLine(); 
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
                
                 Ejercicio11 cuenta = new Ejercicio11(100000); 

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
                  Ejercicio12 tienda = new Ejercicio12(); 
        tienda.realizarCompra();
                break;
                
                
                
            case 13:
                System.out.print("Ingrese la cantidad inicial de papel en la impresora: ");
        int capacidad = obtener.nextInt();

       Ejercicio13 impresora = new Ejercicio13(capacidad);

        
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

       
        do {
            System.out.print("\nIngrese la distancia total del viaje (km): ");
            double distancia = obtener.nextDouble();

            System.out.print("Ingrese la velocidad promedio del coche (km/h): ");
            double velocidad = obtener.nextDouble();

            double tiempo = coche.calcularTiempo(distancia, velocidad);
            if (tiempo > 0) {
                System.out.printf(" Tiempo estimado de viaje: %.2f horas\n", tiempo);
            }

            System.out.print("\n¿Desea hacer otro viaje? (si/no): ");
            obtener.nextLine(); 
            continuarr = obtener.nextLine().toLowerCase();

        } while (continuarr.equals("si"));

        System.out.println("\n Fin del programa.");
                break;
                
                
            case 15:
            System.out.print("Ingrese un número entero positivo para la cuenta regresiva: ");
        int numeroo = obtener.nextInt();

        if (numeroo >= 0) {
            System.out.println("\nIniciando cuenta regresiva...");
            Ejercicio15 cuentas = new Ejercicio15(numeroo); 
            cuentas.iniciarCuentaRegresiva();
        } else {
            System.out.println("Error: Ingrese un número positivo.");
        }
                break;
                
                
            case 16:
                      Ejercicio16  juego = new Ejercicio16();
        juego.jugar();
                
                
                break;
                
            case 17:
                
                 StringBuilder registroLibros = new StringBuilder(); 
        String continuar2;

        do {
            System.out.println("Ingrese el título del libro:");
            String titulo = obtener.nextLine();

            System.out.println("Ingrese el autor del libro:");
            String autor = obtener.nextLine();

            System.out.println("Ingrese el número de páginas:");
            int paginas = Integer.parseInt(obtener.nextLine());

           
            Ejercicio17 libro = new Ejercicio17(titulo, autor, paginas);
            registroLibros.append(libro.getInfo()).append("\n");

            
            System.out.println("¿Desea registrar otro libro? (si/no)");
            continuar2 = obtener.nextLine().toLowerCase();
        } while (continuar2.equals("si"));

       
        System.out.println("\nLibros registrados:");
        System.out.println(registroLibros);
                
                break;
                
                
            case 18:
                Ejercicio18  menus = new Ejercicio18();
        double totalPagar = 0;
        int opcion;

        do {
           
            System.out.println("\n--- Menú de Comidas Rápidas ---");
            System.out.println("1. Hamburguesa - $8.50");
            System.out.println("2. Perro Caliente - $6.00");
            System.out.println("3. Papas Fritas - $5.00");
            System.out.println("4. Gaseosa - $2.50");
            System.out.println("5. Malteada - $3.00");
            System.out.println("0. Finalizar pedido");
            System.out.print("Ingrese el número de su elección: ");
            
            opcion = obtener.nextInt();

            if (opcion >= 1 && opcion <= 5) {
                totalPagar += menus.obtenerPrecio(opcion);
                System.out.println("Producto agregado. Total actual: $" + totalPagar);
            } else if (opcion != 0) {
                System.out.println("Opción inválida, por favor intente de nuevo.");
            }

        } while (opcion != 0);  
        System.out.println("\nTotal a pagar: $" + totalPagar);
        System.out.println("¡Gracias por su compra! Vuelva pronto.");

                break;
            case 19:
                int temperaturas;

        System.out.println("Bienvenido al sensor de temperatura.");
        
        do {
            System.out.print("Ingrese la temperatura actual en °C: ");
            temperaturas = obtener.nextInt();
            Ejercicio19 sensor = new Ejercicio19(temperaturas);

            if (!sensor.esTemperaturaAceptable()) {
                System.out.println(" Alerta: La temperatura está fuera del rango aceptable (18°C - 25°C).");
            }

        } while (temperaturas < 18 || temperaturas > 25); 

        System.out.println(" La temperatura está dentro del rango aceptable.");
                
                break;
                
            case 20:
                
                Ejercicio20 examen = new Ejercicio20();
        String continuar3;

        do {
            System.out.print("Ingrese la nota del examen (0 - 5): ");
            double nota = obtener.nextDouble();

            
            if (nota >= 0 && nota <= 5) {
                examen.agregarNota(nota);
            } else {
                System.out.println("️ Nota inválida. Debe estar entre 0 y 5.");
            }

            
            System.out.print("¿Desea ingresar otra nota? (si/no): ");
            continuar3 = obtener.next().toLowerCase();
        } while (continuar3.equals("si"));

      
        double promedio = examen.calcularPromedio();
        System.out.println("\nPromedio final: " + promedio);

       
        if (examen.haAprobado()) {
            System.out.println("¡Felicidades! Has aprobado.");
        } else {
            System.out.println(" Lo siento, has reprobado.");
        }

                
                
                break;
                
            case 21:
                Ejercicio21 gestorTareas = new Ejercicio21();
        String continuar4;

        System.out.println(" Bienvenido al gestor de tareas.");

        do {
            System.out.print("Ingrese la descripción de la tarea: ");
            obtener.nextLine(); 
            String descripcion = obtener.nextLine();

            System.out.print("Ingrese la fecha de vencimiento (DD/MM/AAAA): ");
            String fechaVencimiento = obtener.next();

            gestorTareas.agregarTarea(descripcion, fechaVencimiento);

            System.out.print("¿Desea agregar otra tarea? (si/no): ");
            continuar4 = obtener.next().toLowerCase();
        } while (continuar4.equals("si"));

        System.out.println("\n Lista de tareas registradas:");
        System.out.println(gestorTareas.mostrarTareas());
                
                
                break;
                
           
            case 22:
                Ejercicio22 registro = new Ejercicio22();
        String continuar5;

        System.out.println(" Bienvenido al sistema de registro de ventas.");

        do {
            System.out.print("Ingrese el nombre del producto: ");
            obtener.nextLine(); // Limpiar buffer
            String producto = obtener.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            double precio = obtener.nextDouble();

            registro.agregarVenta(producto, precio);

            System.out.print("¿Desea agregar otra venta? (si/no): ");
            continuar5 = obtener.next().toLowerCase();
        } while (continuar5.equals("si"));

        // Mostrar resumen final
        System.out.println("\n Resumen de Ventas:");
        System.out.println(registro.obtenerResumenVentas());
        System.out.println(" Monto Total de Ventas: $" + registro.obtenerTotalVentas());

                
                
                break;
                
            case 23:
                 Ejercicio23  parqueadero = new Ejercicio23();

        System.out.print("Ingrese la cantidad de vehículos a registrar: ");
        int cantidadVehiculos = obtener.nextInt();

       
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

        for (int i = 0; i < cantidadVehiculos; i++) {
            System.out.print("Ingrese la placa del vehículo #" + (i + 1) + ": ");
            obtener.nextLine();
            String placa = obtener.nextLine();

            String horaIngreso = LocalTime.now().format(formatoHora); 
            parqueadero.registrarVehiculo(placa, horaIngreso);
        }

       
        System.out.println("\nResumen de Vehículos Registrados:");
        System.out.println(parqueadero.obtenerResumen());
                
                break;
                
                
            case 24:
                 Ejercicio24 carrito = new Ejercicio24();

        System.out.print("Ingrese la cantidad de productos a comprar: ");
        int cantidadProductos = obtener.nextInt();

        for (int i = 0; i < cantidadProductos; i++) {
            System.out.print("Ingrese el nombre del producto #" + (i + 1) + ": ");
            obtener.nextLine(); 
            String productoo = obtener.nextLine();

            System.out.print("Ingrese el precio de " + productoo + ": ");
            double precio =obtener.nextDouble();

            carrito.agregarProducto(productoo, precio);
        }

        // Mostrar resumen final
        System.out.println("\nResumen de Compra:");
        System.out.println(carrito.obtenerResumenCompra());
        System.out.println("Total a Pagar: $" + carrito.obtenerTotalCompra());
                
                break;
                
            case 25:
                
                Ejercicio25 agenda = new Ejercicio25();

        System.out.print("Ingrese la cantidad de contactos a registrar: ");
        int cantidadContactos = obtener.nextInt();

        for (int i = 0; i < cantidadContactos; i++) {
            System.out.print("Ingrese el nombre del contacto #" + (i + 1) + ": ");
            obtener.nextLine(); 
            String nombre = obtener.nextLine();

            System.out.print("Ingrese el número de teléfono de " + nombre + ": ");
            String telefono = obtener.nextLine();

            agenda.agregarContacto(nombre, telefono);
        }

        // Mostrar resumen final
        System.out.println("\nLista de Contactos Registrados:");
        System.out.println(agenda.obtenerContactos());

                
                break;
                
                
            case 26:
                
                
                
                Ejercicio26 sumador1 = new Ejercicio26();

        System.out.print("Ingrese la cantidad de números a sumar: ");
        int cantidadNumeros = 0;

        while (!obtener.hasNextInt()) {
            System.out.println(" Error: Ingrese un número válido.");
            obtener.next(); 
        }
        cantidadNumeros = obtener.nextInt();

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el número #" + (i + 1) + ": ");

            while (!obtener.hasNextInt()) {
                System.out.println(" Error: Ingrese un número válido.");
                obtener.next(); 
            }

            int numero6 = obtener.nextInt();
            sumador1.agregarNumero(numero6);
        }


        System.out.println("\nLa suma total de los números ingresados es: " + sumador1.obtenerSumaTotal());
                
                
        break;
        
            case 27:
                
                Ejercicio27 tienda1 = new  Ejercicio27();

        System.out.print("Ingrese la cantidad de productos vendidos: ");
        int cantidadProductoss = 0;

        
        while (!obtener.hasNextInt()) {
            System.out.println("Error: Ingrese un número válido.");
            obtener.next(); 
        }
        cantidadProductoss = obtener.nextInt();

        for (int i = 0; i < cantidadProductoss; i++) {
            System.out.print("\nIngrese el nombre del producto #" + (i + 1) + ": ");
            obtener.nextLine(); 
            String nombre5 = obtener.nextLine();

            System.out.print("Ingrese el precio de " + nombre5 + ": ");
            while (!obtener.hasNextDouble()) {
                System.out.println(" Error: Ingrese un precio válido.");
                obtener.next(); 
            }
            double precio3 = obtener.nextDouble();

            System.out.print("Ingrese la cantidad vendida de " + nombre5 + ": ");
            while (!obtener.hasNextInt()) {
                System.out.println("Error: Ingrese una cantidad válida.");
                obtener.next();
            }
            int cantidad4 = obtener.nextInt();

            tienda1.registrarProducto(nombre5, precio3, cantidad4);
        }

      
        System.out.println("\nResumen de Ventas:");
        System.out.println(tienda1.obtenerResumenVentas());
        System.out.println("Total de Ventas: $" + tienda1.obtenerTotalVentas());
                break;
                
                
            case 28:
                 String nombre6, apellido;

        System.out.print("Ingrese su nombre: ");
        nombre6 = obtener.nextLine();

        System.out.print("Ingrese su apellido: ");
        apellido = obtener.nextLine();

        System.out.println("Bienvenido, " + nombre6 + " " + apellido + "!");
                break;
                
            case 29:
                 int edad2 = 25;
        System.out.println("Tienes " + edad2+ " años.");
                break;
            case 30:
                double precio2 = 19.99;
        System.out.println("El precio del artículo es $" + precio2);
                break;

            case 31:
                boolean esEstudiante = true;
        System.out.println("¿Es usted estudiante? [Verdadero/Falso]: " + esEstudiante);
                
                break;
            case 32:
                char letra = 'A';
        System.out.println("La letra asignada es: " + letra);
                
                
                break;
            case 33:
                  System.out.print("Ingrese su nombre: ");
        String nombre4 = obtener.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido4 = obtener.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad4 = obtener.nextInt();

        System.out.print("Ingrese el precio del artículo: $");
        double precio4 = obtener.nextDouble();

        System.out.print("¿Es usted estudiante? (true/false): ");
        boolean esEstudiante4 = obtener.nextBoolean();

        char letra4 = 'F'; 

        System.out.println("\nFACTURA ");
        System.out.println("Cliente: " + nombre4 + " " + apellido4);
        System.out.println("Edad: " + edad4 + " años");
        System.out.println("Artículo comprado: Código " + letra4);
        System.out.println("Precio: $" + precio4);
        System.out.println("¿Es estudiante?: " + esEstudiante4);
                break;
                
            case 34:
              String nombre5 = "Dauri";
        String apellido5 = "Jaimes";
        int edad5 = 25;
        String producto5 = "Laptop";
        int cantidad5 = 2;
        double precioUnitario5 = 1500.00;
        boolean esEstudiante5 = true;
        char tipoCliente5 = 'A';

        double subtotal5 = cantidad5 * precioUnitario5;
        double impuesto5 = esEstudiante5 ? subtotal5 * 0.05 : subtotal5 * 0.13;
        double total5 = subtotal5 + impuesto5;

        System.out.println("\n========== FACTURA ==========");
        System.out.println("Cliente: " + nombre5 + " " + apellido5);
        System.out.println("Edad: " + edad5 + " años");
        System.out.println("Tipo de cliente: " + tipoCliente5);
        System.out.println("Producto: " + producto5);
        System.out.println("Cantidad: " + cantidad5);
        System.out.println("Precio unitario: $" + precioUnitario5);
        System.out.println("Subtotal: $" + subtotal5);
        System.out.println("Impuesto aplicado: $" + impuesto5);
        System.out.println("Total a pagar: $" + total5);
        System.out.println("¿Es estudiante?: " + esEstudiante5);
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
    

