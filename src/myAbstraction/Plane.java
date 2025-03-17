package myAbstraction;

abstract class Plane {
	void takeoff(){
		System.out.println("Plane Took Off");
		
	}
	abstract void fly();
	void land()
	{
		System.out.println("Plane Landed");
	}
}
class CargoPlane extends Plane{
	@Override
	void fly()
	{
		System.out.println("Cargo Plane Flew");
	}
}
