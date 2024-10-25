
public class SavingAccount extends Account
{
    private double interest_rate=0.005;
    public SavingAccount( int theAccountNumber, int thePIN, 
      double theAvailableBalance, double theTotalBalance )
      {
          super(theAccountNumber,thePIN,theAvailableBalance,theTotalBalance);
      }
      public void setInterest_rate(double newInterest_rate)
      {
          this.interest_rate = interest_rate;
          
      }
      public double getInterest_rate()
      {
          return interest_rate;
      }
    
  

    
}
