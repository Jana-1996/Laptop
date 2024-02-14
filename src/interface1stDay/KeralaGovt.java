package interface1stDay;

public class KeralaGovt implements CentralGovt {
	
	String font;
	int tollFees;
	
	public KeralaGovt(String font, int tollFees) {
		this.font = font;
		this.tollFees = tollFees;
	}
	
	public String stateCode(String stateCode) {
		return stateCode;
	}
	public int rtoCode(int rtoCode) {
		return rtoCode;
	}
	public String serialCode(String serialCode) {
		return serialCode;
	}
}
