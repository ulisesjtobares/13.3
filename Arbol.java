package com.mycompany.arbol;


public class Arbol {

    public static void main(String[] args) {
        Nodo a1,a2,a;
        arbolBinario arbol;
        a1 = arbolBinario.nuevoArbol("Carlos",null,null);
        a2 = arbolBinario.nuevoArbol("Marto",null,null);
        a = arbolBinario.nuevoArbol("Alan",a1,a2);
        
        arbol = new arbolBinario(a);
        arbol.imprimirPre(a);
    }
}
