package Clase07;

import java.util.Scanner;
public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumaMayoresIgual6 = 0, sumaMenores6 = 0, sumaTotal = 0;
        int contadorMayoresIgual6 = 0, contadorMenores6 = 0, contadorNotasIgual1 = 0, contadorTotal = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingresa la nota " + i + ": ");
            double nota = scanner.nextDouble();

            if (nota < 1.0 || nota > 10.0) {
                System.out.println("Nota fuera de rango");
                break;
            }
            sumaTotal += nota;
            contadorTotal++;
            if (nota >= 6.0) {
                sumaMayoresIgual6 += nota;
                contadorMayoresIgual6++;
            } else {
                sumaMenores6 += nota;
                contadorMenores6++;
            }
            if (nota == 1.0) {
                contadorNotasIgual1++;
            }
        }
        if (contadorTotal > 0) {
            System.out.println("Promedio total: " + (sumaTotal / contadorTotal));

            if (contadorMayoresIgual6 > 0)
                System.out.println("Promedio de notas ≥ 6: " + (sumaMayoresIgual6 / contadorMayoresIgual6));
            else
                System.out.println("No hubo notas ≥ 6.");

            if (contadorMenores6 > 0)
                System.out.println("Promedio de notas < 6: " + (sumaMenores6 / contadorMenores6));
            else
                System.out.println("No hubo notas < 6.");

            System.out.println("Cantidad de notas = 1: " + contadorNotasIgual1);
        }
        scanner.close();
    }
}