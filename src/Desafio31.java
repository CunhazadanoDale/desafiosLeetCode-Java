import java.util.Scanner;

public class Desafio31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inteiros = new int[6];

        for (int i = 0; i < inteiros.length; i++) {

            inteiros[i] = scanner.nextInt();
        }

        for (int i = 0; i < inteiros.length; i++) {
            int numeroInicial = inteiros[i];
            int numeroFInal = inteiros[inteiros.length - 1];

            inteiros[i] = numeroFInal;
            inteiros[inteiros.length - 1] = numeroInicial;


            System.out.println("N["+i+"] = " + inteiros[i]);
        }

    }
}
