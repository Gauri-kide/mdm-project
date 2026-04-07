import java.util.*;

public class EvenOddChecker {

    public String check(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        EvenOddChecker obj = new EvenOddChecker();
        System.out.println(obj.check(num));
    }
}
