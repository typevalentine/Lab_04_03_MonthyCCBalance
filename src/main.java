public class main
{
    public static void main(String[] args)
    {
        int intBalance = 5000;
        final double INT_RATE = .17;
        double oneMonthInt = 0;
        double oneMonthBal = 0;
        double twoMonthInt = 0;

        oneMonthInt = intBalance * INT_RATE;
        oneMonthBal = intBalance + oneMonthInt;
        twoMonthInt = oneMonthBal * INT_RATE;

        System.out.println("Interest after one month: $" + oneMonthInt);
        System.out.println("Interest after two months: $" + twoMonthInt);
    }
}
