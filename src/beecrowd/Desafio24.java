package beecrowd;

import java.util.Scanner;

public class Desafio24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeCasos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < quantidadeCasos; i++) {

            String frase = scanner.nextLine();
            int numeroPulo = scanner.nextInt();
            scanner.nextLine();

            StringBuilder sb = new StringBuilder();

            for (char c : frase.toCharArray()) {

                if (Character.isLetter(c)) {
                    sb.append(Character.isUpperCase(c) ? (char) ((c - 'A' - numeroPulo + 26) % 26 + 'A')
                            : (char) ((c - 'a' - numeroPulo + 26) % 26 + 'a') );

                } else {
                    sb.append(c);
                }
            }

            System.out.println(sb);

        }
    }
}
