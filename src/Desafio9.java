import java.util.*;

public class Desafio9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] leitura = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int[] copia = leitura.clone();

        Arrays.sort(copia);

        for (int num : copia) {
            System.out.println(num);
        }

        System.out.println();

        for (int num : leitura) {
            System.out.println(num);
        }

    }
}
