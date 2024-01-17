package com.canard;

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

    public Productos(int ID_producto, String nombre, int stock, int precioUnitario, Date ultimaVenta, Date ultimoIngreso, String descripcion) { //metodo constructor
        Scanner sc = new Scanner(System.in);

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
        this.ultimaVenta = ingresarFecha(Scanner);

        System.out.println("ingrese la fecha del ultimo ingreso (Formato: dd/MM/yyyy) : ");
        this.ultimoIngreso = ingresarFecha(Scanner);

        this.descripcion = sc.nextLine();

    }


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
        ListaProductos.add(new Productos(int ID_producto, String nombre, int stock, int precioUnitario, Date ultimaVenta, Date ultimoIngreso, String descripcion));
    }




    public void incrementarStock(Scanner sc){ //incrementa el stock las veces que ingreses por teclado// tilizando el id
        System.out.println("ingrese el id que quiere incrementar el stock: ");
        id_producto_incrementar = sc.nextInt();
        for(int i = 0; i < ListaProductos.zide; i++)
            if(id_pruducto_incrementar == ID_producto){
                System.out.println("cual es la cantidad de productos que queres agregar al stock?: ");
                ListaProductos[i].stock += sc.nextInt();
                break;
            }
    }

    public void reducirStock(){  //decrementa en 1 al stock utilizando el id
        System.out.println("ingrese el id que quiere decrementar el stock: ");
        id_producto_incrementar = sc.nextInt();
        for(int i = 0; i < ListaProductos.zide; i++)
            if(id_pruducto_incrementar == ID_producto){
                System.out.println("cual es la cantidad de productos que queres quitar al stock?: ");
                ListaProductos[i].stock -= sc.nextInt();
                break;
            }
    }

    public void consultarStock(){  //te da la información del stock para 1 producto en especifico utilizando su id
        System.out.println("ingrese el id que quiere consultar el stock: ");
        id_producto_incrementar = sc.nextInt();
        for(int i = 0; i < ListaProductos.zide; i++)
            if(id_pruducto_incrementar == ID_producto){
                System.out.println("el stock del producto es: " + ListaProductos[i].stock);
                break;
            }
    }

    public void consultarDatos(){  //consulta todos los datos de un producto en especifico utilizando su id
        System.out.println("ingrese el id que quiere consultar sus datos: ");
        id_producto_incrementar = sc.nextInt();
        for(int i = 0; i < ListaProductos.zide; i++)
            if(id_pruducto_incrementar == ID_producto){
                System.out.println("ID: " + ListaProductos[i].ID_producto);
                System.out.println("Nombre: " + ListaProductos[i].nombre);
                System.out.println("Stock: " + ListaProductos[i].stock);
                System.out.println("Precio Unitario: " + ListaProductos[i].precioUnitario);
                System.out.println("Última Venta: " + ListaProductos[i].ultimaVenta);
                System.out.println("Último Ingreso: " + ListaProductos[i].ultimoIngreso);
                System.out.println("Descripción: " + ListaProductos[i].descripcion);
                break;
            }
    }
}
