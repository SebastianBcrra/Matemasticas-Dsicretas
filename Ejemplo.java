
package Conjuntos;

import java.util.Scanner;


public class Ejemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número entero (x): ");
        int x = scanner.nextInt();
        
        boolean A = true; // Por definición, un número entero siempre es un número entero.
        boolean B = (x % 4 == 0);
        boolean C = (x % 2 == 0);
        boolean D = (x % 3 == 0);
        
        if (A) {
            System.out.println("A: x es un número entero.");
        }
        
        if (B) {
            System.out.println("B: x es divisible por 4.");
        }
        
        if (C) {
            System.out.println("C: x es divisible por 2.");
        }
        
        if (D) {
            System.out.println("D: x es divisible por 3.");
        }
        
        if (B && !D) {
            System.out.println("Si un número entero es divisible por 4, entonces es divisible por 2, pero no es divisible por 3.");
        } else {
            System.out.println("La afirmación no se cumple.");
        }
    }
}