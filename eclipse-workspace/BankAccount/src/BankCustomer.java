import java.util.ArrayList;

public class BankCustomer {
	Long accountNumber;
	int sortCode;
	String customerName;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	String customerEmail;
	String customerDateOfBirth;
	String customerAddress;
	double balance;
	ArrayList<Transactions> customerTransactions;

	public double getBalance() {
		return balance;
	}

	public ArrayList<Transactions> getCustomerTransactions() {
		return customerTransactions;
	}

	public void setCustomerTransactions(ArrayList<Transactions> customerTransactions) {
		this.customerTransactions = customerTransactions;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long long1) {
		this.accountNumber = long1;
	}

	public int getSortCode() {
		return sortCode;
	}

	public void setSortCode(int sortCode) {
		this.sortCode = sortCode;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerDateOfBirth() {
		return customerDateOfBirth;
	}

	public void setCustomerDateOfBirth(String customerDateOfBirth) {
		this.customerDateOfBirth = customerDateOfBirth;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public BankCustomer() {
		setAccountNumber(accountNumber);
		setSortCode(sortCode);
		setBalance(balance);
		set
	}

	@Override
	public String toString() {
		return "BankCustomer [accountNumber=" + accountNumber + ", sortCode=" + sortCode + ", customerName="
				+ customerName + ", customerEmail=" + customerEmail + ", customerDateOfBirth=" + customerDateOfBirth
				+ ", customerAddress=" + customerAddress + ", balance=" + balance + ", customerTransactions="
				+ customerTransactions + "]";
	}

}
