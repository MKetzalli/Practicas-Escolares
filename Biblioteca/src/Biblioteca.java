package biblioteca;

import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {
        //creacion de objetos
        Libro libro = new Libro();
        Prestamo prestamo = new Libro();
        Scanner ingreso = new Scanner(System.in);
        //uso de metodo para que las variables tengan un valor inicial
        libro.Base();
        //declaracion de variables
        int menu, id;
        menu = 0;
        //ciclo para el menu, al presionar 7 se termina el programa
        while (menu != 7) {
            //opciones de menu
            System.out.println("MENU");
            System.out.println("1.-Mostrar libros");
            System.out.println("2.-Prestar libro");
            System.out.println("3.-Devolver libro");
            System.out.println("4.-Eliminar libro");
            System.out.println("5.-Agregar libro");
            System.out.println("6.-Libros prestados");
            System.out.println("7.-Salir");
            //1.-error por tipo de dato ingresado erroneo
            try {
                //seleccion del usuario se almacena en menu
                menu = ingreso.nextInt();
                ingreso.nextLine();
            } catch (Exception e) {
                System.out.println("Ocurrio un error: " + e);
            }
            //acceso a las opciones del menu
            switch (menu) {
                case 1:
                    //6.-error al ingresar id que sobrepasa el arreglo
                    try {
                        //mostrar libros
                        menu = prestamo.TotInd();
                        if (menu == 1) {
                            libro.Mostrar();
                        }                   
                        if (menu == 2) {
                            id = prestamo.Seleccionar();
                            libro.Mostrar(id);
                        }
                    } catch (Exception e) {
                        System.out.println("Ocurrio un error: " + e);
                    }
                    if (menu != 2 && menu != 1) {
                        System.out.println("ingreso incorrecto");
                    }
                    break;
                case 2:
                    //prestar libro
                    libro.Prestar();
                    break;
                case 3:
                    //devolver libro
                    libro.Devolver();
                    break;
                case 4:
                    //eliminar libro
                    libro.Eliminar();
                    break;
                case 5:
                    //agregar libro
                    libro.Agregar();
                    break;
                case 6:
                    //7.-error al ingresar id que sobrepasa el arreglo
                    try {
                        //consultar libros prestados
                        menu = prestamo.TotInd();
                        if (menu == 1) {
                            libro.Prestados();
                        }                   
                        if (menu == 2) {
                            id = prestamo.Seleccionar();
                            libro.Prestados(id);
                        }
                    } catch (Exception e) {
                        System.out.println("Ocurrio un error: " + e);
                    }
                    if (menu != 2 && menu != 1) {
                        System.out.println("ingreso incorrecto");
                    }
                    break;
                case 7:
                    //salida
                    System.out.println("Hasta pronto");
                    break;
            }
        }

    }

}
