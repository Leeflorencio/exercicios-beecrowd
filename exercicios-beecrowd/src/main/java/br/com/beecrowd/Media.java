package br.com.beecrowd;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        /*
        Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno.
        A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2,
        a nota B tem peso 3 e a nota C tem peso 5.
         */
        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        Double c = sc.nextDouble();

        Double media = (a*2 + b*3 + c*5) / (2 + 3 + 5);
        System.out.printf("MEDIA = %.1f", media);

        sc.close();
    }
}
