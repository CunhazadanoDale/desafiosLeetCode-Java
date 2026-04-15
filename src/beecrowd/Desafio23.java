package beecrowd;

import java.util.Scanner;

public class Desafio23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String frase = scanner.nextLine();
            boolean maiuscula = true;

            StringBuilder sb = new StringBuilder();

            for (char c : frase.toCharArray()) {

                if (Character.isLetter(c)) {

                    sb.append(maiuscula ? Character.toUpperCase(c) : Character.toLowerCase(c));
                    maiuscula = !maiuscula;

                } else {
                    sb.append(c);
                }
            }

            System.out.println(sb);
        }


    }
}
