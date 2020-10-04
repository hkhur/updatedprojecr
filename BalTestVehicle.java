public class BalTestVehicle {

public static void main(String[] args) {
	
	BalStreetLegal[] streetlegal = new BalStreetLegal[2]; // creating array of objects to store other classes objects
	
	BalMotorVehicle[] motorvehicle = new BalMotorVehicle[3]; //creating array of objects to store other classes objects
	
	BalBatteryCar batterycar = new BalBatteryCar();// creating object of BatteryCar
	
	BalPuntBoat puntboat = new BalPuntBoat();// creating object of PuntBoat
	
	BalDriveBicycle bicycle = new BalDriveBicycle();// creating object of Bicycle
	
	BalGoPedestrian pedestrian = new BalGoPedestrian();// creating object of Pedestrian
	
	BalMotorVehicle balmotorvehicle = new BalMotorVehicle();
	
    motorvehicle[0] = balmotorvehicle;// storing  batterycar object in to array of objects
    
	motorvehicle[1] = batterycar;// storing puntboat object into array of objects
	
	motorvehicle[2] = puntboat;
	
	streetlegal[0] =  bicycle;// storing bicycle object into array of objects
	
	streetlegal[1] = pedestrian;// storing pedestrian object into array of objects
	
	
	for(int i=0;i<motorvehicle.length;i++) {
		System.out.print(motorvehicle[i].toString() + " "  );
		motorvehicle[i].getstreetSignalStop();
		
	}
	//System.out.println();
	for(int i=0;i<streetlegal.length;i++) {
		System.out.print(streetlegal[i].toString() + " ");
		streetlegal[i].getstreetSignalStop();
		
	}

	
	}
	
}
