import java.util.Scanner;

public class Programme2_LeapYear {
    /*
    Write a Java programme to input any year like (ex.2007) and find out if it is leap year or not?
     */

    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the year:  ");
        int year = sc.nextInt();
        Programme2_LeapYear leapYear = new Programme2_LeapYear();
        leapYear.isItLeapYear(year);
        // closing the scanner object



    } // checking is it leap year or not
    public void isItLeapYear (int year) {
        if (year % 4 == 0 && year % 100 == 0 || year % 400 == 0) {
            System.out.println(" The Year" + year + " is not a leap year ");
            return;
        }
        System.out.println("The year " + year + " is not a leap year");
    }

}
