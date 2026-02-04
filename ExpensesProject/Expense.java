
public class Expense {

    // these store the title and the original amount of the expens
    String title;
    double amount;

    // this constructor saves the title and amount into the object
    public Expense(String title, double amount) {
        this.title = title;
        this.amount = amount;
    }

    // this shouldreturn the amount as it is, since normal expenses have no discount
    public double getFinalAmount() {
        return amount;
    }

    // so this method here provides all the information about the expense
    public void showInfo(String currencySymbol) {
        System.out.println("Title: " + title);
        System.out.println("Original Amount: " + currencySymbol + amount);
        System.out.println("Final Amount: " + currencySymbol + getFinalAmount());
        System.out.println("Type: Normal");
        System.out.println("---------------------");
    }
}
