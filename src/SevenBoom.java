// Link of the problem : https://edabit.com/challenge/CKqfEowjmSTw2jsso

public class SevenBoom {
    public static String sevenBoom(int[] arr) {
        for(int i : arr){
            String num = String.valueOf(i);
            if(num.contains("7")){
                return "Boom!";
            }
        }
        return "there is no 7 in the array";
    }
}
