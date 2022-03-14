package gt.edu.umg.progra3.parcial1.pilas;

public interface Pila {


    /**
     * inserta un nuevo item en un nodo en la cima de la pila
     * @param item
     */
    void push (String item);

    /**
     * remueve el nodo de la cima y retorna el valor
     * @return
     */
    String pop();

    /**
     * retorna el valor del elemento en la cima
     * @return
     */
    String peek();

    /**
     * retorna el tamaño de la pila
     * @return
     */
    int size();

    /**
     * indica si la pila se encuentra vacia
     * @return
     */
    boolean isEmpty();

}
