// CashDispenser.java
// Represents the cash dispenser of the ATM

public class CashDispenser 
{
   // the default initial number of bills in the cash dispenser
   private final static int INITIAL_COUNT = 50;
   private int hkd100Count; // number of HKD100 bills remaining
   private int hkd500Count; // number of HKD 500 bills remaining
   private int hkd1000Count; // number of HKD 1000 bills remaining
   
   // no-argument CashDispenser constructor initializes count to default
   public CashDispenser()
   {
      hkd100Count = INITIAL_COUNT; // set hKD100 attribute to default
      hkd500Count = INITIAL_COUNT; // set hKD500 attribute to default
      hkd1000Count = INITIAL_COUNT; // set hKD1000 attribute to default
   } // end CashDispenser constructor

   // simulates dispensing of specified amount of cash
   public void dispenseCash( int amount )
   {
        int[] billsRequired = billRequired(amount); //{hkd1000Required, hkd500Required, hkd100Required}
      
      hkd1000Count -= billsRequired[0]; //update the bills count
      hkd500Count -= billsRequired[1]; //update the bills count
      hkd100Count -= billsRequired[2]; //update the bills count
   } // end method dispenseCash

   // indicates whether cash dispenser can dispense desired amount
   public boolean isSufficientCashAvailable( int amount )
   {
         int[] billsRequired = billRequired(amount); //{hkd1000Required, hkd500Required, hkd100Required}
      
      
      if ( billsRequired[0] < hkd1000Count || billsRequired[1] < hkd500Count || billsRequired[2] < hkd100Count )
         return true; // enough bills available
      else 
         return false; // not enough bills available
   } // end method isSufficientCashAvailable
   
   public int[] billRequired(int amount)
    {
      int hkd1000Required = amount / 1000; // number of HKD1000 required
      int hkd500Required = 0; // number of HKD500 required
      int hkd100Required = 0; // number of HKD100 required
      
      int[] billsRequired = new int[3]; //array for passing data
      

    
     if(amount % 500 != 0){
        hkd100Required = (amount % 500) / 100 ;
    }
    
         if (amount % 1000 != 0){
      hkd500Required = (amount % 1000) / 500 ;
    } 
    
    
        billsRequired[0] = hkd1000Required;
        billsRequired[1] = hkd500Required;
        billsRequired[2] = hkd100Required;
        
        return billsRequired;
    }
} // end class CashDispenser



/**************************************************************************
 * (C) Copyright 1992-2007 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/