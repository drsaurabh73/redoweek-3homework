package homeworkweek3;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class Programme10_DoOperationWithSymbol {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the First Number: ");
        int x = scanner.nextInt();
        System.out.println("Enter the Second NUmber: ");
        int y = scanner.nextInt();
        System.out.println("Please select the calculation symbol +,-,*,/:");
        char symbol = scanner.next().charAt(0);
        doOperationBySelectingSymbol(x,y,symbol);


    }
    public static void doOperationBySelectingSymbol(int x, int y, char symbol) {
        if(symbol == '+') {
            System.out.println(x + "  + " + y + " = " + (x + y));
        } else if (symbol == '-') {
            System.out.println(x + " -  " + y + " = " + (x - y));
        } else if (symbol == '*') {
            System.out.println(x + " *  " + y + " = " + (x * y));
        } else if (symbol == '/') {
            System.out.println(x + " /  " + y + " = " + (x / y));
        }

    }
}
