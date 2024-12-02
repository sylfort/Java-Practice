import java.io.*;

public class InputExample2 {

	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(in);
		System.out.println("数字を書いてください。");
		try {
			String numString = reader.readLine();
			double i = Double.parseDouble(numString);
			System.out.println("入力された値の平方根は" + Math.sqrt(i));
			reader.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
