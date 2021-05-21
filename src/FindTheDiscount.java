// Link of the problem : https://edabit.com/challenge/Wci9YChXWRj6JBeFP

public class FindTheDiscount {
    public static double discount(int price, int percentage) {
        double costPercentage = 1 - (double) percentage/100;
        return price * costPercentage;
    }
}
