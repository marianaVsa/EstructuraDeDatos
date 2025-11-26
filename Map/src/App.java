import java.util.Map;
import java.util.LinkedHashMap;
public class App {
    public static void main(String[] args) throws Exception {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(0, "USB");
        map.put(1, "Mouse");
        map.put(2, "Teclado");
        map.put(3, "Botoncito");
        map.put(1, "Mouse Gamer");
        map.put(10, "test");

        System.out.println(map);
        String value = map.get(3);
        System.out.println(value);

        boolean exist = map.containsKey(5);
        System.out.println("Existe la llave 5? " + exist);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Llave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
        int size = map.size();
        System.out.println("El tamaño es: " + size);
    }
}
