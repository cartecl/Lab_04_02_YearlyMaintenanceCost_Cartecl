// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//A program that uses home maintenance costs for each
// of the four seasons and returns the total yearly maintenance costs.
//Again, be clear in the output by echoing the
// values for the seasonal costs when you display the combined total.

        double doubleCostWinter = 1200.50;
        double doubleCostSpring = 1300.75;
        double doubleCostSummer = 1000.90;
        double doubleCostFall = 1000.55;
        double doubleYearly = doubleCostWinter + doubleCostSpring + doubleCostSummer + doubleCostFall;

        System.out.println("Your yearly cost for maintenance is: " +doubleYearly);
        System.out.println("Your cost for maintenance in Winter: " +doubleCostWinter);
        System.out.println("Your cost for maintenance in Spring: " +doubleCostSpring);
        System.out.println("Your cost for maintenance in Summer: " +doubleCostSummer);
        System.out.println("Your cost for maintenance in Fall: " +doubleCostFall);
    }
}
