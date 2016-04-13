import java.util.Scanner;

import static java.lang.Integer.*;

/**
 * Created by stasgordienko on 12.04.16.
 * the Main class
 */
public class Calculate {
    public static void main(String[] args){
        System.out.println("Calculating...");
        Integer result;

        try {
            for(String arg : args){
                result += valueOf(arg);
            }
        }
        catch (Exception e){
            result = null;
        }
        finally {
            if (result != null) System.out.println(result)
                else System.out.println("Error in arguments...")
        }

        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        String next = "";
        while ((sc.hasNext() && !next.equals("q"))) {
                next = sc.next();
                System.out.print(next);

        }

    }
}
