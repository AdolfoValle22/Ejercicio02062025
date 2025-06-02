import java.util.Scanner;

public class PromedioNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double suma = 0;
        int contador = 0;
        int positivos = 0;

        while (true) {
            System.out.println("Ingresa un número o escribe 'salir' para terminar:");
            String entrada = scanner.nextLine().trim();

            if (entrada.equalsIgnoreCase("salir")) {
                break;
            }

            try {
                double numero = Double.parseDouble(entrada);
                suma += numero;
                contador++;

                if (numero > 0) {
                    positivos++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingresa un número válido.");
            }
        }

        if (contador > 0) {
            double promedio = suma / contador;
            System.out.println("\nCantidad de números introducidos: " + contador);
            System.out.println("Promedio de los números: " + promedio);
            System.out.println("Cantidad de números positivos: " + positivos);
        } else {
            System.out.println("No se ingresaron números.");
        }

        scanner.close();
    }
}

