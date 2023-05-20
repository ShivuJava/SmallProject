import java.util.Scanner;

abstract class Shape
{
	float area;
	abstract public void input();
	abstract public void compute();
	void display() {
		System.out.println(area);
	}
}

class Rectangle extends Shape{
	float length;
	float breadth;
	

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of length");
		length = sc.nextFloat();
		System.out.println("Enter the value of breadth");
		  breadth = sc.nextFloat();
	}
	public void compute() {
		area=length*breadth;
	}
	
}

class Square extends Shape
{
	
	float length;
	
	
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of square");
	    length = sc.nextFloat();
	
	}
	public void compute()
	{
		area=length*length;
	}
	
}

class Circle extends Shape
{	
	final float pi= 3.14F;
	float radius;
	
	public void input() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		radius = sc.nextFloat();
	
	}
	public void compute()
	{
		area= pi* radius*radius;
	}
	
}
class Sample{
	void comuite(Shape ss) {
		ss.input();
		ss.compute();
		ss.display();
	}
}


public class OopsProject {

	public static void main(String[] args) {
	
     Rectangle r = new Rectangle();
     Square s =new Square();
     Circle c = new Circle();
         
     Sample s1 = new Sample();
     s1.comuite(r);
     s1.comuite(s);
     s1.comuite(c);
     
		}
}



