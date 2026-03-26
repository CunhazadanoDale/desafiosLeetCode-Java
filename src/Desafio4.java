import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroFuncionario = sc.nextInt();
        int horaTrabalhada = sc.nextInt();
        double ganhaHora = sc.nextDouble();

        double salario = ganhaHora * horaTrabalhada;


        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }

}
