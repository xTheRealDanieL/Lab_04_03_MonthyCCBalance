public class Main
{
    public static void main(String[] args)
    {
        double balance = 5000;
        double firstMonth;
        double secondMonth;

        firstMonth = balance * 17 / 100;
        secondMonth = (balance + firstMonth) * 17 / 100;

        System.out.println("The interest after 1 month: " + firstMonth);
        System.out.println("The interest after 2 month: " + secondMonth);
    }
}