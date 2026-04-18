package beecrowd.strings;

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
        scanner.nextLine();

        // primeiro for para dar inicio à sequência
        for (int i = 0; i < num; i++) {

            String palavraParaCriptografar = scanner.nextLine();
            StringBuilder sb = new StringBuilder();

            // primeiro for para percorrer todas as letras ou espaços na palavra
            for(char c : palavraParaCriptografar.toCharArray()) {
                if (Character.isLetter(c)) {
                    char c1 = (char) (c + 3);
                    sb.append(c1);
                } else {
                    sb.append(c);
                }
            }

            // invertendo a string
            String reverso = new StringBuilder(sb).reverse().toString();
            int metade = reverso.length() / 2;


            // criacao da criptografia
            StringBuilder resultadoFinal = new StringBuilder();

            // ultimo loop para o ultimo passo
            for (int j = 0; j < reverso.length(); j++) {
               char c = reverso.charAt(j);

               if(j >= metade) {
                   resultadoFinal.append((char) (c - 1));
               } else {
                   resultadoFinal.append(c);
               }
            }

            System.out.println(resultadoFinal);


        }
    }
}
