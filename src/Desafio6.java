import java.util.ArrayList;
import java.util.Scanner;

public class Desafio6 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        double y = sc.nextDouble();
        //int c = sc.nextInt();

        double resultado = x / y;

        System.out.printf("%.3f km/l\n", resultado);

    }



}
