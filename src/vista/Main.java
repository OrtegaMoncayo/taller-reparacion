/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 59397
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        List<Integer> numerosDivisibles = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            numeros.add(i);
        }

        System.out.println("Introduce un número entre 2 y 7:");
        int divisor = scanner.nextInt();

        if (divisor < 2 || divisor > 7) {
            System.out.println("Número no válido.");
            return;
        }

        for (int numero : numeros) {
            if (numero % divisor == 0) {
                numerosDivisibles.add(numero);
            }
        }

        System.out.println("Números divisibles por " + divisor + ": " + numerosDivisibles);
    }
}
