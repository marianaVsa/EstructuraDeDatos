public class Node{
    int value; //valor que tendrá el nodo
    Node left; //nodo izquierdo
    Node right; //nodo derecho

    //Esta seria nuetra fabrica de hojitas para nuetsro árbol (BST)
    public Node(int value){
        this.value = value; //Coloca el valor al atributo value del nodo
        this.left = null; //Como es un nuevo nodo, no tiene nada a la izquierda
        this.right = null; //Como es un nuevo nodo, no tiene nada a la derecha
    }
}