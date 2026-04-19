package beecrowd.matrizes;

import java.util.Scanner;

public class Desafio28 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] ints = new int[10];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = scanner.nextInt();

            if (ints[i] > 0) {
                System.out.println("X[" + i + "] = " + ints[i]);
            } else {
                ints[i] = 1;
                System.out.println("X[" + i + "] = " + 1);
            }
        }
    }
}
