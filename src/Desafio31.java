import java.util.Scanner;

public class Desafio31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inteiros = new int[20];

        for (int i = 0; i < inteiros.length; i++) {

            inteiros[i] = scanner.nextInt();
        }

        for (int i = 0; i < inteiros.length / 2; i++) {

            int temp = inteiros[i];
            inteiros[i] = inteiros[inteiros.length - 1 - i];
            inteiros[inteiros.length - 1 - i] = temp;
        }

        for (int i = 0; i < inteiros.length; i++) {
            System.out.println("N["+i+"] = " + inteiros[i]);
        }

    }
}
