public class Practice3_6 {
	public static void main(String[] args) {
		String asterisk = "*";
		int[] counts = {1, 3, 5, 6, 5, 2};
		for (int i = 0; i < counts.length; i++) {
			for (int j = 1; j < counts[i]; j++) {
				asterisk = asterisk + "*";
			}
			System.out.println(i + ":" + asterisk);
			asterisk = "*";
		}
	}
}

//0:*
//1:***
//2:*****
//3:******
//4:*****
//5:**
