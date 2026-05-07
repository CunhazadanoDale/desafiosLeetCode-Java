import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {

        int[] numeros = {2, 9, 3, 7};

        System.out.println(Arrays.toString(twoSum(numeros, 9)));

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        int i = 0;
        for (int num : nums) {
            int valorDiminuicao = target - num;

            if (map.containsKey(valorDiminuicao)) {
                return new int[]{map.get(valorDiminuicao), i};
            }

            map.put(num, i);
            i++;
        }

        return null;
    }
}
