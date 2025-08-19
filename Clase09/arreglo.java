import java.util.Scanner;

public class arreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[10];
        int[] contador = new int[10];
        System.out.println("Ingresa 10 números del 1 al 9:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int num = scanner.nextInt();
            while (num < 1 || num > 9) {
                System.out.print("Solo se permiten números del 1 al 9. Intenta de nuevo: ");
                num = scanner.nextInt();
            }
            arreglo[i] = num;
            contador[num]++;
        }
        System.out.println("Números ingresados:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();

        int maxOcur = 0;
        int numMasRep = -1;
        for (int i = 1; i < contador.length; i++) {
            if (contador[i] > maxOcur) {
                maxOcur = contador[i];
                numMasRep = i;
            }
        }
        System.out.println("Resultado: ");
        System.out.println("Número más repetido: " + numMasRep);
        System.out.println("Veces que aparece: " + maxOcur);
        scanner.close();
    }
}