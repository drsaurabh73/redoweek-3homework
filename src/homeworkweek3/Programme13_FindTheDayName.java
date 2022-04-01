package homeworkweek3;

import java.util.Scanner;

public class Programme13_FindTheDayName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number between 1 and 7:");
        int day = scanner.nextInt();
        findTheDayName(day);

    }

    public static void findTheDayName(int day) {
        switch (day) {
            case 1:
                System.out.println("Its Monday");
                break;
            case 2:
                System.out.println("Its Tuesday");
                break;
            case 3:
                System.out.println("Its Wednesday");
                break;
            case 4:
                System.out.println("Its Thursday");
                break;
            case 5:
                System.out.println("Its Friday");
                break;
            case 6:
                System.out.println("Its Saturday");
                break;
            case 7:
                System.out.println("Its Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

    }
}
