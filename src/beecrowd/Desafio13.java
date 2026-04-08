package beecrowd;

import java.util.Scanner;

public class Desafio13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float[] entrada = {sc.nextFloat(), sc.nextFloat(), sc.nextFloat(),
                sc.nextFloat(), sc.nextFloat(), sc.nextFloat()};

        int contador = 0;
        float soma = 0;

        for (float numero : entrada) {
            if (numero > 0) {
                contador++;
                soma += numero;
            }
        }

        double media = soma / contador;

        System.out.println(contador + " valores positivos");
        System.out.printf("%.1f\n", media);

    }
}
