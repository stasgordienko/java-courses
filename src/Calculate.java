import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

import static java.lang.Integer.*;

/**
 * Created by stasgordienko on 12.04.16.
 * the Main class
 */
public class Calculate {
    public static void main(String[] args){
        System.out.println("Calculating...");
        Double result = 0D;

        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        Double num = 0D;
        int countArgs = 0;

        for(String next : args){
            try {
                num = Double.valueOf(next);
            }
            catch (Exception e){
                num = null;
            }
            finally {
                if (num != null) {
                    result += num;
                    countArgs++;
                }
            }
        }

        System.out.println(countArgs + " arguments, sum=" + result);

        String next = "";
        do {
                if (sc.hasNext()) next = sc.next();
                System.out.print(next);

        } while (!next.equals("q"));
        sc.close();

    }
}
