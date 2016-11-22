import java.util.Scanner;

/**
 * @author flo
 * @since 22/11/2016.
 */
public class Lab3Algorithms {
    public static void main(String[] args) {

        int number = Integer.valueOf(ReadUtils.readValueFromConsole());
        if (number < 0) {
            System.out.println("Negative");
        } else {
            int pow = number * number;
            System.out.println(pow);
        }
    }



}
