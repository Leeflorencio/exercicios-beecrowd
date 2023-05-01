package br.com.beecrowd;

import java.util.Scanner;

public class SalarioBonus {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o nome do vendedor: ");
            String nomeVendedor = sc.nextLine();

            System.out.println("Digite o seu salário: ");
            double salario = sc.nextDouble();

            System.out.println("Digite o total de vendas: ");
            double vendasEfetuadas = sc.nextDouble();

            double salarioBonus = (salario + (vendasEfetuadas * 15) / 100);

            System.out.println("Seu salario bonus é:  " + salarioBonus);


    }
}
