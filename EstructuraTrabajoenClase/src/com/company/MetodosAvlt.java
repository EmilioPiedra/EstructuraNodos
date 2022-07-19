package com.company;

import java.util.Scanner;

public class MetodosAvlt {
    Scanner leer;
    NodoAvl raiz;
    Boolean altura;

    public MetodosAvlt() {
        this.leer = new Scanner(System.in);
        this.raiz = null;
        this.altura = false;
    }
    public int menu (){
        int op;
        System.out.println("insertar elemento     1");
        System.out.println("Eliminar elemento     2");
        System.out.println("recorrer arbolBinario 3");
        System.out.println("salir                 0");
        op = leer.nextInt();
        return op;
    }
    public NodoAvl rotacionII(NodoAvl n, NodoAvl n1){
        n.izq = n1.dere;
        n1.dere = n;
        if (n1.fe ==-1){
            n.fe = 0;
            n1.fe =0;
        }else {
        n.fe = 1;
        n1.fe = 1;
        }
    return n1;
    }


    public NodoAvl insertarEq (NodoAvl actual, int dato){
        if (actual == null){
            NodoAvl nuevo = new NodoAvl(dato);
            altura = null;
            return  nuevo;
        }else if (dato<actual.dato){
            actual.izq = insertarEq(actual.izq, dato);
        if (altura){
            switch (actual.fe ){
                case 0: actual.fe = -1;
                break;
                case 1: actual.fe = 0;
                        altura = false;
                break;
                case -1: NodoAvl n1 = actual.izq;
                        if (n1.fe ==-1)
                            actual = rotacionII(actual,n1);
                        else
                            actual = rotacionID(actual,n1);
                            altura = false;
                            break;
            }
        }
        }else {
            actual.dere = insertarEq(actual.izq, dato);
            if (altura){
                switch (actual.fe ){
                    case 0: actual.fe = 1;
                        break;
                    case -1: actual.fe = 0;
                        altura = false;
                        break;
                    case 1: NodoAvl n1 = actual.dere;
                        if (n1.fe ==1)
                            actual = rotacionDD(actual,n1);
                        else
                            actual = rotacionDI(actual,n1);
                        altura = false;
                        break;
                }

        }
    }
}
