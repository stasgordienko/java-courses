import static java.lang.Integer.*;

/**
 * Created by stasgordienko on 12.04.16.
 * the Main class
 */
public class Calculate {
    public static void main(String[] args){
        System.out.println("Calculating...");
        int first = valueOf(args[0]);
        int second = valueOf(args[1]);
        int sum = first + second;
        System.out.println(sum);
    }
}
