/**
 * @author flo
 * @since 22/11/2016.
 */
public class Lab3Alg2 {
    public static void main(String[] args) {
        int a = Integer.valueOf(ReadUtils.readValueFromConsole());
        int b = Integer.valueOf(ReadUtils.readValueFromConsole());

        int sum = b;
        for(int i = 0; i < a; i++ ) {
            sum = sum + 1;
        }
        System.out.println(a + " + " + b + " = " + sum);
    }
}
