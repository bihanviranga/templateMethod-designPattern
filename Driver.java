/*
	Driver code. Makes 2 orders from WebOrder and MobileOrder classes.
*/
public class Driver {
	public static void main(String[] args) {
		WebOrder webOrder = new WebOrder();
		webOrder.placeOrder();

		System.out.println();

		MobileOrder mobileOrder = new MobileOrder();
		mobileOrder.placeOrder();
	}
}
