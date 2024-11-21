
class VirtualPet {
	
	String name;
	int maxEnergy = 100;
	int currentEnergy;
	
	VirtualPet(String n, int curE){
		name = n;
		currentEnergy = curE;
	}
	
	void sleep() {
		System.out.println(this.name + "：よく寝た。体力が回復したよ。");
		currentEnergy = maxEnergy;
	}
		
	void printInfo() {
		System.out.println("[状態出力]");
		System.out.println("名前：" + name);
		System.out.println("最大体力：" + maxEnergy);
		System.out.println("体力：" + currentEnergy);
	}
	
	void move() { }
}

class VirtualDog extends VirtualPet {
	
	VirtualDog(String n, int curE){
		super(n, curE);
	}
	
	void sleep() {
		super.sleep();
	}
	
	void move() {
		if (currentEnergy < 10) {
			System.out.println(name + "疲れちゃって、これ以上歩けないよ。");
		} else {
			System.out.println(name + "歩いたよ。体力が１０減った。最大体力が１増えた。");
			currentEnergy -= 10;
			maxEnergy++;
		}
	}
	
	void printInfo() {
		super.printInfo();
	}
}

class VirtualBird extends VirtualPet {
	
	VirtualBird(String n, int curE){
		super(n, curE);
	}
	
	void sleep() {
		super.sleep();
	}
	
	void move() {
		if (currentEnergy < 10) {
			System.out.println(name + "疲れちゃって、これ以上飛べないよ。");
		} else {
			System.out.println(name + "バタバタ。飛んだよ。体力が１０減った。最大体力が１増えた。");
			currentEnergy -= 10;
			maxEnergy++;
		}
	}
	
	void printInfo() {
		super.printInfo();
	}
}

public class VirtualPetGame3 {
	
	public static void moveAndSleep(VirtualPet pet) {
		pet.move();
		pet.sleep();
	}

	public static void main(String[] args) {
		VirtualDog taro = new VirtualDog("taro", 90);
		VirtualBird piyo = new VirtualBird("piyo", 70);
		
		moveAndSleep(piyo);
		moveAndSleep(taro);

	}

}
