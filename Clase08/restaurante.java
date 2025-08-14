package Clase08;
import java.util.Scanner;

public class restaurante {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcionMenu;
        float ventasTotales = 0.0f;

        do {
            System.out.println("\nBienvenido al Sistema de Pedidos ");
            System.out.println("Selecciona una opción:");
            System.out.println("1 Registrar un nuevo pedido");
            System.out.println("2 Mostrar total de ventas");
            System.out.println("3 Salir del sistema");

            opcionMenu = entrada.nextInt();
            entrada.nextLine(); 

            switch (opcionMenu) {
                case 1:
                    String nombrePlatillo;
                    String continuar;
                    float precioPlatillo;
                    do {
                        System.out.println("\n Registro de Pedido ");
                        System.out.print("Nombre del platillo: ");
                        nombrePlatillo = entrada.nextLine();
                        System.out.print("Precio del platillo: $");
                        precioPlatillo = entrada.nextFloat();
                        entrada.nextLine(); 
                        ventasTotales += precioPlatillo;
                        System.out.printf(" Pedido registrado: %s - $%.2f%n", nombrePlatillo, precioPlatillo);
                        System.out.print("¿Deseas agregar otro platillo? (s/n): ");
                        continuar = entrada.nextLine();
                    } while (continuar.equalsIgnoreCase("s"));

                    System.out.println("🧾 Registro de pedidos finalizado.");
                    break;
                case 2:
                    System.out.println("\n Total de Ventas ");
                    System.out.printf("El total acumulado es: $%.2f%n", ventasTotales);
                    break;
                case 3:
                    System.out.println("Cerrando el sistema");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }
        } while (opcionMenu != 3);
        entrada.close();
    }
}