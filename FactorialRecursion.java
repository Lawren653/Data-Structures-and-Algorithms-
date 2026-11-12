import java.util.Scanner;

public class FactorialRecursion {
    public static long factorial(int n) {
        
        if (n == 0 || n == 1) {
            return 1;
        }

        
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a non-negative integer (0 to 20): ");
        int number = input.nextInt();

        if (number < 0 || number > 20) {
            System.out.println("Please enter a number between 0 and 20.");
        } else {
            System.out.println(number + "! = " + factorial(number));
        }

        input.close();
    }
}
