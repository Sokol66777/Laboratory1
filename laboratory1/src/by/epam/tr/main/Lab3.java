package by.epam.tr.main;

public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4;
		int b=8;
		double h=0.5;
		func(a,b,h);
	}
	private static void func(int a, int b, double h) {
		double y;
		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "F(x)");
		System.out.println("---------------------------------");
		for(double i=a;i<=b;i=i+h) {
			y=Math.tan(i);
			System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", i, y);
		}
		System.out.println("---------------------------------");
	}

}
