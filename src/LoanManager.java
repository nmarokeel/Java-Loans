import java.util.ArrayList;
import java.util.Scanner;

public class LoanManager {

	public static void main(String[] args) {
		double loanAmount = 0.0;
		double years = 0.0;
		
		ArrayList<LoanManager> loanList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		Loan tmpLoan = new Loan();
		System.out.print("Enter Loan Amount: ");
		tmpLoan.setLoanAmount(Double.parseDouble(scanner.nextLine()));
		
		System.out.print("Enter amount of years: ");
		tmpLoan.setYear(Double.parseDouble(scanner.nextLine()));
	
		
	}

}
