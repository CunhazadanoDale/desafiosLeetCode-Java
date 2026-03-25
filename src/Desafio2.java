import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) {

        System.out.println("Digite sua palavra: ");
        Scanner pegaPalavra = new Scanner(System.in);
        String palavra = pegaPalavra.nextLine();

        System.out.println("Digite a quantidade de letras: ");
        Scanner pegaDesafio = new Scanner(System.in);
        Integer numeroTranscricao = pegaDesafio.nextInt();

        System.out.println(criptografarErrado(palavra, numeroTranscricao));
    }


    public static List<String> criptografarErrado(String palavra, Integer numero) {
        List<Integer> listaNumeros = new ArrayList<>();

        for (char p : palavra.toLowerCase().toCharArray()) {
            listaNumeros.add(p - 'a' + numero + 1);
        }

        List<String> letrasJaAparecidas = listaNumeros.stream()
                .map(p -> {
                            return p.toString().chars();
                }
                ).toList();


        return letrasJaAparecidas;
    }
}
