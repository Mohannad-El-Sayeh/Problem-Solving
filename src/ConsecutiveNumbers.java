// Link for the problem : https://edabit.com/challenge/Md6usCHQ7Xsj2fQi3

import java.util.Arrays;

public class ConsecutiveNumbers {
    public static boolean cons(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] + 1 == arr[i+1]){
                continue;
            }
            return false;
        }
        return true;
    }
}
