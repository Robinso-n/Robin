package structs;

import java.util.Scanner;

//import java.util.Scanner;
class Atm {
  private double balance;
  public Atm(double initialBalance) {
      balance = initialBalance;
  }
  public void getBalance()
  {
  	System.out.println("The balance is\t"+balance);
  }
  public void Setdeposit(double amount)
  {
  	balance+=amount;
  	getBalance();
  }  
  public void setWithdraw(double amount) {
      if (amount <= balance) {
          balance -= amount;
          getBalance();
      } else {
          System.out.println("Insufficient balance for withdrawal.");
      }
  }


	public static void main(String[] args) {
		// Create an ATM object with an initial balance of $1000
		Atm atm = new Atm(1000.0);
		Scanner scanner = new Scanner(System.in);
      boolean isRunning = true;
      while (isRunning) {
          System.out.println("\nATM Menu:");
          System.out.println("1. Check Balance");
          System.out.println("2. Make a Deposit");
          System.out.println("3. Make a Withdrawal");
          System.out.println("4. Exit");
          System.out.print("Enter your choice (1-4): ");
          int choice = scanner.nextInt();

          switch (choice) {
              case 1:
                  atm.getBalance();
                  break;
              case 2:
                  System.out.print("Enter the deposit amount: $");
                  double depositAmount = scanner.nextDouble();
                  atm.Setdeposit(depositAmount);
                  break;
              case 3:
                  System.out.print("Enter the withdrawal amount: $");
                  double withdrawalAmount = scanner.nextDouble();
                  atm.setWithdraw(withdrawalAmount);
                  break;
              case 4:
                  isRunning = false;
                  System.out.println("Thank you for using the ATM.");
                  break;
              default:
                  System.out.println("Invalid choice. Please select 1-4.");
          }
      }

      scanner.close();
	}
}