import java.util.Scanner;

public class ContadorDePalabras {
    public static void main(String[] args) {
        // Crear un objeto Scanner para recibir la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que escriba una frase
        System.out.println("Escribe una frase:");
        String frase = scanner.nextLine(); // Leer la línea completa

        // Eliminar espacios adicionales al principio y al final
        frase = frase.trim();

        // Verificar si la frase está vacía
        if (frase.isEmpty()) {
            System.out.println("La frase contiene 0 palabras.");
        } else {
            // Dividir la frase por espacios y contar las palabras
            String[] palabras = frase.split("\\s+"); // Expresión regular para múltiples espacios
            int cantidad = palabras.length;
            System.out.println("La frase contiene " + cantidad + " palabras.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
