public class Nodo {
    Persona alumno;
    Nodo sig;

    public Nodo (int id, String nombre, int edad, int n1, int n2, int n3){
        this.alumno = new Persona(id,nombre,edad,n1,n2,n3);
        this.sig = null;
    }
}
