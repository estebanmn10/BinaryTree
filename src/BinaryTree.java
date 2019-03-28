//Clase Arbol

public class BinaryTree <T extends Comparable<T>>{
    private Node<T> root = null;

    public void isEmpty(){
        if(root == null){
            System.out.println("El árbol se encuentra vacío");
        } else{
            System.out.println("El árbol no se encuentra vacío");
        }
    }

    public void contains(T e){
        if(this.contains(e, this.root)){
            System.out.println("El dato sí se encuentra en el árbol");
        } else{
            System.out.println("El dato no se encuentra en el árbol");
        }
    }
    private boolean contains(T e, Node<T> current){
        if (current == null){
            return false;
        }
        if (e.compareTo(current.element)>0){
            return contains(e, current.left);
        } else if (e.compareTo(current.element)<0){
            return contains(e, current.right);
        } else {
            return true;
        }
    }

    public void insert(T e){
        this.root = this.insert(e, this.root);
    }

    private Node insert(T e, Node<T> current){
            if (current == null){
                return new Node(e);
            }
            if (e.compareTo(current.element)>0){
                current.left = insert(e,current.left);
            } else if (e.compareTo(current.element)<0) {
                current.right = insert(e, current.right);
            }
            return current;
        }

    public void delete(T e){
        System.out.println(this.delete(e, this.root));
    }

    private String  delete(T e, Node<T> current){
        if (current == null){
            return "El elemento no se encuentra";
        }
        if (e.compareTo(current.element)>0){
            return delete(e, current.left);
        } else if (e.compareTo(current.element)<0){
            return delete(e, current.right);
        } else {
            current = null;
        }
        return "El elemento fue eliminado";
    }

}
