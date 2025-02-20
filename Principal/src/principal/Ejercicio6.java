
package principal;
import java.util.Scanner;

public class Ejercicio6 {
    private double precio;
    private String producto;
    private int cantidad;
    private double total;
    private int descuento;
    
    
    public Ejercicio6(  String pro){
       producto=producto(pro);
        
        
        
    }
    
    public int cantidad(Scanner obtener, String message){
        int cant=0;
        do 
        {
            System.out.print(message);
            if(!obtener.hasNextInt()){
                System.out.println("ingrese un numero entero para la cantidad: ");
                obtener.next();
                continue;
            }
            cant=obtener.nextInt();
        }while (cant<1);
        
        return cant;
    }
    
    public double precio(Scanner obtener, String message){
        double precios=0;
        do{
            System.out.println(message);
            if(!obtener.hasNextDouble()){
                  System.out.println("ingrese un numero entero o decimal para la cantidad: ");
            obtener.next();
            continue;
            }
            precios=obtener.nextDouble();
        }while(precios<0);
        
        return precios;
    }
    
    
    public String producto(String mens){
        String mensaj="";
        System.out.print(mens);
        Scanner obt = new Scanner(System.in);
        do{
                System.out.print("ALIMENTOS, VESTIMENTA  o ELECTRONICOS ");
                mensaj=obt.nextLine();
        
        }while(!mensaj.equals("ALIMENTOS")  && !mensaj.equals("VESTIMENTA") && !mensaj.equals( "ELECTRONICOS" ));
        return mensaj;
     
    }
    public String getProducto(){
        return producto;
    }
    
    public void setPrecio(int cantidad){
        this.cantidad=cantidad;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
    
    public void setDescuento(int descuento){
        this.descuento=descuento;
    }
    public void setTotal(double total){
        this.total=total;
    }
    public void setCantidad(int cant){
        cantidad=cant;
    }

        
        
    
}
