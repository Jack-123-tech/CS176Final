
public class Car extends Vehicle{
	private String driveTrain;
	private int doors;
	public Car(int topSpeed, int seats,String driveTrain, int doors) {
		super(topSpeed, seats);
		this.driveTrain=driveTrain;
		this.doors=doors;
		// TODO Auto-generated constructor stub
	}
	public String getDriveTrain() {
		return driveTrain;
	}
	public void setDriveTrain(String driveTrain) {
		this.driveTrain = driveTrain;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
public String toString() {
	return super.toString()+"\n"+"DriveTrain: "+driveTrain+"Doors: "+doors;
	
}
}
