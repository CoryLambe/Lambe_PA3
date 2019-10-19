public class TestSavingAccount {

    public TestSavingAccount() {
    }
    public static void main(String[] args)
    {
        SavingsAccount saver1,saver2;
        saver1 = new SavingsAccount (2000.0);
        saver2 = new SavingsAccount (3000.0);
        int total = 0;
        SavingsAccount.modifyInterestRate (0.04);
        int total_month = 12;
        double[] balance_month=saver1.getMonthsSavingBalance(total_month);

        for(int i = 0; i < total_month; i++)
        {
            System.out.println("\n Month " + (i + 1) + ":\n Saver 1 has a balance of : " + balance_month[i] + " (Interest rate of .04)" );
        }

        balance_month=saver2.getMonthsSavingBalance(12);
        for(int i = 0; i < 12; i++)
        {
            System.out.println("\n Month " + (i + 1) + ":\n Saver 2 has a balance of = " + balance_month[i]+" (Interest rate of .04)" );
        }

        SavingsAccount.modifyInterestRate(0.05);
        balance_month=saver1.getMonthsSavingBalance(12);

            System.out.print(" ");
            System.out.print("\n Month 13:\n Saver 1 final balance= " + balance_month[1] + " (Interest rate of .05)" );
            System.out.print("\t\t");

            balance_month=saver2.getMonthsSavingBalance(12);

            System.out.print("Saver 2 final balance= " + balance_month[1]+" (Interest rate of .05)" );

    }
}