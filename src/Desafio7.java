import java.util.Scanner;

public class Desafio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();

        int[] notas = {100, 50, 20, 10, 5, 2, 1};

        System.out.println(valor);

        for (int nota : notas) {
            int quantidade = valor / nota;
            valor = valor % nota;

            System.out.println(quantidade + " nota(s) de R$ " + nota + ",00");
        }

    }
}
