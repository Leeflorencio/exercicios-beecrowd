package br.com.beecrowd;
import java.util.Scanner;

public class Esfera {

    /*
        Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R).
        A fórmula para calcular o volume é: (4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();
        double pi = 3.14159;
        double volumeEsfera = (4.0/3) * pi * Math.pow(raio,3);

        System.out.printf("O volume da esfera é: %.3f%n", volumeEsfera);
        sc.close();
    }
}
