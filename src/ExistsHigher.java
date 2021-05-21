// Link of the problem : https://edabit.com/challenge/aWzxPLibBLJgn8AbZ

public class ExistsHigher {
    public static boolean existsHigher(int[] arr, int n) {
        for (int i : arr) {
            if(i >= n){
                return true;
            }
        }
        return false;
    }
}
