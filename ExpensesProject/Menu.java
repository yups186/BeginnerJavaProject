    // I also import the Scanner class to collect user input for the menu
import java.util.Scanner;

public class Menu {

        Scanner scanner = new Scanner(System.in);

    // each menu option is printed on a new line to make it clean
    // I added an extra option to choose currency, as I thought it would be befitting
    // In total there are 7 options
    public void menuOptions() {

        System.out.println("---- Welcome to the Student Expense Manager ----");
        System.out.println("0. Select Currency");
        System.out.println("1. Add Expense");
        System.out.println("2. Add Discounted Expense");
        System.out.println("3. View All Expenses");
        System.out.println("4. Show Total Spending");
        System.out.println("5. Show Highest Expense");
        System.out.println("6. Exit");
        System.out.println("Please enter your choice (0-6):");
    }

    // this method allows the user to return back to the menu
    public String returnToMenu() {
        scanner.nextLine(); // consume leftover newline
            System.out.println("Do you want to return to the Main Menu? YES/NO");
        String answer = scanner.nextLine();
         return answer;
    }
}
