public class App {
    public static void main(String[] args) throws Exception {
    BinarySearchTree tree= new BinarySearchTree();
    int[] num= {10,7,11,5,1,0};
    for (int i : num) {
        tree.insert(i);
    }
    System.out.println("Impresion: ");
    tree.printInOrder();
    
}
}