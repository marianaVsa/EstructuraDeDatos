import java.util.LinkedHashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Set<String> set = new LinkedHashSet<>();
        set.add("Verde");
        set.add("Rojo");
        set.add("Azul");
        set.add("Verde");// ignora duplicados

        System.out.println(set);

        boolean existeVerde = set.contains("Verde");
        set.remove("azul");

        int tamaño = set.size();

        for (String data : set) {
            System.out.println("Dato en row " + data);
        }
        System.out.println("Existe Verde: " + existeVerde);
        System.out.println("Tamaño del set: " + tamaño);
    }
}
