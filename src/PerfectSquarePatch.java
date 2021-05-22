// Link of the problem : https://edabit.com/challenge/7Tb7qMDQHtz3xpydd

import java.util.Arrays;

public class PerfectSquarePatch {
    public static int[][] squarePatch(int n) {
        int[][] matrix = new int[n][n];
        for (int[] arr : matrix)
            Arrays.fill(arr, n);
        return matrix;
    }
}
