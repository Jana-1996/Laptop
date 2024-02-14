package dualInterface;

public class UseNetAmountamout {
	public static void main (String[]args) {
		NetAmount na = new NetAmount();
		System.out.println(na.price(5000));
		System.out.println(na.tax(10, 5000));
	
	}

}
