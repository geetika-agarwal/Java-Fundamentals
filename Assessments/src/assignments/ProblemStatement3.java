/* Problem Statement 3:

Define a concrete class named as Vehicle with start and stop methods that defines the default
 functionality of any vehicle. Inherit Vehicle class into further subclass named as TwoWheeler 
 and FourWheeler and override start and stop methods to redefine their functionality. Invoke all 
 the methods from their respective class and test the program.

*************************************************************** */

package assignments;

abstract class Vehicle {
	abstract void start();

	abstract void stop();
}

class TwoWheeler extends Vehicle {
	@Override
	public void start() {
		System.out.println("Start for a Two Wheeler Vehicle");
	}

	@Override
	public void stop() {
		System.out.println("Stop for a Two Wheeler Vehicle");
	}
}

class FourWheeler extends Vehicle {
	@Override
	public void start() {
		System.out.println("Start for a Four Wheeler Vehicle");
	}

	@Override
	public void stop() {
		System.out.println("Stop for a Four Wheeler Vehicle");
	}
}

public class ProblemStatement3 {
	public static void main(String[] args) {
		TwoWheeler two = new TwoWheeler();
		FourWheeler four = new FourWheeler();

		System.out.println("The functions of Two Wheeler Vehicles: ");
		two.start();
		two.stop();

		System.out.println("***********************");

		System.out.println("The functions of the Four Wheeler Vehicles: ");
		four.start();
		four.stop();
	}
}
