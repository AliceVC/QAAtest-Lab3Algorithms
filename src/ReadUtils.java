import java.util.Scanner;

/**
 * @author flo
 * @since 22/11/2016.
 */
public class ReadUtils {

    public static String readValueFromConsole() {
        return new Scanner(System.in).nextLine();
    }

    public static Integer readIntFromConsole() {
        return new Scanner(System.in).nextInt();
    }
}
