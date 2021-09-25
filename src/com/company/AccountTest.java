package com.company;

// Fig. 3.9: AccountTest.java
// Inputting and outputting floating-point numbers with Account objects.
import java.util.Scanner;

public class AccountTest
{
    public static void main(String[] args)
    {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        // display initial balance of each object
        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance());

        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        System.out.print("Enter withdraw amount for account1: "); // prompt
        double withdrawAmount = input.nextDouble(); // obtain user input
        if(withdrawAmount> account1.getBalance() || withdrawAmount < 0.0) {
            System.out.println("Cannot substract,withdrawal amount exceeded account balance.");
        }
        else {
            System.out.printf("%nsubtracting %.2f from account1 balance%n%n",
                    withdrawAmount);
            account1.withdraw(withdrawAmount); // add to account1's balance
        }
        // display balances
        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance());

        System.out.print("Enter withdraw amount for account2: "); // prompt
        withdrawAmount = input.nextDouble(); // obtain user input
        if(withdrawAmount > account2.getBalance()) {
            System.out.println("Cannot substract,withdrawal amount exceeded account balance.");
        }
            else {
            System.out.printf("%nsubtracting %.2f from account2 balance%n%n",
                    withdrawAmount);
            account2.withdraw(withdrawAmount); // add to account2 balance
        }
        // display balances
        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance());
    } // end main
} // end class AccountTest

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
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

