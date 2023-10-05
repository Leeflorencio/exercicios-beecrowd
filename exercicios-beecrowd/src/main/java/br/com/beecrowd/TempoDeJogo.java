package br.com.beecrowd.exercicio2;

import java.util.Scanner;

public class TempoDeJogo {

    /*
        Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
        sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tempo de inicio e fim do jogo");
        Integer inicio = sc.nextInt(); Integer fim = sc.nextInt();

        Integer tempo = inicio - fim;

        System.out.println("tempo: " + tempo);

    }
}
