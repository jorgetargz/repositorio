package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola");
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menu");
            System.out.println("Opcion 1");
            System.out.println("Opcion 2");
            System.out.println("Opcion 3");
            System.out.println("Opcion 4");
            System.out.println("0. Salir");
            System.out.print("Introduce un numero: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    break;
            }

        } while (opcion != 0);
    }
}
