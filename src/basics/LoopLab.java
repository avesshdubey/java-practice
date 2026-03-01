package basics;
import java.util.Scanner;

public class LoopLab {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {

            System.out.print("How many numbers do you want to enter? ");
            int n = sc.nextInt();

            // WHILE LOOP → Validation
            while (n <= 0) {
                System.out.println("Invalid count. Enter positive number.");
                n = sc.nextInt();
            }

            int sum = 0;
            int evenCount = 0;
            int oddCount = 0;

            // FOR LOOP → Controlled iteration
            for (int i = 1; i <= n; i++) {

                System.out.print("Enter number " + i + ": ");
                int num = sc.nextInt();

                if (num == 0) {
                    System.out.println("Zero entered. Stopping early.");
                    break;   // exits for loop
                }

                sum += num;

                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }

                // CONTINUE example
                if (num < 0) {
                    System.out.println("Negative number detected.");
                    continue;
                }
            }

            // Avoid division by zero
            if (sum != 0) {
                double avg = sum / (double) n;
                System.out.println("Sum = " + sum);
                System.out.println("Average = " + avg);
            }

            System.out.println("Even Count = " + evenCount);
            System.out.println("Odd Count = " + oddCount);

            System.out.print("Do you want to repeat? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        sc.close();
    }
}