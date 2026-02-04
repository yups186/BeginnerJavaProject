// one thing I have to mention, for options 1. and 2., for some reason it is requiring a double input, so you have to input the number twice for it to work,
// I genuinely couldn't find any way to fix this at all, so I apologise for that.

    // I import the Scanner class to collect user input
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            // I create a Scanner object
        Scanner scanner = new Scanner(System.in);

            // I used a boolean to determine if the user chooses option number 6 - if they do, I set the boolean to true which then ends the program
        boolean hasExited = false;

         // I created objects for the Expenses and Menu classes
        Expenses expenses = new Expenses();
        Menu menu = new Menu();

         // every choice is encompassed in a while loop that utilises switch cases for each choice -
        // the way to break out of the loop is if you choose any option from "0 - 6",
        // if a number between "0 - 6" is not chosen, the while loop restarts and gives a message
        // to enter a number only from "0 - 6";
        while (true) {

            menu.menuOptions();

            //  these where last minute fixes to ensure what happens if the user doesnt enter an integer
            if (scanner.hasNextInt()) {
                int userOption = scanner.nextInt();
                //
                scanner.nextLine();

                switch (userOption) {

                    case 0:
                        expenses.currency();
                        break;

                    case 1:
                        expenses.addExpense();
                        break;

                    case 2:
                        expenses.addDiscountedExpense();
                        break;

                    case 3:
                        expenses.viewExpenses();
                         break;

                    case 4:
                        expenses.totalSpending();
                        break;

                    case 5:
                        expenses.highestExpense();
                        break;

                    case 6:
                         System.out.println("Thank you for using Student Expense Manager.");
                        hasExited = true;
                        break;

                    default:
                        System.out.println("Please select a valid option (0-6).");
                        System.out.println(" ");
                        break;
                }
            } else {
                System.out.println("Invalid input. Please enter a number (0-6).");
                scanner.nextLine(); // Consumes the bad input to prevent an infinite loop
            }

            if (hasExited) {
                  break;
            }
        }
             // I have heard it is good practice to close the scanner at the end
        scanner.close();
    }
}
