import java.util.Scanner;

public class EliminarUltimaPalabra {
    public static void main(String[] args) {
        // Crear el objeto Scanner para recibir entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar la frase
        System.out.println("Escribe una frase:");
        String fraseOriginal = scanner.nextLine();

        // Eliminar espacios al inicio y al final
        fraseOriginal = fraseOriginal.trim();

        // Dividir la frase en palabras usando el espacio como separador
        String[] palabras = fraseOriginal.split("\\s+");

        // Verificamos que haya más de una palabra
        if (palabras.length <= 1) {
            System.out.println("No se puede eliminar la última palabra porque la frase contiene solo una palabra o está vacía.");
        } else {
            // Usamos StringBuilder para reconstruir la frase sin la última palabra
            StringBuilder fraseSinUltima = new StringBuilder();

            for (int i = 0; i < palabras.length - 1; i++) {
                fraseSinUltima.append(palabras[i]);
                if (i < palabras.length - 2) {
                    fraseSinUltima.append(" ");
                }
            }

            // Mostramos la nueva frase
            System.out.println("Frase sin la última palabra: " + fraseSinUltima);
        }

        // Cerramos el Scanner
        scanner.close();
    }
}
