
public class BalPuntBoat extends BalMotorVehicle{

	private String puntBoatQuant = "puntBoatQuant";
	private Double puntBoatPrice = 1500.0;  
	private int puntBoatFrequency = 4;
	
	@Override
	public double calculateOilFee() {
		return puntBoatPrice*puntBoatFrequency;
	}

	@Override
	public String toString() {
		return "BalPuntBoat [puntBoatQuant=" + puntBoatQuant + ", puntBoatPrice=" + puntBoatPrice
				+ ", puntBoatFrequency=" + puntBoatFrequency + ", color=" + color + ", calculateOilFee()="
				+ calculateOilFee() + "]";
	}

   @Override
	public void getstreetSignalStop() {
	System.out.println("BalPunt Boat STOP");
		
	}

	@Override
	public void getstreetSingalLeftTurn() {
		System.out.println("BalPunt Boat Left Turn");
		
	}

	@Override
	public void getstreetSignalRightTurn() {
		System.out.println("BalPunt Boat Right Turn");
		
	}
	

}
