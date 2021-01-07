/*
	An implementation of OrderTemplate for web orders.
*/
public class WebOrder extends OrderTemplate {
	public void processOrder() {
		System.out.println("Processing order.");
	}

	public void makePayment() {
		System.out.println("Making payment via web.");
	}

	public void sendNotification() {
		System.out.println("Sending email notification.");
	}
}
