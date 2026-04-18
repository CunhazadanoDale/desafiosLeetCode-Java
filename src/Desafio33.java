import java.util.Scanner;

public class Desafio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroVetores = scanner.nextInt();

        long[] vetores = new long[numeroVetores];
        long index = 0;

        for (int i = 0; i < vetores.length; i++) {

            vetores[i] = scanner.nextInt();
        }

        long menor = vetores[0];

        for (int vetor = 1; vetor < vetores.length; vetor++) {

            if (vetores[vetor] < menor) {
                menor = vetores[vetor];
                index = vetor;
            }
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + index);
    }
}
