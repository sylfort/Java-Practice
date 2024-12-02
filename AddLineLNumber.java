import java.io.*;

public class AddLineLNumber {

	public static void main(String[] args) {
		try {
			File file = new File("C:/java/test.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter("C:/java/test2.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			String s;
			int lineNumber = 1;
			while ((s = br.readLine()) != null) {
				bw.write(lineNumber + ":" + s + "\n");
				lineNumber++;
			}
			br.close();
			bw.close();
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
