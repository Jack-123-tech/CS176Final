
public class Mortorcycle extends Vehicle {
	private boolean hasWindshield;
	public Mortorcycle(int topSpeed, int seats,boolean hasWindshield) {
		super(topSpeed, seats);
		this.hasWindshield=hasWindshield;
		// TODO Auto-generated constructor stub
	}

	

	public boolean isHasWindshield() {
		return hasWindshield;
	}

	public void setHasWindshield(boolean hasWindshield) {
		this.hasWindshield = hasWindshield;
		
	}
	public String toString() {
		return super.toString()+"Has WindShield: "+hasWindshield;
	
	}
	
}
