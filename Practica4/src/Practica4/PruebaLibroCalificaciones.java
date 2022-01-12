/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica4;
import java.util.Scanner;
/**
 *
 * @author MKetzalli
 */
public class PruebaLibroCalificaciones {

    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        LibroCalificaciones LB = new LibroCalificaciones();
        System.out.println("Escribe el nombre del curso:");
        String nombreDelCurso=in.nextLine();
        System.out.println();
        LB.mostrarMensaje(nombreDelCurso);
    }
}
