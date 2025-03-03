package AutoShop;

public class MainAutoProgram {
	public static void main(String[] args) {
		Car car1 = new Car("Toyota", "Corolla", 30.0);
		double n = 150.0;
		
		System.out.print("Make: " + car1.getMake() + "\n"
						+ "Model: " + car1.getModel() + "\n"
						+ "Fuel Efficiency: " + car1.getFuelEfficiency() + "mpg \n"
						+ "Fuel needed in " + n + " miles distance: " + car1.calcFuelNeed(n) + " gallons"
						);
	}
}
