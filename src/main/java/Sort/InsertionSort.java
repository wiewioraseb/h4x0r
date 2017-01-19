package Sort;


import java.util.Arrays;

public class InsertionSort {

    public int[] start(int[] params) {
        int temp;

        for(int i = 0; i < params.length - 1; i++) {
//            for(int j = i; j >= 0; j--) {
                int j = i;

                while (j >= 0 && params[j] > params[j + 1]) {
                    if (params[j] > params[j + 1]) {
                        temp = params[j];
                        params[j] = params[j + 1];
                        params[j + 1] = temp;
                    } else {
                        break;
                    }
                    j--;
                }


//            }

        }

        System.out.println("Sorted with Insertion Sort: " + Arrays.toString(params));
        return params;
    }
}
