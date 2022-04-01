import java.util.Arrays;

public class Programme_19_Array {

    public static void main(String[] args) {
        //numeric array declaration
        int [] numArray = {
                1789,2035,1899,2040,1950,2255,7897,1455,787};
        int sum =0;
        //calculating the sum of arrays value

        for(int i =0; i< numArray.length; i++) {
            sum = sum + numArray[i];

        } //find the average of arrays values
        int average = sum/numArray.length;
        System.out.println("Value of the elements of the array are: " + Arrays.toString(numArray));
        System.out.println("Average of all the values of the array are: "  + average);

    }
}
