import java.util.Scanner;

public class ContarVocalA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar frase al usuario
        System.out.println("Ingresa una frase:");
        String frase = scanner.nextLine();

        int contadorA = 0;

        // Recorremos cada caracter de la frase
        for (int i = 0; i < frase.length(); i++) {
            char caracter = Character.toUpperCase(frase.charAt(i));

            if (caracter == 'A') {
                contadorA++;
            }
        }

        // Mostrar resultado
        System.out.println("La vocal 'A' aparece " + contadorA + " veces en la frase.");

        scanner.close();
    }
}
