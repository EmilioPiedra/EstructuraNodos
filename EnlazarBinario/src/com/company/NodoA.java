package com.company;

public class NodoA {
    Persona amigo;
    NodoA izq;
    NodoA der;


    public NodoA(int id, String nombre) {
        this.amigo = new Persona(id, nombre);
        this.izq = null;
        this.der = null;

    }
}
