package homeworkweek3;

import java.util.Locale;
import java.util.Scanner;

public class Programme9_PrintCityNameWithSwitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the alphabet between A and F");
        String city = scanner.next().toUpperCase(Locale.ROOT);
        Programme9_PrintCityNameWithSwitch cityName = new Programme9_PrintCityNameWithSwitch();
        cityName.printCityName(city);

    }
    public void printCityName(String city) {
        switch (city) {
            case "A":
                System.out.println("Aberdeen");
                break;
            case "B":
                System.out.println("Belfast");
                break;
            case "C":
                System.out.println("Cambridge");
                break;
            case "D":
                System.out.println("Derby");
                break;
            case "E":
                System.out.println("Edinburugh");
                break;
            case "F":
                System.out.println("Feltham");
                break;
            default:
                System.out.println("The alphabet you entered is not between A and F");
        }

    }
}
