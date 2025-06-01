import java.util.Scanner;

public class CapitalizarFrase {
    public static void main(String[] args) {
        // Crear un objeto Scanner para entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cadena al usuario
        System.out.println("Escribe una frase:");
        String fraseOriginal = scanner.nextLine();

        // Convertimos todo a minúsculas primero (opcional para uniformidad)
        fraseOriginal = fraseOriginal.toLowerCase();

        // Variable para construir la nueva cadena con letras capitalizadas
        StringBuilder fraseCapitalizada = new StringBuilder();

        // Usamos un booleano para saber cuándo capitalizar
        boolean capitalizarSiguiente = true;

        // Recorremos la cadena carácter por carácter
        for (int i = 0; i < fraseOriginal.length(); i++) {
            char caracter = fraseOriginal.charAt(i);

            if (capitalizarSiguiente && Character.isLetter(caracter)) {
                fraseCapitalizada.append(Character.toUpperCase(caracter));
                capitalizarSiguiente = false;
            } else {
                fraseCapitalizada.append(caracter);
            }

            // Si encontramos un espacio, la próxima letra debe ir en mayúscula
            if (caracter == ' ') {
                capitalizarSiguiente = true;
            }
        }

        // Mostramos el resultado
        System.out.println("Frase capitalizada: " + fraseCapitalizada);

        // Cerramos el Scanner
        scanner.close();
    }
}
