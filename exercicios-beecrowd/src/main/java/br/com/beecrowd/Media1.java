package br.com.beecrowd;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Media1 {
    public static void main(String[] args) {
        /*
            Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno. A seguir, calcule a média do aluno,
            sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11).
             Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
         */

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double media = (a * 3.5 + b * 7.5) / (3.5 + 7.5);
        System.out.printf("MEDIA = %.5f", media);
        System.out.println();
    }
}
