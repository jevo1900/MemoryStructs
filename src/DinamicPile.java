/**
 * Clase Pila Dinamica
 *
 * @author DiscoDurodeRoer
 * @param <T>
 */
public class DinamicPile<T> {

    //Atributos
    private Node<T> top; //Last Node Added
    private int size;

    //Constructor
    public DinamicPile() {
        top = null; //no elements
        this.size = 0;
    }

    /**
     * return if empty or not
     *
     * @return
     */
    public boolean isEmpty() {
        return top == null;
    }

    /**
     * return the Size
     *
     * @return
     */
    public int size() {
        return this.size;
    }

    /**
     * Return the top element of the Pile
     *
     * @return
     */
    public T top() {
        if (isEmpty()) {
            return null;
        } else {
            return top.getElement();
        }
    }

    /**
     * Saca y devuelve el elemento que mas arriba esta en la pila
     *
     * @return
     */
    public T pop() {
        if (isEmpty()) {
            return null;
        } else {
            T elemento = top.getElement();
            Node<T> aux = top.getNext();
            top = null; //marco para borrar
            top = aux; //actualizo el top
            this.size--;
            return elemento;
        }
    }

    /**
     * Add element to Pile
     *
     * @param element
     * @return
     */
    public T add(T element) {

        Node<T> aux = new Node<>(element, top);
        top = aux; //update top
        this.size++;
        return aux.getElement();
    }

    /**
     * Devuelve el estado de la pila
     *
     * @return
     */
    public String toString() {

        if (isEmpty()) {
            return "La pila esta vacia";
        } else {

            String resultado = "";
            Node<T> aux = top;
            //Recorro la pila
            while (aux != null) {
                resultado += aux.toString();
                aux = aux.getNext();
            }

            return resultado;

        }

    }


    private class Node<T> {

        //Attributes
        private T element;
        private Node<T> next; //Point to Next Node

        //Contructor
        public Node(T element, Node<T> next) {
            this.element = element;
            this.next = next;
        }

        //Methods
        public T getElement() {
            return element;
        }

        public void setElement(T element) {
            this.element = element;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return element + "\n";
        }

    }

}