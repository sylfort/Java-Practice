import java.util.Scanner;
public class ForExample2 {
	public static void main(String[] args) {
		System.out.println("数字を書いてください");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
			System.out.println(i + "を加えました");
		}
		System.out.println("合計は" + sum + "です");
		input.close();
	}
}
