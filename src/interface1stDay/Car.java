package interface1stDay;

public class Car implements Vehicle {
	
	int price;
	String model;
	String colour;
	
	public int findNetPrice(int taxPercentage) {
		return (price*taxPercentage)/100+price;
	}
	public int findMilage(int speed) {
		if(speed >= 0 && speed <=60) {
			return 25;
		}
		else if(speed > 60 && speed <= 100) {
			return 20;
		}
		else {
			return 10;
		}
	}

}
