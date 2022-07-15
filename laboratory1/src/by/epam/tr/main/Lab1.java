package by.epam.tr.main;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x=5;
		double y=3;
		double num;
		double den;
		double ans;
		num=numerator(x,y);
		den=denominator(x,y);
		ans=num/den+x;
		System.out.println(ans);
	}
	private static double numerator(double x,double y) {
		double ans;
		ans=Math.pow(Math.sin(x+y), 2)+1;
		return ans;
	}
	private static double denominator(double x, double y) {
		double ans;
		ans=2+Math.abs(x-(2*x)/(1+x*x*y*y));
		return ans;
	}

}
