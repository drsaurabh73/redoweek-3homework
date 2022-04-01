import java.util.Scanner;

public class Programme_16FindPositivenegative {
/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a Number: ");
    int number = scanner.nextInt();
findNumberIsPositiveNegativeOrZero(number);


}
public static void findNumberIsPositiveNegativeOrZero (int number) {
    if(number>0) {
        System.out.println(number +" is a Positive Number");
    } else if (number<0) {
        System.out.println(number + "  is a Negative Number");
    } else {
        System.out.println(number + " is Zero");
    }
}

}
