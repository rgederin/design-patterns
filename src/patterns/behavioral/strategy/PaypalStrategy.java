package patterns.behavioral.strategy;

/**
 * Implementation of PaymentStrategy based on Paypal system
 * 
 * @author rgederin
 * 
 */
public class PaypalStrategy implements PaymentStrategy {
	private String emailId;
	private String password;

	public PaypalStrategy(String email, String pwd) {
		this.emailId = email;
		this.password = pwd;
	}

	@Override
	public String pay(int amount) {
		//System.out.println(amount + " paid using Paypal");
		return amount + " paid using Paypal";
	}
}
