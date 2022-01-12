package supermercado;

import java.util.Scanner;

public class Supermercado {

    //clase main
    public static void main(String[] args) {
        //declaracion de variables
        int menu = 0;
        //declaracion del escaner
        Scanner ingreso = new Scanner(System.in);
        //creacion de objeto de la clase arreglo
        Arreglo opcion = new Arreglo();
        //ingreso al menu con las opciones a realizar en el arreglo
        //es un ciclo para que se repita hasta que el usuario desee salir
        while (menu != 4) {
            System.out.println("\nescoja una opcion: \n1.Mostrar Datos \n2.Comparar \n3.Sobreescribir Dato \n4.Salir");
            menu = ingreso.nextInt();
            switch (menu) {
                case 1:
                    //metodo obtenido por el objeto creado de arreglo
                    //permite mostrar todos los registros almacenados en los arreglos
                    opcion.MostrarDatos();
                    break;
                case 2:
                    //metodo obtenido por el objeto creado de arreglo
                    //permite mostrar el valor de descuentro aplicado al precio de mayoreo
                    opcion.Comparar();
                    break;
                case 3:
                    //metodo obtenido por el objeto creado de arreglo
                    //permite editar un registro
                    opcion.SobreescribirDatos();
                    break;
                default:
                    System.out.println("Hasta pronto");
                    //menu = 4 es para dar la salida al programa
                    menu = 4;
                    break;
            }
        }

    }

}
