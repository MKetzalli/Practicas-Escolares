public class ABB {
    public Nodo raiz;
    //metodo constructor
    public void ABB() {
        Nodo raiz = new Nodo();
    }
    //indica si el arbol contiene elementos
    public boolean ArbolVacio() {
        return (raiz == null);
    }
    //inserta nodos
    public void Insertar(int a) {
        if (ArbolVacio()) {
            Nodo nuevo = new Nodo();
            nuevo.dato = a;
            nuevo.hojader = new ABB();
            nuevo.hojaizq = new ABB();
            raiz = nuevo;
        } else {
            if (a > raiz.dato) {
                (raiz.hojader).Insertar(a);
            }
            if (a < raiz.dato) {
                (raiz.hojaizq).Insertar(a);
            }
        }
    }
    //ordena por PreOrden
    public void PreOrden() {
        if (!ArbolVacio()) {
            System.out.print(raiz.dato + "-");
            raiz.hojaizq.PreOrden();
            raiz.hojader.PreOrden();
        }
    }
    //ordena por InOrden
    public void InOrden() {
        if (!ArbolVacio()) {
            raiz.hojaizq.InOrden();
            System.out.print(raiz.dato + "-");
            raiz.hojader.InOrden();
        }
    }
    //ordena por PostOrden
    public void PostOrden() {
        if (!ArbolVacio()) {
            raiz.hojaizq.PostOrden();
            raiz.hojader.PostOrden();
            System.out.print(raiz.dato + "-");
        }
    }
    //busca nodo
    public ABB Buscar(int a) {
        ABB aux = null;
        if (!ArbolVacio()) {
            if (a == raiz.dato) {
                System.out.println("encontrado");
                return this;
            } else {
                if (a < raiz.dato) {
                    aux = raiz.hojaizq.Buscar(a);
                } else {
                    aux = raiz.hojader.Buscar(a);
                }
            }
        }
        return aux;
    }
    //busca el nodo con valor minimo
    public int BuscarMin() {
        ABB arbolActual = this;
        while (!arbolActual.raiz.hojaizq.ArbolVacio()) {
            arbolActual = arbolActual.raiz.hojaizq;
        }
        int devuelvo = arbolActual.raiz.dato;
        arbolActual.raiz = null;
        return devuelvo;
    }
    //indica si es nodo hoja
    public boolean Hoja() {
        boolean hoja = false;
        if ((raiz.hojaizq).ArbolVacio() && (raiz.hojader).ArbolVacio()) {
            hoja = true;
        }
        return hoja;
    }
    //contar hojas
    public int Hojas() {
        if (ArbolVacio()){
            return 0;
        }
        if (raiz.hojader.ArbolVacio()&&raiz.hojaizq.ArbolVacio()){
            return 1;
        }else{
            return (raiz.hojaizq.Hojas()+raiz.hojader.Hojas());
        }
    }
    //elimina un nodo
    public void Borrar(int a) {
        ABB eliminar = Buscar(a);
        if (!eliminar.ArbolVacio()) {
            if (eliminar.Hoja()) {
                eliminar.raiz = null;
            } else {
                if (!eliminar.raiz.hojaizq.ArbolVacio() && !eliminar.raiz.hojader.ArbolVacio()) {
                    eliminar.raiz.dato = eliminar.raiz.hojader.BuscarMin();
                    System.out.println("eliminado");
                } else {
                    if (eliminar.raiz.hojaizq.ArbolVacio()) {
                        eliminar.raiz = eliminar.raiz.hojader.raiz;
                        System.out.println("eliminado");
                    } else {
                        eliminar.raiz = eliminar.raiz.hojaizq.raiz;
                        System.out.println("eliminado");
                    }
                }
            }
        }
    }
    //clase anidada
    private class Nodo {
        private ABB hojader;
        private ABB hojaizq;
        private int dato;
        private void Nodo() {
            hojader = null;
            hojaizq = null;
            dato = 0;
        }
    }
}
