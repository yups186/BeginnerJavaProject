public class DiscountedExpense extends Expense {

    //this double should store the discount that is provided on the item, as a percentage
    double discountPercent;

    public DiscountedExpense(String title, double amount, double discountPercent) {
        super(title, amount);
        this.discountPercent = discountPercent;
    }

    // this calculates the final amount after removing the discount from the discounted expense
      @Override
    public double getFinalAmount() {
        return amount * (1 - discountPercent / 100);
    }

    // this will provide all the information about the discounted expense now
    // I also try to round the final amount to 2 d.p here since thats the standard for money
     @Override
    public void showInfo(String currencySymbol) {
        System.out.println("Title: " + title);
        System.out.println("Original Amount: " + currencySymbol + amount);
        System.out.println("Discount: " + discountPercent );
        System.out.println("Final Amount: " + currencySymbol + String.format("%.2f", getFinalAmount()));
        System.out.println("Type: Discounted");
        System.out.println("---------------------");
    }
}
