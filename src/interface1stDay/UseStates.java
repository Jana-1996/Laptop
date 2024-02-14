package interface1stDay;

public class UseStates {
	public static void main(String[] args) {
		TamilNadu tn = new TamilNadu("caligraphy", 150);
//		System.out.println(tn.stateCode("TN"));
//		System.out.println(tn.rtoCode(25));
//		System.out.println(tn.serialCode("JK 3373"));
//		System.out.println(tn.tollFees);
//		System.out.println(tn.font);
		
		System.out.println("Font Style: "+tn.font+" "+"Toll Fees: "+tn.tollFees+" "+tn.stateCode("TN")+" "+"RTO Code: "+tn.rtoCode(25)+
				           " Serial Code: "+tn.serialCode("RJ 3733"));

		KeralaGovt kg = new KeralaGovt("Roman", 250);
//		System.out.println(kg.stateCode("KL"));
//		System.out.println(kg.rtoCode(99));
//		System.out.println(kg.serialCode("k 9999"));
//		System.out.println(kg.font + " " + kg.tollFees);
	}

}
