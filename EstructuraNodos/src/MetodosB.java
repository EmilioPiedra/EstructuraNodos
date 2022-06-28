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
        System.out.println("Ingresar un nuevo elemento   [1]");
        System.out.println("Recorrer la lista            [2]");
        System.out.println("Eliminar nodo                [3] ");
        System.out.println("Salir                        [0]");
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
        //caso 1 para el id de los alumnos.
        if (listaVacia()){
            head = nuevo;
            tail = nuevo;
        }else  if (id <head.alumno.id){
        nuevo.sig = head;
        head = nuevo;
        //para buscar la posicion
        }else {
            //crea un nodo auxiliar de tipo Nodo y recorre la lista enlazada
            Nodo actual = head;
            while ((actual.sig != null)&&(id>actual.sig.alumno.id))
                actual = actual.sig;
            nuevo.sig = actual.sig;
            actual.sig = nuevo;
            if (nuevo.sig == null)
                tail=nuevo;
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
            System.out.println("---------------------------------------------");

        }
    }
 public void eliminar (){
     int id=0;
     System.out.println("Ingresar id: ");
     id = leer.nextInt();
     if (listaVacia()){
         System.out.println("La lista esta vacia...");
     }else if (id == head.alumno.id){
         head = head.sig;
         if (listaVacia())
             tail=null;
     }else{
      Nodo actual = head;
      while ((actual.sig!= null)&&(id !=actual.sig.alumno.id))
          actual = actual.sig;
      if (actual.sig != null)
          System.out.println(id+"No esta en la lista");
     else
         actual.sig = actual.sig.sig;
     if (actual.sig ==null)
     tail=actual;
     }
 }
}
