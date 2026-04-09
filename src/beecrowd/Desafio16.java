package beecrowd;

import java.util.Scanner;

public class Desafio16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1 = sc.nextInt();
        int contadorDentro = 0;
        int contadorFora = 0;

        for (int i = 0; i < numero1; i++) {
            int numero2 = sc.nextInt();

            if(numero2 >= 10 && numero2 <= 20) {
                contadorDentro++;
            } else {
                contadorFora++;
            }
        }

        System.out.println(contadorDentro + " in");
        System.out.println(contadorFora + " out");
    }
}
