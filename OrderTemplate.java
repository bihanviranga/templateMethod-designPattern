public abstract class OrderTemplate {
	// These abstract methods must be implemented by a subclass.
	public abstract void processOrder();
	public abstract void makePayment();
	public abstract void sendNotification();

	// This is the template method. It cannot be changed by subclasses.
	public final void placeOrder() {
		System.out.println("***** Start order *****");
		processOrder();
		makePayment();
		sendNotification();
		System.out.println("***** Finish order *****");
	}
}
