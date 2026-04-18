import java.util.Scanner;

public class Desafio30 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float[] inteiros = new float[100];

        for (int i = 0; i < inteiros.length; i++) {

            inteiros[i] = scanner.nextFloat();

            if (inteiros[i] <= 10) {
                System.out.printf("A[%d] = %.1f\n", i, inteiros[i]);
            }

        }

    }
}
