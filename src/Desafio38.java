import java.util.Scanner;

public class Desafio38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            int numero = scanner.nextInt();
            if (numero == 0) break;

            long[][] matriz = new long[numero][numero];

            for (int i = 0; i < numero; i++) {

                for (int j = 0; j < numero; j++) {

                    int valor = Math.min(
                            Math.min(i, j),
                            Math.min(numero - 1 - i, numero - 1 - j)
                    ) + 1;

                    matriz[i][j] = valor;

                    System.out.printf("%3d", matriz[i][j]);

                    if (j < numero - 1) {
                        System.out.print(" ");
                    }

                }

                System.out.println();
            }

            System.out.println();



        }
    }
}
