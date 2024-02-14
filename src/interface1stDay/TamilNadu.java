package interface1stDay;

public class TamilNadu implements CentralGovt {
	
	String font;
	int tollFees;
	
	public TamilNadu(String font, int tollFees) {
		this.font = font;
		this.tollFees = tollFees;
	}
	/*public void font(String font) {
		this.font = font;
	}
	public String font() {
		return font;
	}*/
	public String stateCode(String stateCode) {
		return "State Code: "+stateCode;
	}
	public int rtoCode(int rtoCode) {
		return rtoCode;
	}
	public String serialCode(String serialCode) {
		return "Serial Code: "+serialCode;
	}
	public String toString() {
		return font+" "+tollFees;
	}
}
