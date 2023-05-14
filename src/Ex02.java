// Exercício 02:
// Crie um programa que verifique se um número é par ou ímpar.

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");

        if (entrada.nextInt() % 2 == 0) {
            System.out.print("O número é par");
        } else {
            System.out.print("O número é ímpar");
        }

        entrada.close();
    }
}
