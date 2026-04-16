package beecrowd;

import java.util.Scanner;

public class Desafio27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        scanner.nextLine();

        String frase = scanner.nextLine();
        String[] palavras = frase.split(" ");

        StringBuilder sb = new StringBuilder();

        for (String palavra : palavras) {

            if (palavra.length() == 3) {

                if (palavra.contains("UR")) {
                    sb.append("URI");
                } else if (palavra.contains("OB")) {
                    sb.append("OBI");
                } else {
                    sb.append(palavra);
                }

            } else if (palavra.length() > 3){
                sb.append(palavra);
            } else {
                sb.append(" ");
            }

            sb.append(" ");
        }

        System.out.println(sb);
    }
}
