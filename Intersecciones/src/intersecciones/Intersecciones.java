/**
 * @author MKetzalli
 */
//paquete
package intersecciones;

//clase intersecciones
public class Intersecciones {

    //metodo main
    public static void main(String args[]) {
        //declaracion de arreglo
        String lista[] = {"3", "1", "1", "4", "3", "0", "2", "3"};
        String lista2[] = {"6", "1", "3", "9", "0", "6"};
        String inter[] = new String[lista.length];
        int c = 0;
        //ordenacion burbuja
        for (int a = 0; a < (lista.length - 1); a++) {
            for (int b = a + 1; b < lista.length; b++) {
                if (lista[a].compareTo(lista[b]) > 0) {
                    String aux = lista[a];
                    lista[a] = lista[b];
                    lista[b] = aux;
                }
            }
        }
        for (int a = 0; a < (lista2.length - 1); a++) {
            for (int b = a + 1; b < lista2.length; b++) {
                if (lista2[a].compareTo(lista2[b]) > 0) {
                    String aux = lista2[a];
                    lista2[a] = lista2[b];
                    lista2[b] = aux;
                }
            }
        }
        //busqueda secuencial
        for (int a = 0; a < lista.length; a++) {
            for (int b = 0; b < lista2.length; b++) {
                if (lista[a] == lista2[b]) {
                    inter[c] = lista[a];
                    c++;
                }
            }
        }
        //eliminamos elementos duplicados
        for (int a = 0; a < inter.length; a++) {
            for (int b = 0; b < (inter.length - 1); b++) {
                if (a != b) {
                    if (inter[a] == inter[b]) {
                        inter[a] = "";
                    }
                }
            }
        }
        //mostrar arreglos
        System.out.println("lista 1");
        for (int a = 0; a <= (lista.length - 1); a++) {
            System.out.println(lista[a]);
        }
        System.out.println("lista 2");
        for (int a = 0; a <= (lista2.length - 1); a++) {
            System.out.println(lista2[a]);
        }
        //mostrar intersecciones
        System.out.println("intersecciones");
        for (int a = 0; a <= (inter.length - 1); a++) {
            if (inter[a] != null && inter[a] != "") {
                System.out.println(inter[a]);
            }
        }
    }
}
