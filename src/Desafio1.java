import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int contador = 1;

        for (int i = 0; i < 4; i++) {
            int num = scanner.nextInt();

            contador = (contador - 1) + num;
        }

        System.out.println(contador);

    }
}
