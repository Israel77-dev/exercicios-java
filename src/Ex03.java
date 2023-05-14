// Exercício 3:
// Escreva um programa que calcule e exiba a média de três números fornecidos pelo usuário.

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        double num_1, num_2, num_3;
        var entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num_1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        num_2 = entrada.nextDouble();

        System.out.print("Digite o terceiro número: ");
        num_3 = entrada.nextDouble();

        System.out.printf("A média é: %.2f", media_3(num_1, num_2, num_3));

        entrada.close();
    }

    // Calcula a média de três números reais fornecidos
    private static double media_3(double num_1, double num_2, double num_3){
        return (num_1 + num_2 + num_3) / 3;
    }
}
