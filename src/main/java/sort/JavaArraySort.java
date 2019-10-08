package sort;

import java.util.Arrays;

public class JavaArraySort {

    public static void main(String[] args) {
        int[] intArr = {1, 4, 5, 7, 0};
        String[] strArr = {"E", "A", "U", "O", "I"};
        Arrays.sort(intArr);
        Arrays.sort(strArr);

        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(strArr));
    }
}
