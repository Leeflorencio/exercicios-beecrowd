package br.com.beecrowd.exercicio2;

public class VetorReais {

    /*
    Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.
     */

    public static void main(String[] args) {
        double vetor[];
        vetor = new double[10];
        double i;

        for(i=9; i>=0; i--){
            vetor[(int) i] = i;
            System.out.println("Vetor: " + vetor[(int) i]);
        }
    }
}
