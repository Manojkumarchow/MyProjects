import java.util.Scanner;
public class Options {
	public int availBalance=5000, amountNeeded=0, pin, newpin1, newpin2;
	Scanner m = new Scanner(System.in);
	void options() {
}
	void withDrawl() {
		System.out.print("Enter the Amount:");
		amountNeeded = m.nextInt();
		if(amountNeeded <= availBalance) {
			System.out.println("Please Take your amount");
			System.out.println("Your Remaining Amount is:"+(availBalance-amountNeeded));
		}
		else
			System.out.println("Entered Amount is not available in Your account!");
	}
	void balanceEnquiry() {
		System.out.println("Available Balance is:"+(availBalance-amountNeeded));
	}
	void pin() {
		System.out.print("Enter Your Old PIN:");
		pin = m.nextInt();
		System.out.println();
		System.out.print("Enter Your new PIN:");
		newpin1 = m.nextInt();
		System.out.println();
		System.out.println("Confirm your pin:");
		newpin2 = m.nextInt();
		if(newpin1 == newpin2)
			System.out.println("Your PIN has changed Successfully!");
		else
			System.out.println("Two pins not matched");
	}
}