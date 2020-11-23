/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_;

import java.util.Scanner;

/**
 *
 * @author numer
 */
public class Ed_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int op;
        do {
            System.out.println("Menú de opciones: ");
            System.out.println("\t1: Calcula la suma de dos números introducidor por teclado.");
            System.out.println("\t2: Muestra la tabla de multiplicar de un número.");
            System.out.println("\t3: Calcula la potencia de un número.");
            System.out.println("\t4: Salir.");
            System.out.print("Introduce la opción: ");
            op = teclado.nextInt();
            switch (op) {
                case 1: //Laura:
                    System.out.print("Introduce el primer numero: ");
                    int a = teclado.nextInt();
                    System.out.print("Introduce el segundo numero: ");
                    int b = teclado.nextInt();
                    int suma = a + b;
                    System.out.println("El resultado de: " + a + " + " + b + " es: " + suma);
                    break;
                case 2:  //Sara González Cuadra
                    System.out.print("Introduce el número: ");
                    int n = teclado.nextInt();
                    for (int i = 0; i <= 10; i++) {
                        System.out.println(n + " * " + i + " = " + (n * i));
                    }
                    break;
                case 3: //Carlos;
                    System.out.println("Escribe el numero a elevar");
                    int num = teclado.nextInt();
                    System.out.println("A qué quieres elevar el " + num);
                    int aux = teclado.nextInt();
                    System.out.println(num + " elevado a " + aux + " es: " + Math.pow(num, aux));
                    break;
                case 4:
                    System.out.println("Has salido con exito.");
                    break;
                default:
                    System.out.println("Se ha confundido de opción. ");
                    break;

            }
        } while (op != 4);
    }

}
