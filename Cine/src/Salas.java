package cine;

import java.util.Scanner;
//declaracion de clase Salas

public class Salas {

    //declaracion de variables
    int sala, asiento, x, xp;
    //declaracion de un arreglo bidimensional que organice [3] salas con [100] asientos cada una
    int[][] salas = new int[3][100];
    //declarar escaner
    Scanner ingreso = new Scanner(System.in);

    //metodo para regresar los valores de las variables a sus iniciales
    public void VCero() {
        sala = 0;
        asiento = 0;
        x = 0;
        xp = 9;
    }

    //metodo para que todos los asientos se encuentren en estatus de vacio (0)
    public void Reinicio() {
        VCero();
        //recorre salas
        while (sala < 3) {
            //recorre asientos
            while (asiento < 100) {
                //asigna los valores de libre (0)
                salas[sala][asiento] = 0;
                asiento++;
            }
            sala++;
        }
    }

    //metodo para pasar un asiento de libre (0) a ocupado (1)
    public void Reserva() {
        VCero();
        //solicita sala y asiento para reservar
        System.out.println("seleccione sala");
        sala = ingreso.nextInt();
        System.out.println("seleccione asiento");
        asiento = ingreso.nextInt();
        //verifica si el asiento esta ocupado
        if (salas[sala][asiento] == 1) {
            System.out.println("asiento ocupado");
        }
        //si el asiento esta desocupado lo marca como reservado con exito
        if (salas[sala][asiento] == 0) {
            salas[sala][asiento] = 1;
            System.out.println("asiento reservado con exito (sala " + sala + " asiento " + asiento);
        }
    }

    //metodo para cancelar la reservacion de un asiento
    public void Cancelacion() {
        VCero();
        //solicita sala y asiento para cancelar el lugar
        System.out.println("seleccione sala");
        sala = ingreso.nextInt();
        System.out.println("seleccione asiento");
        asiento = ingreso.nextInt();
        //verifica si el asiento esta libre
        if (salas[sala][asiento] == 0) {
            System.out.println("no se puede cancelar porque no esta reservado el asiento");
        }
        //cambia el estatus del asiento de ocupado a libre
        if (salas[sala][asiento] == 1) {
            salas[sala][asiento] = 0;
            System.out.println("cancelacion exitosa (sala " + sala + " asiento: " + asiento + ")");
        }
    }

    //muestra todos los asientos de una sala en base a su disponibilidad (1 u 0)
    public void Consultar() {
        VCero();
        //solicita sala a consultar
        System.out.println("seleccione sala");
        sala = ingreso.nextInt();
        //divide los asientos de 10 en 10
        while (xp <= 100) {
            //muestra los estatus de los asientos
            while (x <= xp) {
                System.out.print(salas[sala][x]);
                x++;
            }
            System.out.println("\n");
            xp += 10;
        }

    }
}
