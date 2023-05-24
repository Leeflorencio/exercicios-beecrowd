package br.com.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Distancia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int distanciaY = sc.nextInt();
        int tempoM = distanciaY * 2;

        System.out.println(tempoM + " minutos");
    }
}
