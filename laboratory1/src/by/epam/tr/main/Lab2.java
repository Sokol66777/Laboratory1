package by.epam.tr.main;

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int sum=0;
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Inpun n");
		n=sc.nextInt();
		int array[]=new int[n];
		inp(array);
		sum=division(array);
		count=moreOrLess(array);
		System.out.println(count);
		System.out.println(sum);
		
	}
	private static void inp(int array[]) {
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<array.length;i++) {
			System.out.println("input array["+i+"]");
			array[i]=sc.nextInt();
		}
	}
	private static int division(int array[]) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]%5==4) {
				sum+=array[i];
			}
		}
		return sum;
	}
	private static int moreOrLess(int array[]) {
		int count=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]>15 || array[i]<2) {
				count++;
			}
		}
		return count;
	}

}
