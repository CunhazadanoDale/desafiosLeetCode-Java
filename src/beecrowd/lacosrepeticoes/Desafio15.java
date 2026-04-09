package beecrowd.lacosrepeticoes;

import java.util.Scanner;

public class Desafio15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int soma = 0;

        if (numero2 > numero1) {
            for (int i = numero1; i < numero2; i++) {
                if(i % 2 != 0 && i != numero1) {
                    soma += i;
                }
            }
        } else {
            for (int i = numero1; i > numero2; i--) {
                if (i % 2 != 0 && i != numero1) {
                    soma += i;
                }
            }
        }

        System.out.println(soma);
    }
}
