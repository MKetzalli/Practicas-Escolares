package palindromas;
//importar librerias

import java.util.Stack;
import java.util.Scanner;
//clase palindromas

public class Palindromas {

    //metodo main
    public static void main(String[] args) {
        //declaracion de variables y objetos
        Scanner in = new Scanner(System.in);
        Stack pila = new Stack();
        String original;
        //se solicita la palabra
        System.out.println("ingrese palabra: ");
        original = in.nextLine();
        //se convierte la cadena en un arreglo de caracteres
        char[] coriginal = original.toCharArray();
        //convertir el arreglo de caracteres en una pila
        for (int i = 0; i < coriginal.length; i++) {
            pila.push(coriginal[i]);
        }
        //imprimir la palabra inversa con la pila
        System.out.println("palabra inversa: ");
        for (int i = 0; i < coriginal.length; i++) {
            System.out.print(pila.pop());
        }
    }
}
