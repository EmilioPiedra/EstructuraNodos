package com.company;

import java.util.Scanner;

public class metodosEB {
    Nodo tail;
    Nodo head;
    NodoA raiz;
    Scanner leer;

    public metodosEB() {
        this.head = null;
        this.raiz =null;
        this.tail =null;
        leer = new Scanner(System.in);
    }
    public void Insertar(int id, String nombre){
        Nodo nuevo = new Nodo(id, nombre);
        if (ListaVacia()){
            head = nuevo;
        }else{
            tail.siguiente = nuevo;
        }
        tail = nuevo;
    }
    public boolean ListaVacia (){
        if (head ==null)
            return true;
        else
            return false;
    }
    public void recorrer (Nodo head){
        Nodo actual = head;
        while (actual!=null){
            System.out.println("ID: "+actual.amigo.id);
            System.out.println("Nombre: "+actual.amigo.nombre);
            System.out.println("-------------------------------------------");
            actual = actual.siguiente;
        }
    }
    public NodoA Llenar(NodoA raiz, int id, String nombre) {
        if (raiz == null) {
            NodoA nuevo = new NodoA(id, nombre);
            return nuevo;
        } else if (id > raiz.amigo.id) {
            raiz.der = Llenar(raiz.der, id, nombre);
        } else
            raiz.izq = Llenar(raiz.der, id, nombre);
            return  raiz;
    }
    public void Pasar(Nodo head){
        Nodo actual = head;
        while (actual!= null) {
           raiz = Llenar(raiz ,actual.amigo.id, actual.amigo.nombre);
            actual = actual.siguiente;
        }
        }
        public void inOrden (NodoA actual){
        if(actual!=null){
            inOrden(actual.izq);
            System.out.println("ID: "+actual.amigo.id);
            System.out.println("Nombre: "+actual.amigo.nombre);
            System.out.println("-------------------------------------------");
            inOrden(actual.der);
        }
        }
}
