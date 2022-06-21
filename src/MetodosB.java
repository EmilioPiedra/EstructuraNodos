import java.util.Scanner;

public class MetodosB {
    Scanner leer;
    Nodo head;
    Nodo tail;

    public MetodosB (){
        this.leer = new Scanner(System.in);
        this.head = null;
        this.tail = null;
    }

    public int menu (){
        int op=0;
        System.out.println("Ingresar un nuevo elemento 1");
        System.out.println("Recorrer la lista 2");
        System.out.println("");
        System.out.println("salir 0");
        op =leer.nextInt();
     return op;
    }

    public boolean listaVacia (){
        if (head==null)
            return true;
            else
            return false;
    }
    public void ingresar (){
        int id,edad,n1,n2,n3;
        String nombre;
        System.out.println("Ingresar id: ");
        id = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingresar Nombre: ");
        nombre = leer.nextLine();
        System.out.println("Ingrese Edad: ");
        edad = leer.nextInt();
        System.out.println("Ingrese nota 1: ");
        n1 = leer.nextInt();
        System.out.println("Ingrese nota 2: ");
        n2 = leer.nextInt();
        System.out.println("Ingrese nota 3: ");
        n3 = leer.nextInt();

        Nodo nuevo = new Nodo(id,nombre,edad,n1,n2,n3);
        /*if (listaVacia()){
            head = nuevo;
            tail = nuevo;

        }else {
            tail.sig = nuevo;
            tail = nuevo;
        } */

        nuevo.sig = nuevo;
        if (listaVacia()){
            tail = nuevo;
        }else {

        }

    }
    public void recorrer (){
        Nodo actual = head;
        float prom;
        while (actual != null){
            System.out.println("ID: "+actual.alumno.id);
            System.out.println("Nombre: "+actual.alumno.nombre);
            System.out.println("Edad: "+actual.alumno.edad);
            prom=((actual.alumno.notas[0]+actual.alumno.notas[1]+actual.alumno.notas[2])/actual.alumno.notas.length);
            System.out.println("Promedio : "+prom);
            actual =actual.sig;

        }
    }

}
