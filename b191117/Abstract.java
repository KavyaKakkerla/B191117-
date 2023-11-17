abstract class Shape2d {
    public abstract double getArea();
}

abstract class Shape3d{
	public abstract double getArea();
	public abstract double getVolume();
}

class Square extends Shape2d {
    private double side;
    public Square(double side) {
        this.side = side;
    }
    public double getArea() {
        return side * side;
    }
    }
class Circle extends Shape2d {
    private double radius;
	public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Cube extends Shape3d {
    private double side;

    public Cube(double side) {
        this.side = side;
    }
    public double getArea() {
        return 6 * side * side;
    }
    public double getVolume() {
        return side * side * side;
    }
}

class Sphere extends Shape3d {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}
public class Abstract{
    public static void main(String[] args) {
        Square square = new Square(5);
        Circle circle = new Circle(3);
        Cube cube = new Cube(4);
		Sphere sphere = new Sphere(5);
		
		System.out.println("Details of square:");
		displayshape2d(square);
		System.out.println("Details of circle:");
		displayshape2d(circle);
		System.out.println("Details of cube:");
		displayshape3d(cube);
		System.out.println("Details of circle:");
		displayshape3d(sphere);
		}
		public static void displayshape2d(Shape2d shape){
		System.out.println("Area :"+shape.getArea()+"\n");
		}
		public static void displayshape3d(Shape3d shape){
		System.out.println("Area :"+shape.getArea()+"\n");
		System.out.println("Volume :"+shape.getVolume()+"\n");
		}
}


