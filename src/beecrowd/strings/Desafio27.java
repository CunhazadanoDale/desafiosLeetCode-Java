package beecrowd.strings;

import java.util.Scanner;

public class Desafio27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        String[] palavras = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {

            String palavra = palavras[i];

            if (palavra.length() == 3) {
                if (palavra.startsWith("OB")) {
                    palavra = "OBI";
                } else if (palavra.startsWith("UR")) {
                    palavra = "URI";
                }
            }

            if (i > 0) System.out.print(" ");
            
            System.out.print(palavra);
        }

        System.out.println();
    }
}