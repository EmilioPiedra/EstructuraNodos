package com.company;

public class NodoAvl {
    int dato;
    int fe;
    NodoAvl izq;
    NodoAvl dere;

    public NodoAvl(int dato) {
        this.dato = dato;
        this.fe = 0;
        this.izq = null;
        this.dere = null;
    }
}
