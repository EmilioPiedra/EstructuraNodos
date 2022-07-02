import java.util.Scanner;

public class ListaDoble {
    Nodo head;
    Nodo tail;
    Scanner leer;
    public ListaDoble() {
        this.head = null;
        this.tail = null;
        leer = new Scanner(System.in);
    }
    public void menu (){
        System.out.println("Crear lista                         [1");
        System.out.println("Presentar lista                     [2");
        System.out.println("Presentar lista en orden inverso    [3");
        System.out.println("Salir                               [4");
    }
    public void crearLista(){
        Nodo nuevo = new Nodo();
        System.out.println("Ingresar valor");
        int dato = leer.nextInt();
        nuevo.dato= dato;
        if (head == null){
            head = nuevo;
            head.siguiente = null;
            head.anterior = null;
            tail = nuevo;
        }else{
            tail.siguiente = nuevo;
            nuevo.anterior = tail;
            nuevo.siguiente = null;
            tail = nuevo;
        }
    }
    public void mostrarlistaInversa(){
        Nodo actual = new Nodo();
        actual = tail;
        while (actual != null){
            System.out.println(actual.dato);
            actual = actual.anterior;
        }
    }
    public void mostrarlista(){
        Nodo actual = new Nodo();
        actual = head;
        while (actual != null){
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }
    public void ordenarLista(){

    }
}
