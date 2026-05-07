import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    static void main(String[] args) {
        int[] nums1 = {1, 3};

        int[] nums2 = {2};

        System.out.println(findMedianSortedArrays(nums1, nums2));

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] newInt = new int[nums1.length + nums2.length];

        int contador1 = 0;
        for (int num : nums1) {
            newInt[contador1] = num;
            contador1++;
        }
        for (int num : nums2) {
            newInt[contador1] = num;
            contador1++;
        }

        int[] arraySorted = Arrays.stream(newInt).sorted().toArray();

        int media = arraySorted.length / 2;

        if (arraySorted.length % 2 == 0) {
            return (double) (arraySorted[media] + arraySorted[media - 1]) / 2;
        } else {
            return (double) arraySorted[media];
        }
    }
}
