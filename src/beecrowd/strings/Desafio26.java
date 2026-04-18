package beecrowd;

import java.util.*;

public class Desafio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numero; i++) {
            String frase = scanner.nextLine();

            int contador = 0;

            Set<Character> mapeador = new HashSet<>();

            for (char c : frase.toCharArray()) {

                if (Character.isLetter(c) && !mapeador.contains(Character.toLowerCase(c))) {
                    contador++;
                    mapeador.add(c);
                }

            }

            if (contador == 26) {
                System.out.println("frase completa");
            } else if (contador >= 26 / 2) {
                System.out.println("frase quase completa");
            } else {
                System.out.println("frase mal elaborada");
            }

        }


    }
}
