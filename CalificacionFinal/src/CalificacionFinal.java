//importar paqueteria
import java.util.Scanner;
//definir clase
public class CalificacionFinal{
    public static void main(String args[]){
        //definir escaner y variables
        Scanner ingreso=new Scanner(System.in);
        float c1,c2,c3,c4,c5,calf;
        int opcion=0;
        String foro="actividades colaborativas", act="tareas", ea="evidencia de aprendizaje", atr="autorreflexiones", acd="asignacion a cargo del docente";
        //solicitud de calificaciones por medio del metodo
        do{
            c1=Ingreso(foro);
            c2=Ingreso(act);
            c3=Ingreso(ea);
            c4=Ingreso(atr);
            c5=Ingreso(acd);
            calf=Calificacion(c1,c2,c3,c4,c5);
            //definir desempeño en base a los rangos indicados
            if(calf>=81&&calf<=100){
                System.out.println("muy buen desempeño");
            }
            if(calf>=61&&calf<81){
                System.out.println("buen desempeño");
            }
            if(calf>=41&&calf<61){
                System.out.println("desempeño regular");
            }
            if(calf>=21&&calf<41){
                System.out.println("necesitas mejorar");
            }
            if(calf>=1&&calf<21){
                System.out.println("desempeño insuficiente");
            }
            if(calf>=0&&calf<1){
                System.out.println("no presento");
            }
            if(calf<0||calf>100){
                System.out.println("ingreso invalido");
            }
            System.out.println("calificacion final: "+calf);
            //opcion para repetir programa o salir
            System.out.println("desea intentar nuevamente? 1)si 2)no");
            opcion=ingreso.nextInt();
        }while(opcion==1);
        //do while para asegurarse que el programa se ejecute por lo menos una vez y permitir definir si salir del mismo o no
    }
    //metodo
    public static float Ingreso(String x){
        //definir escaner y variables
        Scanner ingreso=new Scanner(System.in);
        float y=0;
        //solicitar calificacion
        System.out.println("ingrese calificacion de "+x+": ");
        y=ingreso.nextFloat();
        //retornar valor de y
        return(y);
    }
    //realizar calculo de promedio final
    public static float Calificacion(float c1,float c2,float c3,float c4,float c5){
        float cal;
        c1=(float) (c1*0.1);
        c2=(float) (c2*0.3);
        c3=(float) (c3*0.4);
        c4=(float) (c4*0.1);
        c5=(float) (c5*0.1);
        cal=c1+c2+c3+c4+c5;
        //retornar valor cal
        return(cal);
    }
}