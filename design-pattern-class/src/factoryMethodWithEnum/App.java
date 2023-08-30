package factoryMethodWithEnum;

public class App {

	public static void main(String[] args) {

		VehicleFactory vehicleFactory = new VehicleFactory();

		Vehicle vehicle = vehicleFactory.getVehicle(VehicleType.CAR);
		vehicle.startEngine();

		Vehicle hydrogen = vehicleFactory.getVehicle(VehicleType.HYDROGEN);
		hydrogen.startEngine();
	}
}
