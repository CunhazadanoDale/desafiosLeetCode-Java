package beecrowd;

import java.util.Scanner;

public class Desafio14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       int inteiro = sc.nextInt();
       int contador = 0;

       for (int i = inteiro; i < 100; i++ ) {
           if (i % 2 != 0 && contador < 6) {
               System.out.println(i);
               contador++;
           }
       }

    }
}
