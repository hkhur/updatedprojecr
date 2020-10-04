
public class BalDriveBicycle implements BalStreetLegal {

	private String bicyclePedal = "BalDriveBicycle";

	@Override
	public String toString() {
		return "DriveBicycle [bicyclePedal=" + bicyclePedal + "]";
	}

	@Override
	public void getstreetSignalStop() {
	System.out.println("Bicycle Stop");	
	}

	@Override
	public void getstreetSingalLeftTurn() {
	System.out.println("Bicycle LeftTurn");	
	}

	@Override
	public void getstreetSignalRightTurn() {
	System.out.println("Bicycle RightTurn");
		}
	}
