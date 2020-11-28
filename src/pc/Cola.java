package pc;
import lse.ListaSimplementeEnlazada;
import lse.nodo;

public class Cola extends ListaSimplementeEnlazada{
    @Override
    public void insertar(Object dato) {
        if (estaVacia()){
            nodo nuevo = new nodo(dato, null);
            primero = nuevo;
        }else{
            nodo ultimo = primero;
            while (ultimo.getSiguiente()!=null){
                ultimo = ultimo.getSiguiente();
            }
            nodo nuevo = new nodo(dato, null);
            ultimo.setSiguiente(nuevo);

        }
    }
}
