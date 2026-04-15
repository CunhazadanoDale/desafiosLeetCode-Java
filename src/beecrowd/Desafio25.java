package beecrowd;

import java.util.Scanner;

public class Desafio25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        boolean primeiraLetra = true;
        scanner.nextLine();

        for (int i = 0; i < numero; i++) {
            String frase = scanner.nextLine();
            StringBuilder sb = new StringBuilder();

            for (char c : frase.toCharArray()) {

                if (Character.isLetter(c) && primeiraLetra) {
                    primeiraLetra = false;
                    sb.append(c);
                } else if (!Character.isLetter(c)){
                    primeiraLetra = true;
                } else {
                    continue;
                }

            }

            System.out.println(sb);
        }
    }
}
