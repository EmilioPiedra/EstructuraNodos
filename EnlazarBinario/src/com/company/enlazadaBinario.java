package com.company;

public class enlazadaBinario {
    public static void main(String[] args) {
        metodosEB obj = new metodosEB();
        int op=0, id;
        String nombre;
        do{
            System.out.println(" Insgresar id");
            id = obj.leer.nextInt();
            System.out.println(" Insgrese el nombre");
            nombre = obj.leer.nextLine();
            obj.Insertar(id,nombre);
        }while (op==1);
    obj.recorrer (obj.head);
    obj.Pasar(obj.head);
    obj.inOrden(obj.raiz);
    }
}
