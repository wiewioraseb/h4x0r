package Sort;


import java.util.Arrays;

public class InsertionSort {

    public int[] start(int[] params) {
        int temp;
        int j;

        for (int i = 0; i < params.length - 1; i++) {
            j = i;
            temp = params[i + 1];
            while ((j >= 0) && (params[j] > temp)) {
                params[j + 1] = params[j];
                j--;
            }
            params[j + 1] = temp;
        }

        System.out.println("Sorted with Insertion Sort: " + Arrays.toString(params));
        return params;
    }
}
