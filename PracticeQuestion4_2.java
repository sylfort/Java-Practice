public class PracticeQuestion4_2 {
	
	public static double[] getTriangleArea(double height, double base) {
		double [] arr = {height, base, (height * base/2.0)};
		return arr;
	}
	
	public static void printHello(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("Hello");
		}
	}
	
	public static double[] getRectangleArea(double width, double base) {
		double [] arr = {width, base, (width * base)};
		return arr;
	}
	
	public static String getMessage(String name) {
		return ("こんにちは" + name + "さん");

	}
	
	public static int getAbsoluteValue(int value) {
		return Math.abs(value);
	}
	
	public static double[] getAverage(double a, double b, double c) {
		double [] arr = {a, b, c, ((a+b+c)/3.0)};
		return arr;
	}
	
	public static boolean isSameAbsoluteValue(int i, int j) {
		return (getAbsoluteValue(i) == getAbsoluteValue(j));
	}

	public static void main(String[] args) {
				
		double [] example1 = getTriangleArea(10.0, 3.0);
		System.out.println("例題１");
		System.out.println("高さ" + example1[0] + "底辺" + example1[1] + "の三角形の面積は" + example1[2]);
		
//		問い(1)
		printHello(3);
		
//		問い(2)
		double [] exampleRectangle = getRectangleArea(10.0, 3.0);
		System.out.println("長方形");
		System.out.println("高さ" + exampleRectangle[0] + "底辺" + exampleRectangle[1] 
									+ "の長方形の面積は" + exampleRectangle[2]);
		
//		問い(3)		
		System.out.println(getMessage("戸田"));
		
//		問い(4)
		System.out.println(getAbsoluteValue(-33));
		
//		問い(5)
		double [] avg = getAverage(10.0, 3.0, 4.0);
		System.out.println(avg[0] + "と" + avg[1] + "と" + avg[2] + "の平均は" + String.format("%.03f", avg[3]) + "です");

//		問い(6)
		System.out.println(isSameAbsoluteValue(3, -3));
	}
}
