package beecrowd.lacosrepeticoes;

import java.util.Scanner;

public class Desafio18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1 = sc.nextInt();

        for (int i = 1; i <= numero1; i++) {

            int numero2 = sc.nextInt();

            if(numero2 == 0) {
                System.out.println(checaPositivoNegativo(numero2));
            } else if (numero2 % 2 != 0) {
                System.out.println("ODD " + checaPositivoNegativo(numero2));
            } else {
                System.out.println("EVEN " + checaPositivoNegativo(numero2));
            }

        }
    }

    public static String checaPositivoNegativo(int num) {
        if (num > 0) {
            return "POSITIVE";
        } else if (num < 0) {
            return "NEGATIVE";
        } else {
            return "NULL";
        }
    }
}
