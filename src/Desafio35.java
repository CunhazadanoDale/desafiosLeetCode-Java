import java.util.Scanner;

public class Desafio35 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantiaDeTestes = scanner.nextInt();

        for (int i = 0; i < quantiaDeTestes; i++) {

            int numeroEhPrimo = scanner.nextInt();
            boolean ehPrimoSim = true;

            for (int j = 2; j < numeroEhPrimo; j++) {

                if (numeroEhPrimo % j == 0) {
                    ehPrimoSim = false;
                    break;
                }

            }

            if (ehPrimoSim) {
                System.out.println(numeroEhPrimo + " eh primo");
            } else {
                System.out.println(numeroEhPrimo + " nao eh primo");
            }

        }

    }
}
