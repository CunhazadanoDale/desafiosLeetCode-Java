package beecrowd.condicional;

import java.util.Scanner;

public class Desafio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float d = sc.nextFloat();

        int[] pesos = {2, 3, 4, 1};

        float media = ( (a * pesos[0]) + (b * pesos[1]) + (c * pesos[2]) + (d * pesos[3]) ) / (pesos[0] + pesos[1] + pesos[2] + pesos[3]);

        System.out.printf("Media: %.1f\n", media);
        if(media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            float e = sc.nextFloat();
            System.out.println("Nota do exame: " + e);

            float resultado = ( media + e ) / 2;

            if (resultado >= 5) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.println("Media final: " + resultado);
        }


    }
}
