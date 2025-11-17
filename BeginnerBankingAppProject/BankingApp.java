import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double amount = 1034.32;






    while (true) {

        System.out.println("*****************\nMACY BANKING CORP\n*****************");

        System.out.println("1. Show Balance\n2. Deposit\n3. Withdraw\n4. Exit");

        System.out.println("*****************\nEnter your choice (1-4)");

         if (!(scanner.hasNextInt())) {System.out.println("Please enter a valid number");
            scanner.next();
            continue;
        }

         else {

        int selection = scanner.nextInt();

        if (selection == 1) {
            System.out.println(Balance(amount));

        }

        else if (selection == 2) {
            amount = Deposit(amount, scanner);
            System.out.println("Your new total is $" + amount);

        }

        else if (selection == 3) {
            amount = Withdraw(amount, scanner);
            System.out.println("Your new total is $" + amount);

        }
        else if (selection == 4) {
            Exit();
            scanner.close();
            break;
        }

        else {
            System.out.println("Please enter a valid number");
            continue;
             }
        }
    }


    }

    static double Balance(double amount) {

        return amount;
    }

    static double Deposit(double amount, Scanner scanner) {


        System.out.println("How much would you like to deposit?");

        double deposit = scanner.nextDouble();

        return amount + deposit;

    }

    static double Withdraw(double amount, Scanner scanner) {



        System.out.println("How much would you like to withdraw?");

        double withdraw = scanner.nextDouble();


        if (withdraw > amount) {
            System.out.println("You do not have enough money");

            return 0;

        } else {
            return amount - withdraw;

        }


    }

    static void Exit() {

        System.out.println("Goodbye, see you later!");

    }

}

