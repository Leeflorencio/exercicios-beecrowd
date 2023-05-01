package br.com.beecrowd;

import java.util.Scanner;

public class IdadeEmDias {

    /*
    Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int dias = sc.nextInt();

        int ano = dias / 365;
        int mes = (dias % 365) / 30;
        int dia = (dias % 365) % 30;


        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");
    }
}