public class UnionClassesGeometricShapes {
//	Add the following four methods to the class hierarchy: 
//	(1) one that computes the area of shapes;  
//	(2) one that produces the distance of shapes to the origin; 
//	(3) one that determines whether some point is inside some shapes; 
//	(4) final one creates the bounding box of shapes.	
	public static void main(String[] args) {
		IShape dot = new Dot(new CartPt(4, 3));
		IShape squ = new Square(new CartPt(4, 3), 3);
		IShape cir = new Circle(new CartPt(12, 5), 2);
		
		System.out.println(dot.area());
		System.out.println(squ.distTo0());
		CartPt dotLocation = new CartPt(((Dot) dot).x, ((Dot) dot).y); 
		System.out.println(cir.in(dotLocation));
//		System.out.println(((Dot) dot).x);
//		boolean testDot = check dot.area() expect 0.0 within 0.1;
//		boolean testSqu = check squ.area() expect 9.0 within 0.1;
//		boolean testCir = check cir.area() expect 12.56 within 0.01;

	}

}
	// the class of all geometric shapes
	interface IShape {
		public double area();
		// to compute the distance of this shape to the origin
		double distTo0();
		// is the given point within the bounds of this shape?
		boolean in(CartPt p);
		
	}
	
	// a Cartesian point in the plane
	class CartPt {
	public int x;
	public int y;
	
	CartPt(int x, int y) {
	this.x = x;
	this.y = y;
	}
	double distTo0(){
		return Math.sqrt((this.x * this.x) + (this.y * this.y));
		}

	}

	// a dot
	class Dot implements IShape {
	public CartPt loc;
	public int x;
	public int y;
	
	Dot(CartPt loc) {
		this.x = loc.x;
		this.y = loc.y;
	}
	public double area() {
		return 0;
		}
	
	public double distTo0() {
		return
		this.loc.distTo0();
		}
	
	public boolean in(CartPt p) {
		return p == this.loc;
	}
	
//	public int getX() {
//		return this.x;
//	}
//	
//	public int getY() {
//		return this.y;
//	}


	}
	
	// a square
	class Square implements IShape {
	CartPt loc;
	int size;
	
	Square(CartPt loc,
	int size) {
		this.size = size;
		this.loc = loc;
	}
	public double area() {
		return this.size * this.size;
		}
	
	public double distTo0() {
		return
		this.loc.distTo0();
		}
	
	public boolean in(CartPt p) {
		return this.between(this.loc.x,p.x,this.size)
				&& this.between(this.loc.y,p.y,this.size);
		}
	// is x in the interval [lft,lft+wdth]?
	boolean between(int lft, int x, int wdth) {
	return lft <= x && x <= lft + wdth;
		}

	}
	
	
	// a circle
	class Circle implements IShape {
	CartPt loc;
	int radius;
	
	Circle(CartPt loc, int radius) {
		this.loc = loc;
		this.radius = radius;
	}
	
	public double area() {
		return
		(Math.PI *
		this.radius *
		this.radius);
		}
	
	public double distTo0() {
		return this.loc.distTo0() - this.radius;
		}
	

	// the distance between this and other
	public double distanceTo(CartPt other) {
	return
	Math.sqrt(
	((this.loc.x - other.x) * (this.loc.x - other.x)
	+
	(this.loc.y - other.y) * (this.loc.y - other.y)));
	}

	public boolean in(CartPt p) {
		return this.distanceTo(p) <= this.radius;
	}
	
	}
	
	

