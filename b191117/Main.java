import java.util.*;
class Shape{
static void getArea(int x){
	int r=x*x;
	System.out.println("Area of the square is:"+r);
}
static void getPerimeter(int x){
	int r=4*x;
	System.out.println("Perimeter of the square is:"+r);
}
static void getArea(int l,int b){
	int r=l*b;
	System.out.println("Area of the rectangle is:"+r);

}
static void getPerimeter(int l,int b){
	int r=2*(l+b);
	System.out.println("Perimeter of the rectangle is:"+r);

}
static void getArea(double x){
	double r =3.14*x*x;
	System.out.println("Area of the circle is:"+r);
}
static void getPerimeter(double x){
	double r =2*3.14*x;
	System.out.println("Perimeter of the circle is:"+r);
}
}
class Main{
public static void main(String args[]){
	Shape s1=new Shape();
	s1.getArea(4);
	s1.getPerimeter(6);
	s1.getArea(5,2);
	s1.getPerimeter(7,3);
	s1.getArea(3.5);
	s1.getPerimeter(7.33);
}
}
