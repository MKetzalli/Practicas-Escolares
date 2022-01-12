/*
 * @author MKetzalli
 */
//librerias
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
//clase principal Estructuras

public class Estructuras {

    //declaracion de variables
    private final Stack pila;
    private final Queue cola;
    private final LinkedList lista;
    private int tipo, accion, ingreso, indice, num;
    private final Scanner in;

    //metodo constructor
    public Estructuras() {
        //definicion de variables
        pila = new Stack();
        cola = new LinkedList();
        lista = new LinkedList();
        tipo = 0;
        indice = 0;
        num = 0;
        ingreso = 0;
        accion = 0;
        in = new Scanner(System.in);
    }

    //metodo menu
    public void Menu() {
        //asegurar que se repita el proceso hasta que el usuario desee salir
        while (tipo != 4) {
            //opciones del menu principal
            System.out.println("SELECCIONE OPCION: \n1.-pila \n2.-cola \n3.-lista \n4.-salir");
            tipo = in.nextInt();
            //verifica que la opcion deseada no sea "salir"
            if (tipo != 4) {
                //ingresa a la opcion seleccionada del menu principal
                switch (tipo) {
                    case 1:
                        //pila
                        //asegurar que se repita el proceso hasta que el usuario desee regresar
                        while (accion != 5) {
                            //opciones del menu secundario
                            System.out.println("SELECCIONE OPCION: \n1.-agregar \n2.-eliminar \n3.-consultar \n4.-validar contenido \n5.-regresar");
                            accion = in.nextInt();
                            //ingresa a la opcion seleccionada del menu secundario
                            switch (accion) {
                                case 1:
                                    //agregar
                                    System.out.println("ingrese numero: ");
                                    pila.push(in.nextInt());
                                    break;
                                case 2:
                                    //eliminar
                                    if (pila.empty() == false) {
                                        System.out.println("elemento eliminado: " + pila.pop());
                                    } else {
                                        System.out.println("imposible eliminar elemento, pila vacia");
                                    }
                                    break;
                                case 3:
                                    //consultar
                                    if (pila.empty() == true) {
                                        System.out.println("la pila esta vacia");
                                    } else {
                                        System.out.println("ultimo valor ingresado en pila es: " + pila.peek());
                                    }
                                    break;
                                case 4:
                                    //validar contenido
                                    if (pila.empty() == true) {
                                        System.out.println("la pila esta vacia");
                                    } else {
                                        System.out.println("la pila tiene elementos");
                                    }
                                    break;
                                case 5:
                                    //regresar
                                    System.out.println("Volviendo a menu anterior...");
                                    break;
                                default:
                                    System.out.println("ERROR");
                                    break;
                            }
                        }
                        accion = 0;
                        break;
                    case 2:
                        //cola
                        //asegurar que se repita el proceso hasta que el usuario desee regresar
                        while (accion != 5) {
                            //opciones del menu secundario
                            System.out.println("SELECCIONE OPCION: \n1.-agregar \n2.-eliminar \n3.-consultar \n4.-validar contenido \n5.-regresar");
                            accion = in.nextInt();
                            //ingresa a la opcion seleccionada del menu secundario
                            switch (accion) {
                                case 1:
                                    //agregar
                                    System.out.println("ingrese numero: ");
                                    cola.offer(in.nextInt());
                                    break;
                                case 2:
                                    //eliminar
                                    if (cola.size() > 0) {
                                        System.out.println("elemento eliminado: " + cola.poll());
                                    } else {
                                        System.out.println("imposible eliminar elemento, cola vacia");
                                    }
                                    break;
                                case 3:
                                    //consultar
                                    System.out.println("primer valor ingresado en cola es: " + cola.peek());
                                    break;
                                case 4:
                                    //validar contenido
                                    if (cola.size() < 1) {
                                        System.out.println("la cola esta vacia");
                                    } else {
                                        System.out.println("la cola tiene elementos");
                                    }
                                    break;
                                case 5:
                                    //regresar
                                    System.out.println("Volviendo a menu anterior...");
                                    break;
                                default:
                                    System.out.println("ERROR");
                                    break;
                            }
                        }
                        accion = 0;
                        break;
                    case 3:
                        //lista
                        //asegurar que se repita el proceso hasta que el usuario desee regresar
                        while (accion != 5) {
                            //opciones del menu secundario
                            System.out.println("SELECCIONE OPCION: \n1.-agregar \n2.-eliminar \n3.-consultar \n4.-validar contenido \n5.-regresar");
                            accion = in.nextInt();
                            //ingresa a la opcion seleccionada del menu secundario
                            switch (accion) {
                                case 1:
                                    //agregar
                                    //opciones de menu terciario
                                    System.out.println("tipo de ingreso: \n1.-en orden \n2.-por indice");
                                    ingreso = in.nextInt();
                                    //ingresa a la opcion seleccionada del menu terciario
                                    if (ingreso == 1) {
                                        //ingreso en orden
                                        System.out.println("ingrese numero: ");
                                        lista.add(in.nextInt());
                                    }
                                    if (ingreso == 2) {
                                        //ingreso por indice
                                        System.out.println("indique indice: ");
                                        indice = in.nextInt();
                                        System.out.println("ingrese numero: ");
                                        num = in.nextInt();
                                        lista.add(indice, num);
                                    }
                                    break;
                                case 2:
                                    //eliminar
                                    if (lista.size() > 0) {
                                        //opciones de menu terciario
                                        System.out.println("tipo de eliminacion: \n1.-en orden (el indice mayor) \n2.-por indice");
                                        ingreso = in.nextInt();
                                        //ingresa a la opcion seleccionada del menu terciario
                                        if (ingreso == 1) {
                                            //elimina por orden (del ultimo al primero)
                                            System.out.println("valor eliminado: " + lista.removeLast());
                                        }
                                        if (ingreso == 2) {
                                            //elimina segun indice
                                            System.out.println("indique indice: ");
                                            indice = in.nextInt();
                                            System.out.println("valor eliminado: " + lista.remove(indice));
                                        }
                                    } else {
                                        System.out.println("la lista esta vacia");
                                    }
                                    break;
                                case 3:
                                    //consultar
                                    if (lista.size() > 0) {
                                        for (int i = 0; i < lista.size(); i++) {
                                            System.out.print(lista.get(i) + " | ");
                                        }
                                        System.out.println();
                                    } else {
                                        System.out.println("la lista esta vacia");
                                    }
                                    break;
                                case 4:
                                    //validar contenido
                                    if (lista.size() < 1) {
                                        System.out.println("la lista esta vacia");
                                    } else {
                                        System.out.println("la lista tiene elementos");
                                    }
                                    break;
                                case 5:
                                    //regresar
                                    System.out.println("Volviendo a menu anterior...");
                                    break;
                                default:
                                    System.out.println("ERROR");
                                    break;
                            }
                        }
                        accion = 0;
                        break;
                    default:
                        System.out.println("ERROR");
                        break;
                }
            }
        }
        System.out.println("Hasta pronto!");
    }

    //metodo main
    public static void main(String[] args) {
        //creacion de objeto estructuras
        Estructuras estructuras = new Estructuras();
        //uso de metodo menu del objeto estructuras
        estructuras.Menu();
    }
}
