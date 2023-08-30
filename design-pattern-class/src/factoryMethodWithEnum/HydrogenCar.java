package factoryMethodWithEnum;

public class HydrogenCar implements Vehicle {

	@Override
	public void startEngine() {
		System.out.println("started hydrogen car's engine...");
	}
}
