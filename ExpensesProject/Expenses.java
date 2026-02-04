// I import the Scanner class here to collect user input for their expenses
import java.util.Scanner;

public class Expenses {

    // I create a Scanner object
    Scanner scanner = new Scanner(System.in);

    // I thought making an array with 11 indexes would be a good way to store all the expenses
    Expense[] expenseList = new Expense[10];
    int index = 0;

    // I added an extra feature to choose your desired currency, as when dealing with money,
    // there should generally always be a currency indicated. It chooses between USD or GBP
    String currencySymbol = "£";

    public void currency() {
        while (true) {
            System.out.println("Please choose your preferred currency: (1-2)");
            System.out.println("1. $");
            System.out.println("2. £");

            int choice = scanner.nextInt();
            scanner.nextLine(); // fix leftover newline

            if (choice == 1) {
                currencySymbol = "$";
                System.out.println("You selected $");
                break;
            } else if (choice == 2) {
                currencySymbol = "£";
                System.out.println("You selected £");
                break;
            } else {
                System.out.println("Please select either 1 or 2");
                System.out.println(" ");
            }
        }
    }

    // Here, if the user tries to add more expenses than the length of the array,
    // it prints out you cannot add any more expenses
    public void addExpense() {
        if (index >= 10) {
            System.out.println("You cannot add more expenses.");
            return;
        }

        scanner.nextLine();

        System.out.println("Please enter an Expense title:");
            String title = scanner.nextLine();

        System.out.println("Please enter an Expense amount (" + currencySymbol + "):");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        expenseList[index] = new Expense(title, amount);
        index++;

        System.out.println("Expense added!");
        System.out.println(" ");
    }

    public void addDiscountedExpense() {
        if (index >= 10) {
            System.out.println("You cannot add more expenses.");
            return;
        }

        scanner.nextLine();
         System.out.println("Enter discounted expense title:");
        String title = scanner.nextLine();

        System.out.println("Enter original amount:");
        double amount = scanner.nextDouble();
              scanner.nextLine();

        System.out.println("Enter discount percent (e.g. 20%):");
        double discountPercent = scanner.nextDouble();
                 scanner.nextLine();

        expenseList[index] = new DiscountedExpense(title, amount, discountPercent);
        index++;

        System.out.println("Discounted expense added!");
        System.out.println(" ");
    }

    // if the user tries to view all expenses when there is nothing in the array,
    // it will print out, "no expenses recorded yet"
    public void viewExpenses() {
        if (index == 0) {
            System.out.println("No expenses recorded yet.");
            return;
        }

        System.out.println("---- All Expenses ----");

        for (int i = 0; i < index; i++) {
            expenseList[i].showInfo(currencySymbol);
        }
    }

    // same here with total spending, if there is nothing there, it will print out
    // "no expenses recorded yet"
     public void totalSpending() {
        if (index == 0) {
            System.out.println("No expenses recorded yet.");
            return;
        }

        double total = 0;

        for (int i = 0; i < index; i++) {
            total += expenseList[i].getFinalAmount();
        }
        // I also tried to format the money spent to have 2 decimal places, like real world currency
        System.out.println("Total Spending: " + currencySymbol + String.format("%.2f", total));
        System.out.println(" ");
    }

    // and the same here with hig hest expense
    public void highestExpense() {
        if (index == 0) {
            System.out.println("No expenses recorded yet.");
            return;
        }

        int highestIndex = 0;
        double highestAmount = expenseList[0].getFinalAmount();

        for (int i = 1; i < index; i++) {
                if (expenseList[i].getFinalAmount() > highestAmount) {
                    highestAmount = expenseList[i].getFinalAmount();
                 highestIndex = i;
            }
        }

        System.out.println("Highest Expense:");
          expenseList[highestIndex].showInfo(currencySymbol);
    }
}
