package mandatory;

public class UseHomeTheatre {
	public static void main (String[]args) {
		HTRemote ht = new HTRemote();
		System.out.println("Battery Life in year: "+ht.batteryLife(1)+", "+"Distance in feet: "+ht.findDistance(5));
		System.out.println(ht.onOffButton());
		System.out.println("HTRemote Price: "+ht.price(350));
	}
}
