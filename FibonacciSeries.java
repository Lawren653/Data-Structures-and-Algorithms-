public class FibonacciSeries {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;

        System.out.println("First 10 Fibonacci numbers:");

        for (int i = 1; i <= 10; i++) {
            System.out.print(first);

            if (i < 10) {
                System.out.print(" ");
            }

            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }
}
