package AutoShop;

public class Car {
	private String make;
	private String model;
	private double fuelEfficiency; // miles per gallon (mpg)
	
	public Car(String make, String model, double fuelEfficiency) {
		this.make = make;
		this.model = model;
		this.fuelEfficiency = fuelEfficiency;
	}
	
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public double getFuelEfficiency() {
		return fuelEfficiency;
	}
	
	public double calcFuelNeed(double distance) {
		double fuel = distance / fuelEfficiency;
		return fuel;
	}
	
}
