package beecrowd;

import java.util.Scanner;

public class Desafio12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float[] entrada = {sc.nextFloat(), sc.nextFloat(), sc.nextFloat(),
                sc.nextFloat(), sc.nextFloat(), sc.nextFloat()};

        int contador = 0;
        for (float numero : entrada) {
            if (numero > 0) {
                contador++;
            }
        }

        System.out.println(contador + " valores positivos");

    }
}
