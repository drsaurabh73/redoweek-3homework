import java.util.Scanner;

public class Programme3_MarkSheet {

    /* Write a Java programme to input student Name, Roll No, and three subject Maths, Science and English marks
    (marks is between 0 and 100and if it is out of range print error message " Invalid Input,
    Marks should be between o and 100") and find out total, percentage and result.
    * If he is pass or fail on the basis of percentage (pass=>35) and also give them grade if
    % >80% A+,%> = 60% A, %>50 B, %>=35 C AND Print mark sheet in the following format
     */

    public static void main(String[] args) {
        //scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the student Name           \t\t:\t");
        String name = scanner.next();
        System.out.println("\nEnter the student Roll no        \t\t:\t");
        int rollNum = scanner.nextInt();
        System.out.println("\nEnter the Marks of Subject Maths    \t:\t");
        int mathsMarks = scanner.nextInt();
        if (mathsMarks < 0) {
            System.out.println("\nInvalid input, Marks should be between 0 and 100: ");
            System.out.println("\nPlease enter the correct marks\t\t:\t");
            mathsMarks = scanner.nextInt();
        }
        System.out.println("Enter the marks of subject Science\t:\t");
        int scienceMarks = scanner.nextInt();
        if (scienceMarks < 0 || scienceMarks >100) {
            System.out.println("\nInvalid input,Marks should be between 0 and 100");
            System.out.println("\nPlease enter the correct Marks\t\t:\t");
            scienceMarks = scanner.nextInt();
        }
        System.out.println("Enter the marks of subject English\t:\t");
        int englishMarks = scanner.nextInt();
        if (englishMarks < 0 || englishMarks > 100) {
            System.out.println("\nInvalid marks, Marks should be between 0 and 100");
            System.out.println("Enter the marks of English\t:\t");
            englishMarks = scanner.nextInt();
        }
        int total = sum(mathsMarks, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String reslt = calculateResult(mathsMarks, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, reslt);
        printTheMarkSheet(name, rollNum, mathsMarks, scienceMarks, englishMarks, total, percentage, reslt, grade);
    }

    //calculate the sum
    public static int sum(int a, int b, int c) {
        return a + b + c;
    } // calculating the results on subject marks
    public static String calculateResult(int mathsMarks,int scienceMarks, int englishMarks) {
        if (mathsMarks<35 || scienceMarks <35 || englishMarks<35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }



    // calculating the grade on percentage and result
    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("Pass")) ;
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "c";
        } else {
            grade = "-";
        }
        return grade;
    }
    // printing the marks sheet
    public static void printTheMarkSheet(String name,int rollNum, int mathsMarks, int scienceMarks,int englishMarks, double total, double percentage, String result, String grade) {
        System.out.println("------------------------------------------------------------");
        System.out.println("|                                                          |");
        System.out.println("| Mark Sheet                                               |");
        System.out.println("|__________________________________________________________|");
        System.out.println("| Name:"  + name +   "                                     |");
        System.out.println("|  Roll No:"  + rollNum +  "                               |");
        System.out.println("|----------------------------------------------------------|");
        System.out.println("|  Maths :" +  mathsMarks + "                              |");
        System.out.println("| Science :" + scienceMarks + "                            |");
        System.out.println("|  English :"  + englishMarks + "                          |" );
        System.out.println("|----------------------------------------------------------|");
        System.out.println("| Total:"        + total + "                               |");
        System.out.println("|----------------------------------------------------------|");
        System.out.println("| Percentage:"  +percentage +        "                     |" );
        System.out.println("| Result:"    +result +   "                                |");
        System.out.println("| Grade:"      +grade +    "                               |");
        System.out.println("|----------------------------------------------------------|");


}


    }
