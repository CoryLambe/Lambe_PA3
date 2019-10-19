class SavingsAccount {

    static private double annualInterestRate;
    private double savingBalance;

    public SavingsAccount()
    {
        this.savingBalance = 0;
    }
    public SavingsAccount(double savingBalance)
    {
        this.savingBalance=savingBalance;
    }
    public double getSavingBalance()
    {
        return this.savingBalance;
    }
    public double[] getMonthsSavingBalance(int total_months)
    {
        double[] monthlyInterestmonth=new double[total_months];
        double monthlyInterest;
        for(int i = 0; i < total_months; i++)
        {
            monthlyInterest= (double)(this.savingBalance*annualInterestRate/12);
            this.savingBalance += monthlyInterest;
            monthlyInterestmonth[i] = this.savingBalance;
        }
        return monthlyInterestmonth;
    }
    public static void modifyInterestRate(double newInterestRate)
    {
        annualInterestRate=newInterestRate;
    }
    public void calculateMonthlyInterest()
    {
        double monthlyI;
        monthlyI= (double)(this.savingBalance*annualInterestRate/12);
        this.savingBalance+=monthlyI;
    }
}
