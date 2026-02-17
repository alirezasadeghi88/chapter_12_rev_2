package homework1;

import java.util.Scanner;

public class QuotientWithIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number2 != 0)
            System.out.println(number1 + " / " + number2 +
                    " is " + (number1 / number2));
        else
            System.out.println("Divisor cannot be zero ");
    }
}
