class Person {
	String name;
	int age;
}
public class Practice5_2 {

	public static void main(String[] args) {
		
		Person ralf = new Person();
		ralf.name = "Ralf";
		ralf.age = 25;
		
		Person berg = new Person();
		berg.name = "Berg";
		berg.age = 64;
		
		printInfo(ralf);
		printInfo(berg);
		
		System.out.println(ageCheck(ralf, 30));
		
		printYoungerPersonName(ralf, berg);
		
		System.out.println(getTotalAge(ralf, berg));
	}
	
	public static void printInfo(Person person) {
		System.out.println("名前:" + person.name + "\n年齢:" + person.age);
	}
	
	public static boolean ageCheck(Person p, int i) {
		return p.age > i;
	}
	
	public static void printYoungerPersonName(Person p1, Person p2) {
		if(p1.age < p2.age) {
			System.out.println(p1.name + "のほうが年下です");
		} else {
			System.out.println(p2.name + "のほうが年下です");
		}
	}
	
	public static int getTotalAge(Person p1, Person p2) {
		return p1.age+p2.age;
	}

}

//1 - d
//2 - b
//3 - e
//4 - h
//5 - g
//6 - a
//7 - f
