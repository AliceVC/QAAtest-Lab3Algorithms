/**
 * @author flo
 * @since 22/11/2016.
 */
public class Lab3Alg6 {
    public static void main(String[] args) {
        int f = Integer.valueOf(ReadUtils.readValueFromConsole());

        double c = 5.0/9 * (f - 32);

        System.out.println(f + " in celsius " + c);

    }
}
