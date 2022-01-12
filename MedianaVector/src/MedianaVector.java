/**
 * @author MKetzalli
 */
//paquete
package medianavector;

//clase MedianaVector
public class MedianaVector {

    //metodo main
    public static void main(String[] args) {
        //declaracion de variables
        String lista[] = {"3", "6", "1", "1", "4", "9", "3", "1", "0", "2", "1", "6", "3"};
        String n1, n2;
        int div;
        float tam, tipo, num1, num2, mediana;
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
        //definir mediana
        tam = lista.length;
        tipo = tam % 2;
        //en caso que sea impar el tamaño del arreglo
        if (tipo == 1) {
            div = lista.length / 2;
            System.out.println("mediana es: " + lista[div]);
        }
        //en caso que sea par el tamaño del arreglo
        if (tipo == 0) {
            div = lista.length / 2;
            n1 = lista[div];
            n2 = lista[div - 1];
            num1 = Float.parseFloat(n1);
            num2 = Float.parseFloat(n2);
            mediana = (num1 + num2) / 2;
            System.out.println("mediana es: " + mediana);
        }
        //mostramos el arreglo
        for (int a = 0; a < lista.length; a++) {
            System.out.println(lista[a]);
        }
    }
}
