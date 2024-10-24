public class ChequeAccount extends Account
{
    private double limitPerCheque=10000;
  public ChequeAccount( int theAccountNumber, int thePIN, 
      double theAvailableBalance, double theTotalBalance )
      {
          super(theAccountNumber,thePIN,theAvailableBalance,theTotalBalance);
          
      }
      public void setlimitPerCheque(double newlimitPerCheque)
      {
          limitPerCheque=newlimitPerCheque;
          
      }
      public double getInterest_rate()
      {
          return limitPerCheque;
      }
}
