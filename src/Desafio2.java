public class Desafio2 {
    static void main(String[] args) {

        int x = -121;
        System.out.println(isPalindrome(x));

    }


    public static boolean isPalindrome(int x) {

        String valorOriginal = String.valueOf(x);
        String sb = new StringBuilder(valorOriginal)
                .reverse()
                .toString();

        return valorOriginal.equals(sb);
    }


}
