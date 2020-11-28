import pc.Cola;
import pc.Pila;

public class Main {
    public static void main (String[] args) {
      /*
        ListaSimplementeEnlazada listaSimplementeEnlazada = new ListaSimplementeEnlazada();

        //numeros para ingresar a la lista
        listaSimplementeEnlazada.insetar(5);
        listaSimplementeEnlazada.insetar(4);
        listaSimplementeEnlazada.insetar(3);
        listaSimplementeEnlazada.insetar(2);
        listaSimplementeEnlazada.insetar(1);
        listaSimplementeEnlazada.insetar(0);

        // mostrar lista
        listaSimplementeEnlazada.mostrar();

        //eliminar elementos
        listaSimplementeEnlazada.eliminar();
        listaSimplementeEnlazada.eliminar();
        // mostrar lista actualizada
        listaSimplementeEnlazada.mostrar();

        Cola cola = new Cola();
        System.out.println(cola.estaVacia());
        for (int i=1; i<5; i++){
            cola.insetar(i);
        }
        cola.mostrar();
        cola.eliminar();
        cola.eliminar();
        cola.mostrar();*/

        Pila pila = new Pila();
        System.out.println(pila.estaVacia());
        for (int i=1;i<=5;i++){
          pila.insertar(i);
        }
        pila.mostrar();

        pila.eliminar();
        pila.eliminar();
        pila.eliminar();
        pila.mostrar();
    }
}
