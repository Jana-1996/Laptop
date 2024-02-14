package interface1stDay;

public class UseCar {
	public static void main (String[]args) {
		
		Car c = new Car();
		c.model = "TATA";
		c.price = 4500000;
		c.colour = "Black";
		System.out.println(c.findNetPrice(15));
		System.out.println(c.findMilage(70)+"\n"+c.colour+"\n"+c.model+"\n"+c.price);
		
		Vehicle v = new Car();
		System.out.println(v.findMilage(5));
		System.out.println(v.findNetPrice(10));
		
	}

}
