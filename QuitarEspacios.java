import java.util.Scanner;

public class QuitarEspacios {
    public static void main(String[] args) {
        // Crear el objeto Scanner para recibir entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cadena al usuario
        System.out.println("Escribe una cadena con espacios:");
        String cadenaOriginal = scanner.nextLine(); // Leer la línea completa

        // Quitar todos los espacios en blanco de la cadena
        String cadenaSinEspacios = cadenaOriginal.replaceAll("\\s+", "");

        // Mostrar la cadena resultante
        System.out.println("Cadena sin espacios: " + cadenaSinEspacios);

        // Cerrar el Scanner
        scanner.close();
    }
}
