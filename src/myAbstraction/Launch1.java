package myAbstraction;

public class Launch1 {
	public static void main(String[] args) {
			Plane p=new Plane() {
				@Override
				void fly()
				{
					System.out.println("Plane Flew");
				}
			};
				p.takeoff();
				p.fly();
				p.land();
			}
	}


