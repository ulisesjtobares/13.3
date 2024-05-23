
package com.mycompany.arbol;

public class arbolBinario {
    
    public Nodo raiz;
    
    public arbolBinario()
    {
        raiz = null;
    }
    
    public arbolBinario(Nodo raiz)
    {
        this.raiz = raiz;
    }
    
    public Nodo raizArbol()
    {
        return raiz;
    }
    
    public Boolean esVacio()
    {
        return raiz==null;
    }
    
    /*Crear nuevo arbol*/
    public static Nodo nuevoArbol(Object dato, Nodo izq, Nodo dcho)
    {
        return new Nodo(dato,izq,dcho);
    }
    
    public void imprimirPre(Nodo reco)
      {
          if (reco != null)
          {
              System.out.print(reco.valor + " ");
              imprimirPre(reco.izq);
              imprimirPre(reco.dcho);
          }
          
      }

}
