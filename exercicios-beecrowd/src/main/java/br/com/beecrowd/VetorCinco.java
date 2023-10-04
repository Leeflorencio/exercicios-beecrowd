package br.com.beecrowd.exercicio2;

public class VetorCinco {

    public static void main(String[] args) {

        /*
        Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.
         */

        int vetor[];
        vetor = new int[5];
        int i;

        for(i=0; i<5; i++){
            vetor[i] = i;
            System.out.println("Vetor: " + vetor[i]);
        }
    }
}
