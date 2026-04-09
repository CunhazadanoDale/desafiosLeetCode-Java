package beecrowd.lacosrepeticoes;

import java.util.Scanner;

public class Desafio19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1 = sc.nextInt();

        for (int i = 1; i <= 10000; i++) {
            if (i % numero1 == 2) {
                System.out.println(i);
            }
        }
    }
}
