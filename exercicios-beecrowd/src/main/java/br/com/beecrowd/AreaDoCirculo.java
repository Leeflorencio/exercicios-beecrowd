package br.com.beecrowd;

import java.util.Scanner;

public class AreaDoCirculo {

    public static void main(String[] args) {
        /*
            A fórmula para calcular a área de uma circunferência é: area = π . raio2.
            Considerando para este problema que π = 3.14159:
        - Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio: ");
        double raio = sc.nextDouble();
        double n = 3.14159;

        double area = (n * (raio * raio));
        System.out.println("Area do circulo: " + area);
    }
}
