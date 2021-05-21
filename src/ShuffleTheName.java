// Link of the problem : https://edabit.com/challenge/8WBpaPzLP7piuHNeR

public class ShuffleTheName {
    public static String nameShuffle(String s) {
        String firstName = s.substring(0, s.indexOf(" "));
        String lastName = s.substring(s.indexOf(" ") + 1);
        return lastName + " " + firstName;
    }
}
