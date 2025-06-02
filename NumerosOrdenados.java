import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class NumerosOrdenados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numeros = new TreeSet<>();
        String respuesta;

        System.out.println("Ingrese valores numéricos. Escriba 'n' cuando desee detenerse.");

        do {
            System.out.print("Ingrese un número: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Eso no es un número. Intente nuevamente.");
                scanner.next(); // Limpia la entrada inválida
                System.out.print("Ingrese un número: ");
            }

            int numero = scanner.nextInt();
            numeros.add(numero);

            System.out.print("¿Desea ingresar otro número? (s/n): ");
            respuesta = scanner.next();
        } while (respuesta.equalsIgnoreCase("s"));

        System.out.println("\nNúmeros ingresados (ordenados de menor a mayor):");
        for (int num : numeros) {
            System.out.println(num);
        }

        scanner.close();
    }
}
