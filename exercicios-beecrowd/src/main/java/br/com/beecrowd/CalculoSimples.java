package br.com.beecrowd;

import java.util.Scanner;

public class CalculoSimples {
    /*
    Neste problema, deve-se ler o código de uma peça 1, o número de peças 1,
    o valor unitário de cada peça 1, o código de uma peça 2,
    o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código da peça, a quantidade e o valor unitario: ");
        int codPeca1 = sc.nextInt(); int qntPeca1 = sc.nextInt(); double valorUnitario1 = sc.nextDouble();
        int codPeca2 = sc.nextInt(); int qntPeca2 = sc.nextInt(); double valorUnitario2 = sc.nextDouble();

        double total = (qntPeca1 * valorUnitario1) + (qntPeca2 * valorUnitario2);
        System.out.println("Valor a Pagar: R$ " + total);

        sc.close();
    }
}
