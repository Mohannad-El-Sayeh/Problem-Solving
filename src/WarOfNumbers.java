// Link of the problem : https://edabit.com/challenge/7fHsizQrTLXsPWMyH

public class WarOfNumbers {
    public static int warOfNumbers(int[] numbers){
        int evenSum = 0;
        int oddSum = 0;
        for(int number : numbers){
            if(number % 2 == 0){
                evenSum += number;
            }else {
                oddSum += number;
            }
        }
        return Math.abs(evenSum - oddSum);
    }
}
