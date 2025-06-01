import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la palabra al usuario
        System.out.println("Ingresa una palabra:");
        String palabra = scanner.nextLine();

        // Convertir a minúsculas y quitar espacios por si acaso
        palabra = palabra.toLowerCase().replace(" ", "");

        // Invertir la palabra
        String palabraInvertida = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraInvertida += palabra.charAt(i);
        }

        // Comparar original con invertida
        if (palabra.equals(palabraInvertida)) {
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra no es un palíndromo.");
        }

        scanner.close();
    }
}

