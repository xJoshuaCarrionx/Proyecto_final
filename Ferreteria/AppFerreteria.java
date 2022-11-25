package Ferreteria;
import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class AppFerreteria {
	static ArrayList<Producto> producto=new ArrayList<Producto>();
	static Scanner s=new Scanner(System.in);
	static int rs;
	static String nombre;

	public static void main(String[] args) {
		System.out.println("----------------------");
		System.out.println("Nombre del usuario" );
	    nombre = s.nextLine();
		
		System.out.println("--------------------------------------------------");
        System.out.println("Bienvenido " + nombre + " a la Ferreteria Pochita");
        System.out.println("---------------------------------------------------");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");
        System.out.println(dtf2.format(LocalDateTime.now()));
        System.out.println("");
		llenarDatos();
		
	}
	public static void llenarDatos() {
		int opcion;
		char respuesta;
        do{
            menu();
            do{
            System.out.print("Opcion: ");
            while(!s.hasNextInt()){s.next();System.out.println("Solo numeros puede ingresar");  }
            opcion=s.nextInt();}while(opcion<1 || opcion>9);
            
            switch(opcion){
               
                case 1: llenarCatalogo();
                    break;
                case 2: verCatalogo();
                    break;
                case 3: Buscar();
                    break;
                case 4: 
                    break;
            }
            System.out.println("---------------------------");
    		System.out.println("Quiere agregar de nuevo?");
    		System.out.println("----------------------------");
    		respuesta=s.next().charAt(0);
    		System.out.println("");
    		}while(respuesta=='s'|| respuesta=='S');
    }
	public static void llenarPintura() {
		System.out.println("------------------------------------------");
		System.out.println("Digite el nombre del producto");
		String nombre=s.next();
		System.out.println("Digite el precio");
		int precio=s.nextInt();
		System.out.println("Digite el id");
		int id=s.nextInt();
		System.out.println("Digite el tipo de pintura");
		String tpintura=s.next();
		System.out.println("---------------------------------------");
		
		Pintura pinturas=new Pintura( id, nombre, precio, tpintura);
		producto.add(pinturas);
	}
	public static void llenarCerrajeria() {
		System.out.println("---------------------------------------");
		System.out.println("Digite el nombre del producto");
		String nombre=s.next();
		System.out.println("Digite el precio");
		int precio=s.nextInt();
		System.out.println("Digite el id");
		int id=s.nextInt();
		System.out.println("Digite el Tipo de seguridad");
		String tseguridad=s.next();
		System.out.println("Digite el grado de la llave");
		int nllave=s.nextInt();
		System.out.println("Digite la Tipologia del candado");
		String tcandado=s.next();
		System.out.println("-----------------------------------------");
		
		Cerrajeria cerrajerias=new Cerrajeria(id,nombre,precio,tseguridad, nllave, tcandado);
		producto.add(cerrajerias);
	}
	public static void llenarElectricidad() {
		System.out.println("-----------------------------------------");
		System.out.println("Digite el nombre del producto");
		String nombre=s.next();
		System.out.println("Digite el precio");
		int precio=s.nextInt();
		System.out.println("Digite el id");
		int id=s.nextInt();
		System.out.println("Digite el Voltaje");
		int voltaje=s.nextInt();
		System.out.println("Digite la Potencia del bombillo");
		int potencia=s.nextInt();
		System.out.println("Digite la resistencia");
		int resistencia=s.nextInt();
		System.out.println("------------------------------------------");
		Electricidad electricista=new Electricidad(id, nombre, precio, voltaje, potencia, resistencia);
		producto.add(electricista);
	}
	public static void llenarFijacionYsello() {
	    System.out.println("------------------------------------------");
		System.out.println("Digite el nombre del producto");
		String nombre=s.next();
		System.out.println("Digite el precio");
		int precio=s.nextInt();
		System.out.println("Digite el id");
		int id=s.nextInt();
		System.out.println("Digite el Tipo de sello");
		String tsello=s.next();
		System.out.println("Digite la duracion");
		int duracion=s.nextInt();
		System.out.println("------------------------------------------");
		
		FijacionYsello sellador=new FijacionYsello(id,nombre,precio, tsello,duracion);
		producto.add(sellador);
	}
	public static void menu() {
		System.out.println("\n 1.Llenar catalogo"
				+ "\n 2.Ver catalogo"
     			+ "\n 3.Buscar");
	}
	public static void menu2() {
		System.out.println("\n 1.Pinturas "
				+ "\n 2.Cerrajeria"
				+ "\n 3.Electricidad"
				+ "\n 4.Fijacion y Sello");
	}
	public static void llenarCatalogo() {
		char respuesta;
		do {
		menu2();
		int opcion;
		do{System.out.println("Opcion: ");
        while(!s.hasNextInt()){s.next();System.out.println("Solo ingrese numeros");  }
		opcion=s.nextInt();}while(opcion <0 || opcion >5);
		
		switch(opcion){
        
        case 1: llenarPintura();
                System.out.println("*Registro exitoso*");
            break;
        case 2: llenarCerrajeria();
                System.out.println("*Registro exitoso*");
            break;
        case 3: llenarElectricidad();
                System.out.println("*Registro exitoso*");
            break;
        case 4: llenarFijacionYsello();
                System.out.println("*Registro exitoso*");
            break;
        
		}
		System.out.println("--------------------------------------");
		System.out.println("Quiere agregar de nuevo?");
		System.out.println("---------------------------------------");
		respuesta=s.next().charAt(0);
		System.out.println("");
		}while(respuesta=='s'|| respuesta=='S');
	}
	public static void verCatalogo() {
		for(Producto prod: producto) {
			System.out.println(prod.MostrarProducto());
			System.out.println("*======================*");
		}
	}
	public static void Buscar() {
        ArrayList<Integer> valores = new ArrayList();
		int opcion, a,b,c,d,total;
		char respuesta;
        do{
    		menu2();
            do{
            System.out.print("Opcion: ");
            while(!s.hasNextInt()){s.next();System.out.println("Solo numeros puede ingresar");  }
            opcion=s.nextInt();}while(opcion<1 || opcion>9);
            
            switch(opcion){
                
                case 1: 
                	b=0;
                	do{
                	System.out.println("-----------------------------------");
            		System.out.println("Digite el nombre del producto");
            		String nombre=s.next();
            		System.out.println("Digite el precio");
            		int precio=s.nextInt();
            		System.out.println("Digite el id");
            		int id=s.nextInt();
            		System.out.println("Digite el tipo de pintura");
            		System.out.println("------------------------------------");
            		String tpintura=s.next();
            		Pintura busqueda = new Pintura(id, nombre, precio, tpintura);
            		boolean existe = producto.contains(busqueda);
            		if (existe) {
            			System.out.println("SubTotal de la Factura");
            			b=precio+b;
            			System.out.println(b);
            		} else {
            			System.out.println("El elemento no existe");
            		}
            		System.out.println("Quiere agregar de nuevo?");
            		respuesta=s.next().charAt(0);
            		System.out.println("");
                	}while(respuesta=='s'|| respuesta=='S');
                	valores.add(b);
                    break;
                    
                case 2: 
                	a=0;
                	do{
                	System.out.println("-------------------------------------");
            		System.out.println("Digite el nombre del producto");
            		String nombre=s.next();
            		System.out.println("Digite el precio");
            		int precio=s.nextInt();
            		System.out.println("Digite el id");
            		int id=s.nextInt();
            		System.out.println("Digite el Tipo de seguridad");
            		String tseguridad=s.next();
            		System.out.println("Digite el grado de la llave");
            		int nllave=s.nextInt();
            		System.out.println("Digite la Tipologia del candado");
            		String tcandado=s.next();
            		Cerrajeria busqueda = new Cerrajeria(id, nombre, precio, tseguridad, nllave, tcandado );
            		boolean existe = producto.contains(busqueda);
            		if (existe) {
            			System.out.println("SubTotal de la Factura");
            			a=precio+a;
            			System.out.println(a);
            		} else {
            			System.out.println("El elemento no existe");
            		}
            		System.out.println("Quiere agregar de nuevo?");
            		System.out.println("-------------------------------");
            		respuesta=s.next().charAt(0);
            		System.out.println("");
                	}while(respuesta=='s'|| respuesta=='S');
                	valores.add(a);
                    break;
                    
                case 3: 
                	c=0;
                	do{
                	System.out.println("-------------------------------------");
            		System.out.println("Digite el nombre del producto");
            		String nombre=s.next();
            		System.out.println("Digite el precio");
            		int precio=s.nextInt();
            		System.out.println("Digite el id");
            		int id=s.nextInt();
            		System.out.println("Digite el Voltaje");
            		int voltaje=s.nextInt();
            		System.out.println("Digite la Potencia del bombillo");
            		int potencia=s.nextInt();
            		System.out.println("Digite la resistencia");
            		int resistencia=s.nextInt();
            		System.out.println("--------------------------------------------");

            		Electricidad busqueda = new Electricidad(id, nombre, precio, voltaje, potencia, resistencia);
            		boolean existe = producto.contains(busqueda);
            		if (existe) {
            			System.out.println("SubTotal de la Factura");
            			c=precio+c;
            			System.out.println(c);
            		} else {
            			System.out.println("El elemento no existe");
            		}
            		System.out.println("Quiere agregar de nuevo?");
            		respuesta=s.next().charAt(0);
            		System.out.println("");
                	}while(respuesta=='s'|| respuesta=='S');
                	valores.add(c);
                    break;
                    
                case 4: 
                	d=0;
                	do{
                	System.out.println("--------------------------------------------");
            		System.out.println("Digite el nombre del producto");
            		String nombre=s.next();
            		System.out.println("Digite el precio");
            		int precio=s.nextInt();
            		System.out.println("Digite el id");
            		int id=s.nextInt();
            		System.out.println("Digite el Tipo de sello");
            		String tsello=s.next();
            		System.out.println("Digite la duracion");
            		int duracion=s.nextInt();
            		System.out.println("-----------------------------------------------");


            		FijacionYsello busqueda = new FijacionYsello(id,nombre,precio, tsello,duracion);
            		boolean existe = producto.contains(busqueda);
            		if (existe) {
            			d=precio+d;;
            		} else {
            			System.out.println("El elemento no existe");
            		}
            		System.out.println("Quiere agregar de nuevo?");
            		respuesta=s.next().charAt(0);
            		System.out.println("");
                	}while(respuesta=='s'|| respuesta=='S');
                	valores.add(d);
                    break;
            }
	         double suma = 0;
	         Iterator it = valores.iterator();
	         while (it.hasNext()) {
	                  suma = suma + (Integer) it.next();
	         }
	            System.out.println("Total Factura="+suma);

    		System.out.println("Quiere agregar de nuevo?");
    		respuesta=s.next().charAt(0);
    		System.out.println("");
    		}while(respuesta=='s'|| respuesta=='S');
		
		

	}
	   public static double calcularSuma(ArrayList<Integer> valores) {
	         double suma = 0;
	         Iterator it = valores.iterator();
	         while (it.hasNext()) {
	                  suma = suma + (Integer) it.next();
	         }
	         return suma;
	   }
	   public static void mostrarResultados(ArrayList<Integer> valores, double suma, double media) {             
	         int cont = 0;
	         System.out.println("Valores introducidos: ");
	         System.out.println(valores);
	         System.out.println("Total Factura: " + suma);
	   }
	

}
