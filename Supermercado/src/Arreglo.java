package supermercado;

import java.util.Scanner;
//declaracion de clase arreglo

public class Arreglo {

    //declaracion de variables
    int i;
    float descuento;
    //declaracion de los arreglos, los valores se dieron para no tener que ingresar uno a uno
    //en el menu se ofrece la opcion de editar estos valores
    //NombreProducto almacena los nombres de los productos
    //PrecioProducto almacena el precio de mayoreo, menudeo y descuento
    String[] NombreProducto = {"p1", "p2", "p3", "p4", "p5"};
    float[][] PrecioProducto = {{100, 100, 100, 100, 100}, {20, 20, 20, 20, 20}, {50, 50, 50, 50, 50}};
    //declaracion del escaner
    Scanner ingreso = new Scanner(System.in);

    //declaracion metodo que indica el descuento aplicado al precio de mayoreo
    public void Comparar() {
        //solicitar identificador de registro a comparar
        System.out.println("\ningrese id del producto para comparar su precio: ");
        i = ingreso.nextInt();
        //instruccion para evitar el programa se salte la siguiente solicitud de ingreso por teclado
        ingreso.nextLine();
        //mostrar el registro indicado
        System.out.println("id Producto: " + i + " Producto: " + NombreProducto[i] + " Mayoreo: " + PrecioProducto[0][i] + " Menudeo: " + PrecioProducto[1][i] + " Descuento: " + PrecioProducto[2][i]);
        System.out.println("precio menudeo: " + PrecioProducto[1][i]);
        //operaciones para aplicar el descuento
        descuento = PrecioProducto[0][i] * (PrecioProducto[2][i] / 100);
        System.out.println("total descuento a mayoreo: " + descuento);
        descuento = PrecioProducto[0][i] - descuento;
        System.out.println("total a pagar en mayoreo aplicando el descuento: " + descuento);
    }

    //declaracion metodo que muestra los valores almacenados en los arreglos
    public void MostrarDatos() {
        i = 0;
        //ciclo para imprimir registro por registro
        while (i <= 4) {
            System.out.println("\nid Producto: " + i + " Producto: " + NombreProducto[i] + " Mayoreo: " + PrecioProducto[0][i] + " Menudeo: " + PrecioProducto[1][i] + " Descuento: " + PrecioProducto[2][i]);
            i++;
        }
    }

    //declaracion metodo para editar los valores que se encuentran registrados en los arreglos
    public void SobreescribirDatos() {
        //solicitar identificador de dato que se desea cambiar
        System.out.println("\ningrese id de dato a cambiar: ");
        i = ingreso.nextInt();
        ingreso.nextLine();
        //mostrar registro correspondiente a identificador ingresado
        System.out.println("id Producto: " + i + " Producto: " + NombreProducto[i] + " Mayoreo: " + PrecioProducto[0][i] + " Menudeo: " + PrecioProducto[1][i] + " Descuento: " + PrecioProducto[2][i]);
        System.out.println("SOBREESCRITURA:");
        //aplicacion de metodo para pedir valores nuevos
        PedirValores();
    }

    //declaracion metodo para solicitar los valores que se ingresaran a los arreglos
    public void PedirValores() {
        System.out.println("\ningrese nombre de producto no." + i + ": ");
        //asignacion de valor a la posicion marcada
        NombreProducto[i] = ingreso.nextLine();
        System.out.println("ingrese precio de mayoreo");
        PrecioProducto[0][i] = ingreso.nextFloat();
        System.out.println("ingrese precio de menudeo");
        PrecioProducto[1][i] = ingreso.nextFloat();
        System.out.println("ingrese descuento");
        PrecioProducto[2][i] = ingreso.nextFloat();
        ingreso.nextLine();
    }

}
