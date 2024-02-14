package dualInterface;

public class NetAmount implements Interface1, Interface2 {
	public int price(int price) {
		return price;
	}
	public int tax(int tax, int price) {
		return (price*tax)/100+price;
	}
}
