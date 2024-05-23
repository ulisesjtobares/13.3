
package com.mycompany.arbol;


public class Nodo {
    Object valor;
    Nodo izq;
    Nodo dcho;
    
    public Nodo(Object valor)
    {
        this.valor = valor;
        dcho = izq = null;
    }
    
    public Nodo(Object valor, Nodo izq, Nodo dcho)
    {
        this.valor = valor;
        this.izq = izq;
        this.dcho = dcho;
    }
}
