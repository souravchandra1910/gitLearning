
import java.util.*;

public class Project_01 {

	static Scanner sc=new Scanner(System.in);
	public static void main(String []args) {
		System.out.println("Enter your name and id:");
		bankAccount obj =new bankAccount(sc.nextLine(),sc.nextLine());
	
		
		obj.show();
	}}

	 class bankAccount{
		float balance;
		float previousTransaction;
		String customerName;
		String customerId;
	
	bankAccount (String customerName,String customerId) {
		this.customerName =customerName;
		this.customerId =customerId;
	}
	 
	public void deposit(float amount) {
		if(amount!=0) {
		balance =balance + amount;
		previousTransaction = amount;
			
		}
		
	}
	public void withDraw(float amount) {
		if(amount!=0) {
			balance = balance - amount;
			previousTransaction = amount;
		}
	
	
}
	public void getPreviousTransaction() {
		if(previousTransaction > 0) {
			
			System.out.println("Deposit:"+ previousTransaction);
		}
			
		else if(previousTransaction < 0) {
			
		System.out.println("withDraw:"+ Math.abs(previousTransaction));
		}
		
		else {
			System.out.println("NO transaction occured");
		}
		
		
		
		
		
	}
	void show()
	{
		Scanner sc=new Scanner(System.in);
		char ch='\0';
		System.out.println("welcome: "+ customerName);
		System.out.println("your id is: "+ customerId);
		System.out.println("A. Balance ");
		System.out.println("B. Deposit");
		System.out.println("C. Withdrawal");
		System.out.println("D. Previous transaction");
		System.out.println("E. Exit");
		do {
			System.out.println("----------------------------------------------------");
			System.out.println("Enter an option");
			System.out.println("----------------------------------------------------");
			ch=sc.next().charAt(0);
			System.out.println("\n");
			System.out.println("\n");
			
			switch(ch) {
			
			case 'A':
				System.out.println("------------------------------------------------");
				System.out.println("balance = "+balance);
				System.out.println("------------------------------------------------");
				System.out.println("\n");
				break;
			
			case 'B':
			System.out.println("----------------------------------------------------");
			System.out.println("Enter an amount to deposit");
			System.out.println("----------------------------------------------------");
			float amount =sc.nextFloat();
			deposit(amount);
			System.out.println("\n");
			System.out.println("\n");
			break;
			  
			case'C':
				System.out.println("-------------------------------------------------");
				System.out.println("Enter the withdrawal amount");
				System.out.println("-------------------------------------------------");
				float amount2 =sc.nextFloat();
				withDraw(amount2);
				System.out.println("");
				
			break;
			
				
			case 'D':
				System.out.println("-------------------------------------------------");
				System.out.println("previousTransaction");
				getPreviousTransaction();
				System.out.println("-------------------------------------------------");
				System.out.println("\n");
			
				break;
				
			case 'E':	
				
				System.out.println("-------------------------------------------------");
				break;
				
				default:
					System.out.println("Invalid operation");
					break;
			}
			 
		}while(ch!='E');
		System.out.println("Thankyou for using our services");
	}
	}
	
	
	
	
	
	

	

