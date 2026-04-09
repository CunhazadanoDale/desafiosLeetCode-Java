package beecrowd.lacosrepeticoes;

import java.util.Scanner;

public class Desafio17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1 = sc.nextInt();

        for (int i = 1; i <= numero1; i++) {
            if(i % 2 == 0) {
                System.out.println(i + "^2 = " + i * i);
            }
        }
    }
}
