import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigo1 = sc.nextInt();
        int numero1 = sc.nextInt();
        double unitValor1 = sc.nextDouble();

        int codigo2 = sc.nextInt();
        int numero2 = sc.nextInt();
        double unitValor2 = sc.nextDouble();

        double calculo1 = numero1 * unitValor1;
        double calculo2 = numero2 * unitValor2;

        double resultado = calculo1 + calculo2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", resultado);

    }

}
