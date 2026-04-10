package beecrowd.lacosrepeticoes;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroDeTestes = scanner.nextInt();

        Map<String, Integer> map = new HashMap<>();

        map.put("C", 0);
        map.put("R", 0);
        map.put("S", 0);

        for (int i = 0; i < numeroDeTestes; i++) {

            int numeroDoTema = scanner.nextInt();
            String tipoAnimal = scanner.next();

            if(map.containsKey(tipoAnimal)) {
                int valorNovo = map.get(tipoAnimal) + numeroDoTema;
                map.replace(tipoAnimal, map.get(tipoAnimal), valorNovo);
            }

        }

        int total = map.get("C") + map.get("R") + map.get("S");

        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + map.get("C"));
        System.out.println("Total de ratos: " + map.get("R"));
        System.out.println("Total de sapos: " + map.get("S"));
        System.out.printf("Percentual de coelhos: %.2f %%\n", (map.get("C") * 100.0) / total);
        System.out.printf("Percentual de ratos: %.2f %%\n", (map.get("R") * 100.0) / total);
        System.out.printf("Percentual de sapos: %.2f %%\n", (map.get("S") * 100.0) / total);

    }
}
