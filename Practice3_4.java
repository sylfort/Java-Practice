public class Practice3_4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("i=" + i);
			switch(i) {
			case 1:
				System.out.println("A");
			case 2:
				break;
			case 3:
				System.out.println("B");
			case 4:
			default:
				System.out.println("C");
			}
		}	
	}
}
