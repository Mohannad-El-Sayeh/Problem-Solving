// Link for the problem : https://edabit.com/challenge/WzE2id9w5mNfXozKL

public class BoomerangsCounter {
    public static int countBoomerangs(int[] arr) {
        int boomerangsCounter = 0;
        for (int i=0; i<arr.length; i++){
            if(i+2 >= arr.length){
                continue;
            }
            if(arr[i] == arr[i+2] && arr[i] != arr[i+1]){
                boomerangsCounter++;
            }
        }
        return boomerangsCounter;
    }
}
