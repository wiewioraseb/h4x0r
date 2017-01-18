package Sort;

import java.util.Arrays;

public class BubbleSort {
    public int[] start(int[] params) {
        int temp;
        int iter = 1;

        System.out.println("Begin: " + Arrays.toString(params));

        while (iter != 0) {
            iter = 0;
            for (int i = 0; i < params.length - 1; i++) {
                if (params[i] > params[i + 1]) {
                    //Switch places
                    temp = params[i];
                    params[i] = params[i + 1];
                    params[i + 1] = temp;

                    iter++;
                }

            }
        }

        System.out.println("End: " + Arrays.toString(params));


        return params;
    }
}
