package com.canard;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class Productos {
    int ID_producto;
    String nombre;
    int stock;
    int precioUnitario;
    Date ultimaVenta;
    Date ultimoIngreso;
    String descripcion;

    ArrayList<Productos> ListaProductos = new ArrayList<Productos>(); // creo la lista
    Scanner sc = new Scanner(System.in);

    public Productos(int ID_producto, String nombre, int stock, int precioUnitario, Date ultimaVenta, Date ultimoIngreso, String descripcion) { //metodo constructor


        System.out.println("ingrese el id del producto: ");
        this.ID_producto = sc.nextInt();
        sc.nextLine(); //come el enter

        System.out.println("ingrese el nombre del producto: ");
        this.nombre = sc.nextLine();

        System.out.println("ingrese la cantidad de stock que tengas actualmente: ");
        this.stock = sc.nextInt();
        sc.nextLine();//come el enter

        System.out.println("ingresa el precio del producto: ");
        this.precioUnitario = precioUnitario;
        sc.nextLine(); //come el enter

        System.out.println("ingrese la fecha de la ultima venta (Formato: dd/MM/yyyy) : ");
        this.ultimaVenta = ingresarFecha(sc);

        System.out.println("ingrese la fecha del ultimo ingreso (Formato: dd/MM/yyyy) : ");
        this.ultimoIngreso = ingresarFecha(sc);

        this.descripcion = sc.nextLine();

    }


    public Date ingresarFecha(Scanner sc){ // convierte la fecha ingresada en tipo string y la transforma en tipo date

        String fechaString = sc.nextLine(); // ingreso la fecha en formato string
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); //creo la variable donde va a ser almacenado la conversion de string a date

        try {
            return dateFormat.parse(fechaString); // retorno el valor date tranformado del string
        } catch (ParseException e) {
            System.out.println("Error: Asegúrese de seguir el formato correcto."); //la excepcion si no es correcto el tipeo del string
            return null;
        }

    }
    public void agregarProducto(){ //agrega el producto a la lista con sus atributos mediante el metodo constructor
        ListaProductos.add(new Productos(ID_producto, nombre, stock, precioUnitario, ultimaVenta, ultimoIngreso, descripcion));
    }

//int ID_producto, String nombre, int stock, int precioUnitario, Date ultimaVenta, Date ultimoIngreso, String descripcion


    public void incrementarStock(Scanner sc){ //incrementa el stock las veces que ingreses por teclado// utilizando el id
        System.out.println("ingrese el id que quiere incrementar el stock: ");
        int id_producto_incrementar = sc.nextInt();
        for(int i = 0; i < ListaProductos.size(); i++)
            if(id_producto_incrementar == ID_producto){
                System.out.println("cual es la cantidad de productos que queres agregar al stock?: ");
                ListaProductos.get(i).stock += sc.nextInt();
                break;
            }
    }

    public void reducirStock(){  //decrementa en 1 al stock utilizando el id
        System.out.println("ingrese el id que quiere decrementar el stock: ");
        int id_producto_incrementar = sc.nextInt();
        for(int i = 0; i < ListaProductos.size(); i++)
            if(id_producto_incrementar == ID_producto){
                System.out.println("cual es la cantidad de productos que queres quitar al stock?: ");
                ListaProductos.get(i).stock -= sc.nextInt();
                break;
            }
    }

    public void consultarStock(){  //te da la información del stock para 1 producto en especifico utilizando su id
        System.out.println("ingrese el id que quiere consultar el stock: ");
        int id_producto_incrementar = sc.nextInt();
        for(int i = 0; i < ListaProductos.size(); i++)
            if(id_producto_incrementar == ID_producto){
                System.out.println("el stock del producto es: " + ListaProductos.get(i).stock);
                break;
            }
    }

    public void consultarDatos(){  //consulta todos los datos de un producto en especifico utilizando su id
        System.out.println("ingrese el id que quiere consultar sus datos: ");
        int id_producto_incrementar = sc.nextInt();
        for(int i = 0; i < ListaProductos.size(); i++)
            if(id_producto_incrementar == ID_producto){
                System.out.println("ID: " + ListaProductos.get(i).ID_producto);
                System.out.println("Nombre: " + ListaProductos.get(i).nombre);
                System.out.println("Stock: " + ListaProductos.get(i).stock);
                System.out.println("Precio Unitario: " + ListaProductos.get(i).precioUnitario);
                System.out.println("Última Venta: " + ListaProductos.get(i).ultimaVenta);
                System.out.println("Último Ingreso: " + ListaProductos.get(i).ultimoIngreso);
                System.out.println("Descripción: " + ListaProductos.get(i).descripcion);
                break;
            }
    }
}
