package dualInterface;

public class UseDharshan {
	public static void main(String[] args) {
		Dharshan d = new Dharshan(26, 2);
//		System.out.println(d.qual("B.Sc"));
//		System.out.println(d.subject("Mathematics"));
//		System.out.println(d.salary(28000));
//		System.out.println(d.age + " " + d.exp);
	
	System.out.println(d.qual("B.sc")+" "+d.subject("Maths")+" "+d.salary(24000)+" "+d.age+" "+d.exp);
	
	}

}
