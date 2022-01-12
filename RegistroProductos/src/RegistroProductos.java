package registroproductos;

import java.util.Scanner;
//declaracion de clase

public class RegistroProductos {

    //declaracion de main
    public static void main(String[] args) {
        //declaracion de variables
        int i = 0;
        //declaracion de los arreglos
        String[] NombreProducto = new String[10];
        float[] PrecioProducto = new float[10];
        //declaracion del escaner
        Scanner ingreso = new Scanner(System.in);
        //solicitud de nombres y precio de productos
        while (i <= 9) {
            System.out.print("Ingrese nombre de producto no." + i + ": ");
            NombreProducto[i] = ingreso.nextLine();
            System.out.print("Ingrese precio de producto no." + i + ": ");
            PrecioProducto[i] = ingreso.nextFloat();
            ingreso.nextLine();//instruccion puesta para evitar que el enter se quede registrado y salte el siguiente ingreso
            //verificacion de que precio sea mayor o igual a 500
            while (PrecioProducto[i] < 500) {
                System.out.println("Precio de producto no aceptado, ingrese nuevamente: ");
                System.out.print("Ingrese precio de producto no." + i + ": ");
                PrecioProducto[i] = ingreso.nextFloat();
                ingreso.nextLine();
            }
            i++;
        }
        System.out.println("\nLista de productos en sistema:");
        i = 0;
        //impresion de registros en pantalla
        while (i <= 9) {
            System.out.println("Producto: " + NombreProducto[i] + "~~~~~~ Precio: " + PrecioProducto[i]);
            i++;
        }

    }

}
