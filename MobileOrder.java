/*
	An implementation of OrderTemplate for mobile orders.
*/
public class MobileOrder extends OrderTemplate {
	public void processOrder() {
		System.out.println("Processing order.");
	}

	public void makePayment() {
		System.out.println("Making payment via mobile.");
	}

	public void sendNotification() {
		System.out.println("Sending mobile notification.");
	}
}
