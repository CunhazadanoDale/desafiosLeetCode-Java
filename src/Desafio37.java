import java.util.Scanner;

public class Desafio37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroDeTestes = scanner.nextInt();

        for (int i = 0; i < numeroDeTestes; i++) {

            int a = scanner.nextInt();
            int b = scanner.nextInt();

            String copiaA = String.valueOf(a);
            String copiaB = String.valueOf(b);

            if (copiaA.endsWith(copiaB)) {
                System.out.println("encaixa");
            } else {
                System.out.println("nao encaixa");
            }

        }

    }
}
