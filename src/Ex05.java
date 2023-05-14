// Exercício 5:
// Escreva um programa que solicite o nome e a idade do usuário e exiba uma mensagem de boas-vindas.

import java.util.Scanner;

public class Ex05{
    public static void main(String[] args) {
        String nome, prefixo;
        int idade;
        var entrada = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        nome = entrada.nextLine();

        System.out.println("Qual a sua idade?");
        idade = entrada.nextInt();

        if (idade > 18) {
            prefixo = "Sr.(a)";
        } else {
            prefixo = "jovem";
        }

        System.out.printf("Seja bem vindo %s %s", prefixo, nome);

        entrada.close();
    }
}
