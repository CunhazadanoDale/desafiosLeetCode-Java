import java.util.Scanner;

public class Desafio36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorPar = new int[5];
        int[] vetorImpar = new int[5];

        int contadorPar = 0;
        int contadorImpar = 0;

        for (int i = 0; i < 15; i ++) {

            int num = scanner.nextInt();

            if (num % 2 == 0) {

                vetorPar[contadorPar] = num;
                contadorPar++;

                if (contadorPar == 5) {
                    for (int j = 0; j < 5; j++) {
                        System.out.println("par[" + j +"] = " + vetorPar[j]);
                    }

                    contadorPar = 0;
                }

            } else {

                vetorImpar[contadorImpar] = num;
                contadorImpar++;

                if (contadorImpar == 5) {

                    for (int j = 0; j < 5; j++) {
                        System.out.println("impar[" + j +"] = " + vetorImpar[j]);
                    }

                    contadorImpar = 0;
                }

            }

        }

        for (int j = 0; j < contadorImpar; j++) {
            System.out.println("impar[" + j +"] = " + vetorImpar[j]);
        }


        for (int i = 0; i < contadorPar; i++) {
            System.out.println("par[" + i +"] = " + vetorPar[i]);
        }

    }
}
