import java.util.Scanner;

public class Desafio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        for (int i = 0; i < numero; i++) {

            int cabonaci = scanner.nextInt();
            long a = 0;
            long b = 1;


            if (cabonaci == 0) {
                System.out.println("Fib("+cabonaci+") = " + a);
            } else if (cabonaci == 1) {
                System.out.println("Fib("+cabonaci+") = " + b);
            } else {
                for (int j = 2; j <= cabonaci; j++) {
                    long formula = a + b;

                    a = b;
                    b = formula;
                }
                System.out.println("Fib("+cabonaci+") = " + b);
            }

            //System.out.println("Fib("+cabonaci+") = " + formula);
        }

    }
}
