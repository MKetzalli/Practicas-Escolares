package biblioteca;

public class Libro extends Prestamo {

    //declaracion de arreglos
    String[] titulo = new String[6];
    String[] autor = new String[6];
    int[] ejemplares = new int[6];
    int[] prestados = new int[6];


    //sobreescritura de metodo, muestra todos los libros
    @Override
    public void Mostrar() {
        id = 0;
        //ciclo para mostrar la informacion de los libros
        while (id <= 5) {

            System.out.println("Libro " + id + ": " + titulo[id]);
            System.out.println("Autor " + id + ": " + autor[id]);
            System.out.println("Ejemplares " + id + ": " + ejemplares[id]);
            System.out.println("Prestados " + id + ": " + prestados[id]);
            System.out.println("\n");
            id++;
        }
    }

    //sobrecarga de metodo, muestra libros de forma independiente
    public void Mostrar(int id) {

        System.out.println("Libro " + id + ": " + titulo[id]);
        System.out.println("Autor " + id + ": " + autor[id]);
        System.out.println("Ejemplares " + id + ": " + ejemplares[id]);
        System.out.println("Prestados " + id + ": " + prestados[id]);
        System.out.println("\n");
    }

    //sobreescritura de metodo, asigna valores iniciales a las variables
    @Override
    public void Base() {
        id = 0;
        //ciclo para asignar informacion basica a los datos
        while (id <= 5) {
            titulo[id] = "titulo " + id;
            autor[id] = "autor " + id;
            ejemplares[id] = 2;
            prestados[id] = 1;
            id++;
        }
    }

    //metodo para prestar libro
    public void Prestar() {
        //8.-error al ingresar id que sobrepasa el arreglo
        try {
            id = super.Seleccionar();
            if (ejemplares[id] == prestados[id]) {
                System.out.println(incorrecto);
            }
            if (ejemplares[id] > prestados[id]) {
                prestados[id]++;
                System.out.println(correcto);
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e);
        }
    }

    //metodo para devolver libro
    public void Devolver() {
        //9.-error al ingresar id que sobrepasa el arreglo
        try {
            id = super.Seleccionar();
            if (prestados[id] == 0) {
                System.out.println(incorrecto);
            }
            if (prestados[id] > 0) {
                prestados[id]--;
                System.out.println(correcto);
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e);
        }
    }

    //metodo para eliminar libro
    public void Eliminar() {
        id = super.Seleccionar();
        titulo[id] = "NULL";
        autor[id] = "NULL";
        ejemplares[id] = 0;
        prestados[id] = 0;
        System.out.println(correcto);
    }

    //metodo para agregar libro o sobreescribir uno ya existente
    public void Agregar() {
        id = super.Seleccionar();
        System.out.print("Titulo: ");
        titulo[id] = ingreso.nextLine();
        System.out.print("Autor: ");
        autor[id] = ingreso.nextLine();
        //2.-error por tipo de dato ingresado erroneo
        try {
            System.out.print("Ejemplares: ");
            ejemplares[id] = ingreso.nextInt();
        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e);
        }
        //3.-error por tipo de dato ingresado erroneo
        try {
            System.out.print("Prestados: ");
            prestados[id] = ingreso.nextInt();
            ingreso.nextLine();
        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e);
        }
        System.out.println(correcto);
    }

    //metodo para mostrar total de libros prestados
    public void Prestados() {
        id = 0;
        while (id <= 5) {
            System.out.println(titulo[id] + " (" + prestados[id] + ")");
            id++;
        }
    }

    //sobrecarga de metodo, para mostrar libros mostrados independientes
    public void Prestados(int id) {
        if (prestados[id] >= 1) {
            System.out.println(titulo[id] + " (" + prestados[id] + ")");
        }
        if (prestados[id] < 1) {
            System.out.println(incorrecto);
        }
    }

}
