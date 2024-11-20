class Rectangle6_3 {
	double width;
	double height;
	
	Rectangle6_3 (int w, int h){
		width = w;
		height = h;
	}
	
	double getArea(){
		return width * height;
	}
	
	String printInfo() {
		return ("height:" + this.height + "\n" + "width:" + this.width);
	}
	
	boolean isLarger(Rectangle6_3 anotherRect){
		return (this.getArea() > anotherRect.getArea());
	}
}

class Practice6_3 {
	public static void main(String[] args) {
		
		Rectangle6_3 r = new Rectangle6_3(3, 6);
		Rectangle6_3 r2 = new Rectangle6_3(3, 6);
		
//		System.out.println("r height:" + r.height + "\nrwidth:" + r.width);
//		System.out.println("r2 height:" + r2.height + "\nr2width:" + r2.width);
//		
		System.out.println("r info:\n" + r.printInfo()); 
		System.out.println("r area:" + r.getArea());
		
		System.out.println("r2 info:\n" + r2.printInfo()); 
		System.out.println("r2 area:" + r2.getArea());
		
		System.out.println("r > r2? " + r.isLarger(r2));
	}
}
