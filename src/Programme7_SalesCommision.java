import java.util.Scanner;

public class Programme7_SalesCommision {
    /**
     * Write a java program input seller id, sellers name, sales amount, and basic salary
     * then fined this sales
     * Commission
     * Sales amount &gt;= 50,000 35%
     * Sales amount &gt;= 30,000 20%
     * &gt;= 20,000 10%
     * &gt;= 10,000 5%
     * &lt; 10,000 2%
     *
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Seller Name:" );
        String name = scanner.nextLine();
        System.out.println("Enter Seller ID:");
        int sellerId = scanner.nextInt();
        System.out.println("Enter Sales Amount:");
        int salesAmount = scanner.nextInt();
        System.out.println("Enter Basic Salary:");
        int basicSalary = scanner.nextInt();
        Programme7_SalesCommision  salesCommision = new Programme7_SalesCommision();
        int grossSalary = basicSalary + salesCommision.calculatCommision(salesAmount);
        System.out.println("Sellers Name                    : "  +name             );
        System.out.println("Sellers ID                      : "   + sellerId       );
        System.out.println("Sellers sales Amount is         : "   +salesAmount     );
        System.out.println("Sellers Basic Salary is         :"     +basicSalary    );
        System.out.println("Sellers Gross Salary is          :"    +grossSalary    );


    }
         //calculating the sales commision
    public int calculatCommision(int salesAmount) {
        int commision;
        if(salesAmount >= 50000) {
            commision = (salesAmount * 35) / 100;
            System.out.println("Sales Commision is "   +commision );
        } else if(salesAmount>=30000) {
            commision = (salesAmount * 20) / 100;
            System.out.println("Sales commision is " + commision);
        } else if (salesAmount>= 20000) {
            commision = (salesAmount * 10) / 100;
            System.out.println(" Sales commision is " + commision);
        } else if (salesAmount>= 10000) {
            commision = (salesAmount * 5) / 100;
            System.out.println("Sales commision is " + commision);
        } else {
            commision = (salesAmount * 2) / 100;
            System.out.println("Sales commision is" + commision);
        }
        return commision;


    }
    }
