public class BinarySearchTree {
    private Node root; //Raíz del árbol BST
    //--------------------------------
    //Metodo publico para insertar un valor en el árbol
    //--------------------------------
    public void insert(int value){
        //invocaion reursiva , para saber en donde se colocará el nuevo nodo
    }
    private Node insertRecursive(Node current, int valor){
        if(current == null){
            return new Node(valor);
        }
        //si el valor al insertar es menor, entonces se va a la izquierda
        if(valor < current.value){
            current.left = insertRecursive(current.left, valor);
        }
        //si el valor al insertar es mayor, entonces se va a la derecha
        else if(valor > current.value){
            current.right = insertRecursive(current, valor);
        }
        //Cuando los valores son iguales, no se hace nada (no se permiten duplicados)

        //retornar el nodo actual
        return current;
    }

    public void printInOrder(){
        printInOrderRecursive(root);
    }

    private void printInOrderRecursive(Node current){
        if(current != null){
            //Recorrer la parte de la izquierda
            printInOrderRecursive(current.left);
            //Imprimir el valor del nodo actual
            System.out.print(current.value + " ");
            //Recorrer la parte de la derecha
            printInOrderRecursive(current.right);

        }
    }
}
