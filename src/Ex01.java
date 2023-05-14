// Exercício 1:
// Escreva um programa que solicite dois números ao usuário e exiba a soma deles.

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        int numero_1, numero_2;
        var entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        numero_1 = entrada.nextInt();

        System.out.print("Digite outro número inteiro: ");
        numero_2 = entrada.nextInt();

        System.out.println("A soma dos números é: "+ (numero_1 + numero_2));

        entrada.close();
    }
}
