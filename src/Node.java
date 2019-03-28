//Clase Nodo

public class Node <T extends Comparable> {
    T element;
    Node<T> left;
    Node<T> right;

    public Node(T element){
        this.element = element;
        this.right = this.left = null;
    }
}
