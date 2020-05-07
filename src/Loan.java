
public class Loan {

	//Loan Class

	private double loanAmount;
	private double years;
	private double annualInterest;
	private double monthlyPayment;

	public Loan(){
	annualInterest = .50;
	}

	public double getLoanAmount(){
	return loanAmount;
	}

	public void setLoanAmount(double loanAmount){
	this.loanAmount = loanAmount;
	}

	public double getYears(){
	return years;
	}

	public void setYear(double years){
	this.years = years;
	}

	public double getAnnualInterest(){
	return annualInterest;
	}

	public void setAnnualInterest(double annualInterest){
	this.annualInterest = annualInterest;}

	public double monthlyPayment(double monthlyInterest){
	monthlyInterest = (annualInterest /12);
	monthlyPayment = loanAmount * monthlyInterest / (1-(Math.pow(1/(1+ monthlyInterest), years * 12)));
	return monthlyPayment;
	}

	public double totalPayment(double totalPayment){
	totalPayment = monthlyPayment* 12 * years;
	return totalPayment;
	}

}
