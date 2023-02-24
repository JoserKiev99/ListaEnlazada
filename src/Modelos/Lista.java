
package Modelos;

public class Lista {
    Nodo primero;
    
    public void insertarNodo(int dato){
        Nodo nodoNuevo = new Nodo(dato);
        if(primero == null){
        primero = nodoNuevo;    
        }
        else{
            nodoNuevo.siguiente = primero;
            primero = nodoNuevo;
        } 
        
        
    }
public void ListaNodos(){
    Nodo auxiliar;
    auxiliar = primero;
    while(auxiliar!=null)
    {
        System.out.println(auxiliar.getDato());
        auxiliar = auxiliar.siguiente;
    }
}        
}
