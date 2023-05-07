package br.com.beecrowd;
import java.util.Scanner;

public class EhMaior {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int maior = 0;

            if(a > b && a > c){
                maior = a;
            } else if (b > c && b > a){
                maior = b;
            } else{
                maior = c;
            }

            System.out.println(maior + " eh o maior");
    }
}
