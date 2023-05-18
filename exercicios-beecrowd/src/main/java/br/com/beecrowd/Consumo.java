package br.com.beecrowd;

import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Consumo {

    public static void main(String[] args) {

        /*
            Calcule o consumo médio de um automóvel sendo fornecidos a distância total
            percorrida (em Km) e o total de combustível gasto (em litros).
         */
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a distancia percorrida:");
        int distanciaPercorrida = sc.nextInt();

        System.out.println("Digite o valor gasto com combustivel:");
        float gastoCombustivel = sc.nextFloat();

        float consumoMedio = distanciaPercorrida / gastoCombustivel;

        DecimalFormat df = new DecimalFormat("0.###");
        String dx = df.format(consumoMedio);

        System.out.println(dx + " km/l");
    }
}
