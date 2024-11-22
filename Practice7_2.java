class Vehicle {
	int speed;
	
	Vehicle(int speed){
		this.speed = speed;
		System.out.println("乗り物です。");
	}
	
	void honk() {
		System.out.println("beep, beep");
	}
	
	void speedUp() {
		speed += 10;
		System.out.println("Speed: " + speed + "km/h");
	}
}

class Truck extends Vehicle {
	Truck(int speed){
		super(speed);
	}
	
	void honk() {
		System.out.println("BEEEEEEP, BEEEEEEP");
	}
}


public class Practice7_2 {
	
	public static void speedUpAndHonk(Vehicle v) {
		v.speedUp();
		v.honk();
	}

	public static void main(String[] args) {
		Vehicle car = new Vehicle(50);
		Truck truck = new Truck(60);
		
		speedUpAndHonk(car);
		speedUpAndHonk(truck);

	}

}
