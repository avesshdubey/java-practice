package basics;
import java.util.Scanner;

public class ResultAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks of subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks of subject 3: ");
        int m3 = sc.nextInt();

        // Step 1: Validate marks
        if (m1 < 0 || m1 > 100 || 
            m2 < 0 || m2 > 100 || 
            m3 < 0 || m3 > 100) {

            System.out.println("Invalid marks entered.");
        }

        else {

            // Step 2: Automatic fail condition
            if (m1 < 35 || m2 < 35 || m3 < 35) {
                System.out.println("Result: FAIL (One subject below 35)");
            }

            else {

                int avg = (m1 + m2 + m3) / 3;

                System.out.println("Average = " + avg);

                if (avg >= 90) {
                    System.out.println("Grade: TOPPER");
                }

                else if (avg >= 75) {
                    System.out.println("Grade: DISTINCTION");
                }

                else if (avg >= 40) {
                    System.out.println("Grade: PASS");
                }

                else {
                    System.out.println("Grade: FAIL");
                }
            }
        }

        sc.close();
    }
}
