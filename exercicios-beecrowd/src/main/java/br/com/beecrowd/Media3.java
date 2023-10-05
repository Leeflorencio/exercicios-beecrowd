package br.com.beecrowd.exercicio2;

import java.util.Scanner;

public class Media3 {
    /*
    Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal, correspondente às quatro notas de um aluno.
    Calcule a média com pesos 2, 3, 4 e 1, respectivamente, para cada uma destas notas e mostre
    esta média acompanhada pela mensagem "Media: ". Se esta média for maior ou igual a 7.0, imprima a mensagem "Aluno aprovado.".
     Se a média calculada for inferior a 5.0, imprima a mensagem "Aluno reprovado.".
     Se a média calculada for um valor entre 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.".
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();

        double media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / (2 + 3 + 4 + 1);
        System.out.println(String.format("Media: %.1f", media));

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else if (media >= 5.0 || media <= 6.9) {
            System.out.println("Aluno em exame.");
            double exame = sc.nextDouble();
            System.out.println("Nota do exame: " + exame);

            double mediaFinal = (exame + media) / 2;

            if(mediaFinal >= 5.0){
                System.out.println("Aluno aprovado");
            } else{
                System.out.println("Aluno reprovado");
            }
            System.out.println(String.format("Media Final: %.1f", mediaFinal));
        }

    }
}
