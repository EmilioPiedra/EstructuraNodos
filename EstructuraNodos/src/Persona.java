public class Persona {
    int id;
    String nombre;
    int edad;
    int [] notas;

    public Persona(int id, String nombre, int edad, int n1, int n2, int n3) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.notas = notas= new int[3];
        this.notas[0]=n1;
        this.notas[1]=n2;
        this.notas[2]=n3;

    }
}
