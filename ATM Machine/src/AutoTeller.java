import java.util.Scanner;
public class AutoTeller {

	public static void main(String[] args) {
		int choice, pin;
		String insertCard="\0";
		Scanner t = new Scanner(System.in);
		System.out.print("Insert You Card:");
		insertCard = t.nextLine();
		System.out.print("Enter Your PIN:");
		pin = t.nextInt();
		Options wd = new Options();
		Options p = new Options();
		Options bal = new Options();
		System.out.println("1.WithDrawl	2.Balance Enquiry  3.Change Pin 4.Exit");
		choice = t.nextInt();
		switch (choice) {
		case 1: wd.withDrawl();break;
		case 2: bal.balanceEnquiry();break;
		case 3: p.pin();break;
		case 4: System.exit(0);
		default: System.out.println("Choose The Correct One!");break;
		}
	}
}