import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
public class VehicleTester  {

	public static void main(String[] args ) throws FileNotFoundException{
		Car c1=new Car(120,5,"4WD",4);
		Car c2=new Car(90,4,"FWD",2);
		Car c3=new Car(180,4,"RWD",2);

		Truck t1=new Truck(100,5,1000,5000);
		Truck t2=new Truck(95,5,1500,4000);
		Truck t3=new Truck(120,5,2000,6000);
		Mortorcycle m1=new Mortorcycle(220,1,false);
		Mortorcycle m2=new Mortorcycle(130,2,true);
		
		ArrayList<Vehicle> topSpeeds=new ArrayList<>();
		ArrayList<Vehicle> trucks=new ArrayList<>();
		topSpeeds.add(c1);
		topSpeeds.add(c2);
		topSpeeds.add(c3);
		topSpeeds.add(m1);
		topSpeeds.add(m2);
		trucks.add(t1);
		trucks.add(t2);
		trucks.add(t3);
		
		PrintWriter output = new PrintWriter("output.txt");
		
		for(int i=0; i<topSpeeds.size();i++) {
			output.println(topSpeeds.get(i));
		}
		
		output.println("==============================================");
		
		Collections.sort(topSpeeds);
		
		for(int i=0; i<topSpeeds.size();i++) {
			output.println(topSpeeds.get(i));
			
		}
		output.println("==================================================");
		
		CompareByPayload comp = new CompareByPayload();
		
		Collections.sort(trucks, Collections.reverseOrder());
		for(int i=0; i<trucks.size();i++) {
			System.out.println(trucks.get(i)+ "\n");
			
			
		}
		
		
		
		
		
		output.close();
	
	}

}
