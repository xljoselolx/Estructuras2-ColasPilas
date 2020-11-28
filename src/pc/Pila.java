package pc;

import lse.nodo;

public class Pila  extends Cola{
    @Override
    public void eliminar() {
        if (!estaVacia()){
            nodo ultimo=primero;
            nodo penultimo=null;
            while (ultimo.getSiguiente()!=null){
                penultimo = ultimo;
                ultimo = ultimo.getSiguiente();
            }
            penultimo.setSiguiente(null);
        }
    }
}
