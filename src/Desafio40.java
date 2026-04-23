import java.util.Scanner;

public class Desafio40 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {

            int n = sc.nextInt();


            for (int i = 0; i <= n / 2; i++) {

                int estrelas = 2 * i + 1;
                int espacos = (n - estrelas) / 2;

                System.out.println(" ".repeat(espacos) + "*".repeat(estrelas));
            }


            System.out.println(" ".repeat((n - 1) / 2) + "*");


            System.out.println(" ".repeat((n - 3) / 2) + "***");

            System.out.println();
        }

        sc.close();
    }
}