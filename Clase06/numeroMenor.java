package Clase06;
import java.util.Scanner;

public class numeroMenor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos números desea comparar?, Mínimo 10");
        int cantidadNumeros = scanner.nextInt();

        // Validar que la cantidad de números sea al menos 10
        if (cantidadNumeros < 10) {
            System.out.println("La cantidad de números debe ser al menos 10.");
            return; // Salir del programa si no se cumple la condición
        }

        int numeroMenor = Integer.MAX_VALUE; // Inicializamos con el valor entero máximo para que cualquier número ingresado sea menor

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println("Ingrese el número " + (i + 1) + ":");
            int numeroActual = scanner.nextInt();

            if (numeroActual < numeroMenor) {
                numeroMenor = numeroActual;
            }
        }

        System.out.println("El número menor es: " + numeroMenor);

        // Condición para imprimir el mensaje final
        if (numeroMenor < 10) {
            System.out.println("El número menor es menor que 10!");
        } else {
            System.out.println("El número menor es igual o mayor que 10!");
        }

        scanner.close();
    }
}