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

        System.out.println(map);

    }
}
