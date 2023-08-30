package factoryMethodWithEnum;

public enum VehicleType   {

	TRUCK {
		public Vehicle getVehicle() {
			return new Truck();
		}
	},
	CAR {
		public Vehicle getVehicle() {
			return new Car();
		}
	},
	ELECTRIC {
		public Vehicle getVehicle() {
			return new ElectricCar();
		}
	},
	HYDROGEN {
		public Vehicle getVehicle() {
			return new HydrogenCar();
		}
	};

	abstract Vehicle getVehicle();
}
