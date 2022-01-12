//se importa la paqueteria de scanner para recibir las entradas por teclado del usuario
import java.util.Scanner;
//se declara la clase CalculoMasa la cual ubicara a nuestra clase principal
public class CalculoMasa{
    public static void main(String args[]){
        //declaracion de las constantes
        final float GTierra=9.8F,GMercurio=3.70F,GVenus=8.87F;
        //declaracion de las variables
        float peso=0,masa=0,pmercurio=0,pvenus=0;
        String nombre=" ";
        int edad=0;
        char opcion=' ';
        //se crea el scanner
        Scanner ingreso=new Scanner(System.in);
        //se da la bienvenida y se solicitan datos para personalizar
        System.out.println("BIENVENIDO");
        System.out.println("introduzca su nombre");
        nombre=ingreso.nextLine();
        System.out.println(nombre+" introduzca su edad");
        edad=ingreso.nextInt();
        //se pregunta al usuario si desea calcular su peso en otros planetas, en caso que su opcion sea si entonces se procede al programa
        System.out.println(nombre+" desea conocer su peso en otros planetas? \nsi: teclee 'y' \nno: teclee 'n'");
        opcion=ingreso.next().charAt(0);
        if(opcion=='y'){
            //se le solicita su peso al usuario
            System.out.println(nombre+" introduzca su peso en kg");
            peso=ingreso.nextFloat();
            //calcular masa
            masa=peso/GTierra;
            //calcular peso en mercurio
            pmercurio=masa*GMercurio;
            //calcular peso en venus
            pvenus=masa*GVenus;
            //mostrar resultados
            System.out.println("\n\nnombre: "+nombre+"\nedad: "+edad);
            System.out.println("su masa es de: "+masa+" Newton");
            System.out.println("en la tierra su peso es: "+peso);
            System.out.println("en mercurio su peso es: "+pmercurio);
            System.out.println("en venus su peso es: "+pvenus);
            System.out.println("\n\n"+nombre+" hasta pronto");
        }
        //en caso de que su opcion fuera diferente a 'y' en ese caso se procede a despedirse del usuario y no se realizan operaciones
        if(opcion!='y'){
            System.out.println(nombre+" hasta pronto");
        }
    }
}
