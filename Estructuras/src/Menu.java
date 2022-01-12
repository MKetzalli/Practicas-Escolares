package estructuras;
//importar librerias

import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;
import java.util.LinkedList;

public class Menu {

    //declaracion de variables y objetos
    Scanner in = new Scanner(System.in);
    Stack pila = new Stack();
    ArrayList lista = new ArrayList();
    LinkedList cola = new LinkedList();
    int menu1, menu2;

    public void MenuPrincipal() {
        menu1 = 0;
        //comenzar menu donde al seleccionar salir(4) se acaba el programa
        while (menu1 != 4) {
            System.out.println("SELECCIONE UNA OPCION: \n1.-pilas \n2.-lista \n3.-cola \n4.-salir");
            menu1 = in.nextInt();
            //en caso de seleccionar salir(4) no permite ingresar al resto de opciones
            if (menu1 != 4) {
                menu2 = 0;
                //comenzar submenu de las acciones de cada estructura, al seleccionar menu(5) vuelve al mismo
                while (menu2 != 5) {
                    System.out.println("SELECCIONE UNA OPCION: \n1.-agregar elemento \n2.-eliminar elemento \n3.-mostrar elementos \n4.-comprobacion de contenido \n5.-volver a menu");
                    menu2 = in.nextInt();
                    //en caso de seleccionar menu(5) no permite ingresar al resto de opciones
                    if (menu2 != 5) {
                        //uso de metodo Estructuras
                        Estructuras(menu1, menu2);
                    }
                }
            }
        }
        System.out.println("Hasta pronto!!");
    }

    //metodo Estructuras que recibe los parametros menu1 y menu2
    public void Estructuras(int menu1, int menu2) {
        //verifica la opcion escogida en menu1
        switch (menu1) {
            case 1:
                //pilas
                //verificar la opcion escogida en menu2
                switch (menu2) {
                    case 1:
                        //agregar
                        System.out.println("Ingrese elemento a ingresar en pila: ");
                        pila.push(in.next());
                        break;
                    case 2:
                        //eliminar
                        System.out.println("Elemento eliminado: " + pila.pop());
                        break;
                    case 3:
                        //mostrar
                        for (int i = 0; i < pila.size(); i++) {
                            System.out.println("Elemento #" + i + " :" + pila.get(i));
                        }
                        break;
                    case 4:
                        //comprobar
                        System.out.println("Pila esta vacia?: " + pila.empty());
                        break;
                    default:
                        System.out.println("ERROR");
                        break;
                }
                break;
            case 2:
                //listas
                //verificar la opcion escogida en menu2
                switch (menu2) {
                    case 1:
                        //agregar
                        System.out.println("Ingrese elemento a ingresar en lista: ");
                        lista.add(in.next());
                        break;
                    case 2:
                        //eliminar
                        System.out.println("Ingrese numero del elemento a eliminar: ");
                        lista.remove(in.nextInt());
                        break;
                    case 3:
                        //mostrar
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println("Elemento #" + i + " :" + lista.get(i));
                        }
                        break;
                    case 4:
                        //comprobar
                        System.out.println("Lista esta vacia?: " + lista.isEmpty());
                        break;
                    default:
                        System.out.println("ERROR");
                        break;
                }
                break;
            case 3:
                //colas
                //verificar la opcion escogida en menu2
                switch (menu2) {
                    case 1:
                        //agregar
                        System.out.println("Ingrese elemento a ingresar en cola: ");
                        cola.add(in.next());
                        break;
                    case 2:
                        //eliminar
                        System.out.println("Elemento eliminado: " + cola.remove());
                        break;
                    case 3:
                        //mostrar
                        for (int i = 0; i < cola.size(); i++) {
                            System.out.println("Elemento #" + i + " :" + cola.get(i));
                        }
                        break;
                    case 4:
                        //comprobar
                        System.out.println("Cola esta vacia?: " + cola.isEmpty());
                        break;
                    default:
                        break;
                }
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }
}
