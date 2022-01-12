package cine;

import java.util.Scanner;

public class Cine {

    //clase principal
    public static void main(String[] args) {
        //declaracion de objeto de la clase Salas
        Salas prueba = new Salas();
        //declaracion de variable
        int menu = 0;
        //declaracion de escaner
        Scanner ingreso = new Scanner(System.in);
        //metodo para que todos los asientos esten vacios
        prueba.Reinicio();
        //menu con las opciones indicadas, donde al ser 4 se terminara el programa
        while (menu != 4) {
            System.out.println("MENU \n1.Reservar\n2.Consultar\n3.Cancelar\n4.Salir");
            menu = ingreso.nextInt();
            switch (menu) {
                case 1:
                    //metodo para crear la reserva del asiento
                    prueba.Reserva();
                    break;
                case 2:
                    //metodo para consultar la disponibilidad de asientos en la sala escogida
                    prueba.Consultar();
                    break;
                case 3:
                    //metodo para cancelar la ocupacion de un asiento
                    prueba.Cancelacion();
                    break;
                case 4:
                    System.out.println("Hasta pronto.");
                    //menu=4 para salir
                    menu = 4;
                    break;

            }
        }

    }

}
