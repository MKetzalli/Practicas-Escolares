package biblioteca;

import java.util.Scanner;

public abstract class Prestamo {

    //declaracion de variables
    int id, menu;
    String correcto = "Accion completada correctamente", incorrecto = "Accion erronea";
    //objeto escaner
    Scanner ingreso = new Scanner(System.in);

    //metodos abstractos para que libro sobreescriba
    public abstract void Base();

    public abstract void Mostrar();

    //metodo para seleccionar un id de distincion de los libros
    public int Seleccionar() {
        //4.-error por tipo de dato ingresado erroneo
        try {
            System.out.print("ingrese id de libro: ");
            id = ingreso.nextInt();
            ingreso.nextLine();
        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e);
        }
        return (id);
    }

    //metodo para la seleccion de total o independiente
    public int TotInd() {
        //5.-error por tipo de dato ingresado erroneo
        try {
            System.out.println("1.-Mostrar todos");
            System.out.println("2.-Mostrar individual");
            menu = ingreso.nextInt();
            ingreso.nextLine();
        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e);
        }
        return (menu);
    }

}
