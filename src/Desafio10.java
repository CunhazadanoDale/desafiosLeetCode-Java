import java.util.*;

public class Desafio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        boolean triangulo =
                (a + b > c) && (a + c > b) && (b + c > a);

        if (triangulo) {
            float perimetro = a + b + c;
            System.out.println("Perimetro = " + perimetro);

        } else {
            float areaTrapezio = ((a + b) * c) / 2;

            System.out.println("Area = " + areaTrapezio);
        }

    }
}
