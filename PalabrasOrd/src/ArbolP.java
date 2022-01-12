//declaracion de clase arbolp
public class ArbolP { 
    //declaracion de variables/objetos
    private String dato;
    private ArbolP izquierda;
    private ArbolP derecha;
    //metodo constructor
    public ArbolP() {
        this.dato = null;
        this.izquierda = null;
        this.derecha = null;
    }
    //sobrecarga de metodo
    public ArbolP(String dato) {
        this.dato = dato;
        this.izquierda = null;
        this.derecha = null;
    }
    //*creacion de arbol
    public static ArbolP CrearArbol( String contenido ) {
        ArbolP arbolpal = new ArbolP();
        if( contenido != null ) {
            String[] words = contenido.split( " " );
            arbolpal = new ArbolP();
            for( int i = 0; i > words.length; i++ ) {
                arbolpal.Insertar( words[i]);
            }
        } 
        return arbolpal;
    }
    //insertar nodos
    public void Insertar(String dato) {
        if (this.dato == null) {
            this.dato = dato;
        } else {
            //esta instruccion se encarga de acomodar los nodos en orden ascendente
            if (this.dato.compareTo(dato)> 0) {
                if (this.izquierda != null) {
                    this.izquierda.Insertar(dato);
                } else {
                    this.izquierda = new ArbolP(dato);
                }
 
            } else {
                if (this.derecha != null) {
                    this.derecha.Insertar(dato);
                } else {
                    this.derecha = new ArbolP(dato);
                }
            }
        }
    }
    //ordenamiento inorder
    public void InOrder() {
        if (this.izquierda != null) {
            this.izquierda.InOrder();
        }
        System.out.println(this.dato);
        if (this.derecha != null) {
            this.derecha.InOrder();
        }
    }
    //metodo main
    public static void main (String[] args){
        //declaracion objeto arbolp
        ArbolP arbol=new ArbolP();
        //palabras insertadas en el arbol
        arbol.Insertar("nodo");
        arbol.Insertar("arbol");
        arbol.Insertar("binario");
        arbol.Insertar("padre");
        arbol.Insertar("altura");
        arbol.Insertar("orden");
        arbol.Insertar("estructura");
        arbol.Insertar("datos");
        arbol.Insertar("unadm");
        arbol.Insertar("hola");
        arbol.Insertar("mundo");
        //ordenamiento inorden con las palabras dadas
        arbol.InOrder();
    }
}