package homeworkweek3;

import java.util.Scanner;

public class Programme12_FindInputValue {
    /**
     * Write a program that tells us input value is number or an alphabet or symbol.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character: ");
        char ch = scanner.next().charAt(0);
        Programme12_FindInputValue inputValue = new Programme12_FindInputValue();
        inputValue.checkInputValueIsAlphabetNumberOrSymbol(ch);

    }
    public void checkInputValueIsAlphabetNumberOrSymbol(char ch) {
        if ((ch >= 'a' && ch <='z') || (ch>='A' && ch<='Z')) {
            System.out.println(ch + " is an Alphabet");
        } else if (ch>= '0' && ch <= '9') {
            System.out.println(ch + " is a Number");
        } else {
            System.out.println(ch + " is a Symbol");
        }


    }
}
