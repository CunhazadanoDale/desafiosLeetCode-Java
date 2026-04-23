package beecrowd.avulsos;

import java.util.Scanner;

public class Desafio39 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNext()) {

            int a = scanner.nextInt();
            if (a == 0) break;

            int b = scanner.nextInt();
            int c = scanner.nextInt();

            int lado = (int) Math.sqrt((double) (a * b * 100) / c);

            System.out.println(lado);
        }

    }
}
