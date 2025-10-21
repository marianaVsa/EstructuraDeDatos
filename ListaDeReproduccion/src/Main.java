// Clase Nodo (representa una canción)
class SongNode {
    String name;
    int duration;
    SongNode next;

    public SongNode(String name, int duration) {
        this.name = name;
        this.duration = duration;
        this.next = null;
    }
}

// Clase Playlist (lista simplemente enlazada)
class Playlist {
    private SongNode head;

    // Agregar canción al final de la lista
    public void addSong(String name, int duration) {
        SongNode newSong = new SongNode(name, duration);

        if (head == null) {
            head = newSong;
        } else {
            SongNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newSong;
        }
    }

    // Eliminar canción por nombre
    public void removeSong(String name) {
        if (head == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        if (head.name.equals(name)) {
            head = head.next;
            return;
        }

        SongNode current = head;
        while (current.next != null && !current.next.name.equals(name)) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Canción no encontrada: " + name);
        } else {
            current.next = current.next.next;
        }
    }

    // Imprimir la lista de reproducción
    public void printPlaylist() {
        if (head == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        System.out.println("Lista actual:");
        SongNode current = head;
        int index = 1;
        while (current != null) {
            System.out.println(index + ". " + current.name + " (" + current.duration + " s)");
            current = current.next;
            index++;
        }
        System.out.println("Duración total: " + getTotalDuration() + " s");
    }

    // Calcular duración total
    public int getTotalDuration() {
        int total = 0;
        SongNode current = head;
        while (current != null) {
            total += current.duration;
            current = current.next;
        }
        return total;
    }
}

// Clase principal para probar la lista
public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.addSong("Yesterday", 150);
        playlist.addSong("Imagine", 180);
        playlist.printPlaylist();

        // Ejemplo de eliminación
        // playlist.removeSong("Yesterday");
        // playlist.printPlaylist();
    }
}
