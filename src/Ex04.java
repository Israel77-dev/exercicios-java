// Exercício 4:
// Crie um programa que determine se um ano é bissexto ou não.

import java.util.Scanner; 

public class Ex04 {

    public static void main(String[] args) {
        int ano;
        var entrada = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        ano = entrada.nextInt();

        if (eh_bissexto(ano)) {
            System.out.printf("%d é um ano bissexto", ano);
        } else {
            System.out.printf("%d não é um ano bissexto", ano);
        }

        entrada.close();
    }

    public static boolean eh_bissexto(int ano){
        return (ano % 400 == 0) | (ano % 100 != 0) && (ano % 4 == 0);
    }
}
