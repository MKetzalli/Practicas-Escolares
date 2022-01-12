//importar libreria
import java.util.Scanner;
//creacion de clase Principal
public class Principal {
    //metodo main
    public static void main(String[] args){
       //declaracion de objetos/variables
        ABB arbol=new ABB();
        Scanner in=new Scanner(System.in);
        int num;
        //valores insertados
        arbol.Insertar(6);
        arbol.Insertar(1);
        arbol.Insertar(2);
        arbol.Insertar(8);
        arbol.Insertar(4);
        arbol.Insertar(9);
        arbol.Insertar(7);         
        //acomodo
        System.out.println("INORDEN");
        arbol.InOrden();
        System.out.println();
        System.out.println("PREORDEN");
        arbol.PreOrden();
        System.out.println();
        System.out.println("POSTORDEN");
        arbol.PostOrden();
        System.out.println();
        //busqueda
        System.out.print("indique numero a buscar: ");
        num=in.nextInt();
        arbol.Buscar(num);
        //eliminar
        System.out.print("indique numero a eliminar: ");
        num=in.nextInt();
        arbol.Borrar(num);
        //mostrar
        System.out.println("INORDEN");
        arbol.InOrden();
        //cantidad de hojas
        System.out.println();
        System.out.println("Cantidad de hojas: "+arbol.Hojas());
    }
}
