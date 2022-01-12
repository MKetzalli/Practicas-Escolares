package milreinas;
/*
@author MKetzalli
ver. 1.1 finalizada 12/07/2019
DESCRIPCION: en base al problema del milenio "mil reinas" donde se debe colocar en un tablero de ajedrez de 1000x1000 a 1000 reinas que no se ataquen entre si
tomando en cuenta que las reinas atacan de forma horizontal, vertical y diagonal, en el tablero se ponen reinas al inicio y posteriormente el programa debera
ingresar nuevas reinas que no se ataquen entre si (sin mover las ya existentes)
NOTA1: por ahora no se ha implementado que el programa ingrese reinas aparte de las establecidas
*/
public class MilReinas {

    public static void main(String[] args) {
        Ajedrez ajedrez=new Ajedrez();
        ajedrez.Accion();
    }

}
