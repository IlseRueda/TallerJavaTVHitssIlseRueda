package Clase06;
import java.util.Scanner;

public class bucle_for {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese el primer número entero:");
        int num1 = scanner.nextInt();

        System.out.println("Por favor, ingrese el segundo número entero:");
        int num2 = scanner.nextInt();

        int resultado = 0;
        boolean esNegativo = (num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0);

        int absNum1 = Math.abs(num1);
        int absNum2 = Math.abs(num2);

        for (int i = 0; i < absNum2; i++) {
            resultado += absNum1;
        }

        if (esNegativo) {
            resultado = -resultado;
        }

        System.out.println("El resultado de la multiplicación es: " + resultado);

        scanner.close();
    }
}