public class Desafio4 {

    public static void main(String[] args) {

        String valor = "( {}";

        System.out.println(isValid(valor));
    }


    public static boolean isValid(String s) {

        int count = 0;
        for (char valor : s.toCharArray()) {

            if (Character.toString(valor).equals("(") ||  Character.toString(valor).equals(")")) {
                count++;
            }

        }

        return count >= 2;

    }

}
