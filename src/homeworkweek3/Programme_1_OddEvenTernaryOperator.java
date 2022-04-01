package homeworkweek3;

/*
    1. Write a Java programme that tells you that the input number is even or odd
    * HINT: use Ternary operator
     */

import java.util.Scanner;

public class Programme_1_OddEvenTernaryOperator {


    public static void main(String[] args) {
        // scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = scanner.nextInt();
        isItOddOrEvenNumber(number);
    }
    public static void isItOddOrEvenNumber(int number) {
        //ternary operator is used
        String evenOrOdd = (number%2 == 0) ? "even" : "odd";
        System.out.println("The " + number + " is  " +  evenOrOdd + " number");

    }

}
