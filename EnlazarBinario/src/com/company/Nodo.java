package com.company;

public class Nodo {
    Persona amigo;
    Nodo siguiente;


    public Nodo(int id, String nombre) {
        amigo = new Persona(id,nombre);
        this.siguiente = null;

    }
}
