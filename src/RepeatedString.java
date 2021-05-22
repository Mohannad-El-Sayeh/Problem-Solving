// Link of the problem https://edabit.com/challenge/Sk3DXY6ZdwAKj6r8d

public class RepeatedString {
    public static long repeatedString(String s, long n) {
        if(!s.contains("a")){
            return 0;
        }
        if(s.equals("a")){
            return n;
        }
        int aCounterInOneTime = 0;
        long mod = Math.floorMod(n, s.length());
        long times = Math.floorDiv(n, s.length());
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == 'a') {
                aCounterInOneTime++;
            }
        }
        long aCounter = aCounterInOneTime * times;
        if(mod == 0){
            return aCounter;
        }
        String remainder = s.substring(0, (int) mod);
        for (int j = 0; j < remainder.length(); j++) {
            if(remainder.charAt(j) == 'a'){
                aCounter++;
            }
        }
        return aCounter;
    }
}
