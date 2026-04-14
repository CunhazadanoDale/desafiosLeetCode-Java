package beecrowd;

import java.util.Scanner;

public class Desafio22 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /**
         * Na primeira passada, somente caracteres que sejam letras minúsculas e maiúsculas devem ser deslocadas 3 posições para a direita
         * Na segunda passada, a linha deverá ser invertida. Na terceira e última passada, qualquer caractere a  partir da metade em diante
         * devem ser deslocados uma posição para a esquerda.
         */

        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {

            String palavraParaCriptografar = scanner.next();

            StringBuilder sb = new StringBuilder();

            // a quantidade de vezes que vai rodar o codigo da criptografia
            for (int j = 0; j < palavraParaCriptografar.length(); j++) {

                palavraParaCriptografar.chars().forEach( p -> sb.append(p + 3));
                char c = palavraParaCriptografar.charAt(j);

                sb.append(c);

                String inverter = new StringBuilder(sb).reverse().toString();

                System.out.println(sb);


            }
        }
    }
}
