public class BalGoPedestrian implements BalStreetLegal {

	private String pedestrianLeg = "BalGoPedestrian" ;

	@Override
	public String toString() {
		return "GoPedestrian [pedestrianLeg=" + pedestrianLeg + "]";
	}

	@Override
	public void getstreetSignalStop() {
		System.out.println("Pedestrian Stop");
	}

	@Override
	public void getstreetSingalLeftTurn() {
		System.out.println("Pedestrian LeftTurn");
		}

	@Override
	public void getstreetSignalRightTurn() {
		System.out.println("Pedestrian RightTurn");
		}
}
