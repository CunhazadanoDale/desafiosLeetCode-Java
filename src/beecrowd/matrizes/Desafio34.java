package beecrowd.matrizes;

import java.util.Scanner;

public class Desafio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] matriz = new double[12][12];

        int numeroDaLinha = scanner.nextInt();

        String somaOuMedia = scanner.next();

        double soma = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length; j++) {

                matriz[i][j] = scanner.nextDouble();

                if(i == numeroDaLinha) {
                    soma += matriz[i][j];
                }

            }
        }

        if (somaOuMedia.toLowerCase().trim().equals("s")) {
            System.out.println(soma);
        } else if (somaOuMedia.toLowerCase().trim().equals("m")) {
            System.out.println(soma / 12);
        }

    }
}
