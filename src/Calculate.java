import static java.lang.Integer.*;

/**
 * Created by stasgordienko on 12.04.16.
 * the Main class
 */
public class Calculate {
    public static void main(String[] args){
        System.out.println("Calculating...");
        int first, second;

        try {
            first = valueOf(args[0]);
            second = valueOf(args[1]);
        }
        catch (Exception e){
            first = 0;
            second = 0;
        }
        finally {
            //TODO: ...
        }

        int sum = first + second;
        System.out.println(sum);
    }
}
