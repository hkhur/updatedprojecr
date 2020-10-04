
public class BalMotorVehicle implements BalStreetLegal{

	private int manufacturingYear = 2020;

	public enum Color {
	    RED, YELLOW, BLUE; //each is an instance of Color 
	}
Color color = Color.BLUE;
	
	

@Override
public String toString() {
	return "BalMotorVehicle [manufacturingYear=" + manufacturingYear + ", color=" + color + "]";
}

public double calculateOilFee()
{return 500.0;}

@Override
public void getstreetSignalStop() {
System.out.println("BalMotorVehicle Stop");
	
}

@Override
public void getstreetSingalLeftTurn() {
	System.out.println("BalMotorVehicle LeftTurn");
	
}

@Override
public void getstreetSignalRightTurn() {
	System.out.println("BalMotorVehicle RightTurn");
	
}
 	
	
}
