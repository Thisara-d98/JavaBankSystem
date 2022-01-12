package atm;
import java.util.*; 
public class Operations {
	
	public static Account CreateAccount() {
		Scanner sc=new Scanner(System.in);
		Account acc=new Account();
		System.out.println("Enter Owner name:");
		String name=sc.nextLine();
		acc.SetOwner(name);
		System.out.println("Enter nic:");
		String nic=sc.nextLine();
		acc.SetNIC(nic);
		System.out.println("Enter a password");
		String pass=sc.nextLine();
		System.out.println("Confirm a password");
		String pass2=sc.nextLine();
		System.out.println(pass+" "+pass2);
		if(pass==pass2) {
			
			acc.SetPassword(pass);
		}
		else {
			System.out.println("Password do not match:");
		}
		
		return acc;
	}
	
	public static void WithdrawMoney(Account acc) {
		Scanner myscan =new Scanner(System.in);
		
		System.out.println("Enter Withdraw amount:");
		int withdrawAmount=myscan.nextInt();
		int currentAmount=acc.Getbalance();
		if(withdrawAmount < currentAmount) {
			 currentAmount=currentAmount-withdrawAmount;
			 acc.Setbalance(currentAmount);
		}
		System.out.println("Current Account balance: "+currentAmount);
		
	}
	
	public static void DepositMoney(Account acc) {
		Scanner myscan =new Scanner(System.in);
		
		System.out.println("Enter Deposit amount:");
		int DepositAmount=myscan.nextInt();
		int currentAmount=acc.Getbalance();
		currentAmount=currentAmount+DepositAmount;
		acc.Setbalance(currentAmount);
		System.out.println("Current Account balance: "+currentAmount);
	}
	
	public static void ChangeOwnership(Account acc) {
		Scanner myscan =new Scanner(System.in);
		System.out.println("Enter  New Owner:");
		String newOwner=myscan.next();
		acc.SetOwner(newOwner);
		System.out.println(newOwner);
	}
	
	public static void FutureInterest(Account acc) {
		int balance=acc.Getbalance();
		int i=1;
		while(i<=12) {
			balance =balance*(105/100);
		}
		System.out.println("Balance after year is:"+balance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Banking\n");
		
		Scanner myscan=new Scanner(System.in);
		System.out.println("Enter 1 to create account\n");
		int s=myscan.nextInt();
		if(s==1) {
			Account myacc;
			myacc=CreateAccount();
			int select;
			do {
			System.out.println("Enter 1 to withdraw money:\n"
					+ "Enter 2 to Deposit money\n"
					+ "Enter 3 to Change ownership\n"
					+ "Enter 4 to Show Future Interests\n"
					+ "Enter 5 to Exit\n");
			  select=myscan.nextInt();
			
				switch(select){
				case 1:
					WithdrawMoney(myacc);
					break;
				case 2:
					DepositMoney(myacc);
					break;
				case 3:
					ChangeOwnership(myacc);
					break;
				case 4:
					FutureInterest(myacc);
					break;
				}
				
			}while(select!=5);
			
			
		}
	}
		

}
