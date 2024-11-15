import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int[] loan = new int[5];
        for (int i = 0; i < loan.length; i++) {  // Change condition to i < loan.length
            System.out.println("Enter the loan " + (i + 1));  // Use parentheses around (i + 1)
            loan[i] = scanner.nextInt();
            // Consume the leftover newline
            scanner.nextLine();

        }

        String name;
        double loan_amount;
        int loan_number;
        int term;
        String loan_type = "";

        for (int i = 0; i < 1; i++) {  // You can adjust the loop for more entries

            System.out.println("Enter the loan type:");
            loan_type = scanner.nextLine();

            System.out.println("Enter the name:");
            name = scanner.nextLine();

            System.out.println("Enter the loan amount:");
            loan_amount = scanner.nextDouble();

            // Consume the leftover newline
            scanner.nextLine();

            System.out.println("Enter the loan number:");
            loan_number = scanner.nextInt();

            // Consume the leftover newline
            scanner.nextLine();

            System.out.println("Enter the loan term:");
            term = scanner.nextInt();

            // Consume the leftover newline
            scanner.nextLine();
        }
        int i=0;



    }
}
