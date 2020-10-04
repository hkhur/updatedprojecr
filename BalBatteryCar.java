
public class BalBatteryCar extends BalMotorVehicle implements BalStreetLegal {

	private String batteryCarwheel = "batteryCarwheel";
	private Double batteryCarPrice = 1000.0;
	private int batteryCarFrequency = 2;
	@Override
	public double calculateOilFee() {
		
		return batteryCarPrice*batteryCarFrequency;
	}
	@Override
	public void getstreetSignalStop() {
	System.out.println("Car Stop");	
	}
	@Override
	public void getstreetSingalLeftTurn() {
    System.out.println("Car LeftTurn");	
		}
	@Override
	public void getstreetSignalRightTurn() {
		System.out.println("Car RightTurn");	
		}
	
	Color color = Color.BLUE;
	@Override
	public String toString() {
		return "BalBatteryCar [batteryCarwheel=" + batteryCarwheel + ", batteryCarPrice=" + batteryCarPrice
				+ ", batteryCarFrequency=" + batteryCarFrequency + ", color=" + color + "]";
	}
	
	
	
}
