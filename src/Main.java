import java.util.*;

import static java.lang.System.in;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner pegaPalavra = new Scanner(in);
        String palavra = pegaPalavra.nextLine();

        System.out.println(criptografia(palavra));
    }


    public static List<Integer> criptografia(String pass) {

        String[] criptografar = pass.toLowerCase().split("");

        List<String> letras = List.of("a", "b", "c", "d", "e", "f",
                "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z");

        Map<String, Integer> valor = new HashMap<>();

        for (int i = 0; i < letras.size(); i++ ) {
            valor.put(letras.get(i), i + 1);
        }

        List<Integer> resultado = new ArrayList<>();

        for (String letra : criptografar) {
            if(valor.containsKey(letra)) {
                resultado.add(valor.get(letra));
            }
        }

        return resultado;
    }
}