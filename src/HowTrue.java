// Link for the problem : https://edabit.com/challenge/vKpGt4ufSKmEJ3Xjd

public class HowTrue {
    public static int countTrue(boolean[] arr) {
        int trueCounter = 0;
        if(arr.length == 0){
            return 0;
        }
        for(boolean dec : arr){
            if(dec){
                trueCounter++;
            }
        }
        return trueCounter;
    }
}
