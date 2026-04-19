package beecrowd.matrizes;

import java.util.Scanner;

public class Desafio29 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] ints = new int[10];
        int somador = 0;

        for (int i = 0; i < ints.length; i++) {

            if (i == 0) {
                ints[i] = scanner.nextInt();
                somador+= ints[i];
                System.out.println("N[" + i + "] = " + ints[i]);
            } else {
                somador+= somador;
                ints[i] = somador;
                System.out.println("N[" + i + "] = " + ints[i]);
            }

        }
    }
}
