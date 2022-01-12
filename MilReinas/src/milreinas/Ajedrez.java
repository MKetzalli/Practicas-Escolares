package milreinas;

import java.util.Scanner;

public class Ajedrez {

    /*
    0 = vacio
    1 = reina
    2 = ataque de reina
     */
    int filas = 1000, columnas = 1000, diagonalA, diagonalB;
    int tablero[][] = new int[filas][columnas];
    Scanner ingreso = new Scanner(System.in);

    public int[][] Inicializacion() {
        //inicializacion del tablero
        for (int a = 0; a < 1000; a++) {
            for (int b = 0; b < 1000; b++) {
                tablero[a][b] = 0;
            }
        }
        return (tablero);
    }

    public int[][] SolicitarReinas(int tablero[][]) {
        System.out.println("ingrese cantidad de reinas a poner: ");
        int reinas=ingreso.nextInt();
        int reinasIngresadas=0;
        while(reinasIngresadas<reinas){
            System.out.println("ingrese fila de reina: ");
            int fila=ingreso.nextInt();
            System.out.println("ingrese columna de reina: ");
            int columna=ingreso.nextInt();
            if(tablero[fila][columna]==2 || tablero[fila][columna]==1){
                System.out.println("posicion no autorizada");
            }else{
                tablero[fila][columna]=1;
                tablero=BloquearCasillas(tablero);
                reinasIngresadas++;
                System.out.println("reina colocada correctamente");
            }
        }
        return(tablero);
    }

    public int[][] BloquearCasillas(int tablero[][]) {
        //bloquear casillas de la reina
        for (int a = 0; a < 1000; a++) {
            for (int b = 0; b < 1000; b++) {
                if (tablero[a][b] == 1) {
                    //bloquea fila de la reina
                    for (int c = 0; c < 1000; c++) {
                        if (tablero[a][c] == 1) {
                            tablero[a][c] = 1;
                        } else {
                            tablero[a][c] = 2;
                        }
                    }
                    //bloquea columna de la reina
                    for (int c = 0; c < 1000; c++) {
                        if (tablero[c][b] == 1) {
                            tablero[c][b] = 1;
                        } else {
                            tablero[c][b] = 2;
                        }
                    }
                    //bloquear diagonales de la reina                   
                    //derecha superior
                    diagonalA = a - 1;
                    diagonalB = b + 1;
                    while (diagonalA >= 0 && diagonalB < columnas) {
                        tablero[diagonalA][diagonalB] = 2;
                        diagonalA--;
                        diagonalB++;
                    }
                    //izquierda superior
                    diagonalA = a - 1;
                    diagonalB = b - 1;
                    while (diagonalA >= 0 && diagonalB >= 0) {
                        tablero[diagonalA][diagonalB] = 2;
                        diagonalA--;
                        diagonalB--;
                    }
                    //derecha inferior
                    diagonalA = a + 1;
                    diagonalB = b + 1;
                    while (diagonalA < filas && diagonalB < columnas) {
                        tablero[diagonalA][diagonalB] = 2;
                        diagonalA++;
                        diagonalB++;
                    }
                    //izquierda inferior
                    diagonalA = a + 1;
                    diagonalB = b - 1;
                    while (diagonalA < filas && diagonalB >= 0) {
                        tablero[diagonalA][diagonalB] = 2;
                        diagonalA++;
                        diagonalB--;
                    }
                }
            }
        }
        return(tablero);
    }

    public void Imprimir(int tablero[][]) {
        //impresion de tablero
        for (int a = 0; a < 1000; a++) {
            for (int b = 0; b < 1000; b++) {
                System.out.print("|" + tablero[a][b]);
            }
            System.out.print("\n");
        }
    }
    public void Accion(){            
        Imprimir(SolicitarReinas(Inicializacion()));
    }
}
