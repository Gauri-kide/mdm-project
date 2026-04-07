public class EvenOddCheckerTest {

    public static void main(String[] args) {
        EvenOddChecker checker = new EvenOddChecker();

        System.out.println(checker.check(4)); // Expected: Even
        System.out.println(checker.check(7)); // Expected: Odd
        System.out.println(checker.check(0)); // Expected: Even
        System.out.println(checker.check(-3)); // Expected: Odd
    }
}
