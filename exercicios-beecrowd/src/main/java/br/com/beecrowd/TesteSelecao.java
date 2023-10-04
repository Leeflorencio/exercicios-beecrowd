package br.com.beecrowd.exercicio2;

import java.util.Scanner;

public class TesteSelecao {

    public static void main(String[] args) {

        /*
        Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A,
         e a soma de C com D for maior que a soma de A e B e se C e D,
         ambos, forem positivos e se a variável A for par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os valores inteiros: ");

        Integer A = sc.nextInt();
        Integer B = sc.nextInt();
        Integer C = sc.nextInt();
        Integer D = sc.nextInt();

        Integer result1 = C + D;
        Integer result2 = A + B;

        if(B > C && D > A && C > 0 && D > 0 && A % 2 == 0){
            if(result1 > result2){
                System.out.println("Valores aceitos");
            }
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
