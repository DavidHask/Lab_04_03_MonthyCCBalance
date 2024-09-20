public class Main {
    public static void main(String[] args) {
        double balance = 5000;
        double INTEREST_RATE = 0.17;
        double interest = 0;
        double totalInterest = 0;

        interest = balance * INTEREST_RATE;
        balance = balance + interest;
        totalInterest = totalInterest + interest;

        System.out.println("After one month, the new balance is " + balance +
                ", with the interest payment being " + interest);

        interest = balance * INTEREST_RATE;
        balance = balance + interest;
        totalInterest = totalInterest + interest;

        System.out.println("After two months, the new balance is " + balance +
                ", with the interest payment being " + interest +
                ", and the total income is " + totalInterest);

    }
}