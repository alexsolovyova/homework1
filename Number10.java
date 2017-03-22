
import static java.lang.Math.*;
import java.util.Scanner;
 
public class Number10 {
    public static void main(String[] args) throws java.io.IOException {
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        
        int sum = max(max(a, b), c) + min(min(a, b), c);
        System.out.println(sum);
    }
}
