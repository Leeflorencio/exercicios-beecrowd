package br.com.beecrowd;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {
            /*
    Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora
    e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
     */

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu número: ");
        int num = sc.nextInt();

        System.out.println("Digite suas horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();

        System.out.println("Digite o valor recebido por hora: ");
        double valorHora = sc.nextDouble();

        double salario = valorHora * horasTrabalhadas;

        //DecimalFormat df = new DecimalFormat("0.####");
        //String dx = df.format(salario);

        System.out.println("NUMBER = " + num);
        System.out.println("SALARY = U$ " + salario);

    }
}
