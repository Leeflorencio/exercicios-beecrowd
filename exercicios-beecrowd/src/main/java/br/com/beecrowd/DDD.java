package br.com.beecrowd;

import java.util.Scanner;

public class DDD {
    /*
    Leia um número inteiro que representa um código de DDD para discagem interurbana.
    Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:
    11 - São Paulo
    71 - Salvador
    61 - Brasilia
    21 - Rio de Janeiro
    32 - Juiz de Fora
    19 - Campinas
    27 - Vitoria
    31 - Belo Horizonte

    Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o programa deverá informar:
    DDD nao cadastrado.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu DDD: ");
        int ddd = sc.nextInt();

        switch (ddd){
            case 11:
                System.out.println("São Paulo");
                break;
            case 71:
                System.out.println("Salvador");
                break;
            case 61:
                System.out.println("Brasilia");
                break;
            case 21:
                System.out.println("Rio de Janeiro");
                break;
            case 32:
                System.out.println("Juiz de Fora");
                break;
            case 19:
                System.out.println("Campinas");
                break;
            case 27:
                System.out.println("Vitoria");
                break;
            case 31:
                System.out.println("Belo Horizonte");
                break;
            default:
                System.out.println("DDD nao cadastrado");
        }
    }
}
