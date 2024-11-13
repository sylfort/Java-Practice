import java.util.Scanner;
public class Practice3_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		if (a%3==0) {
			System.out.println("3で割り切れます");
		} else {
			System.out.println("3で割り切れません");
		}
		input.close();
	}
}
