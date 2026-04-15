package beecrowd;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numero; i++) {
            String frase = scanner.nextLine();

            int contador = 0;
            int alfabeto = 26;

            Map<Character, Integer> mapeador = new HashMap<>();

            for (char c : frase.toCharArray()) {

                if (Character.isLetter(c) && !mapeador.containsKey(c)) {
                    contador++;
                    mapeador.put(c, contador);
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
