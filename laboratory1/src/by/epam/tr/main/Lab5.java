package by.epam.tr.main;

import java.util.Arrays;
import java.util.Random;

public class Lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 8, 7, 4, 9, 10, 5, 11, 16, 12 };
		// int arr[]= new int[7];
		int arr2[] = new int[arr.length];
		Random rand = new Random();
		// for(int i=0;i<arr.length;i++) {
		// arr[i]=rand.nextInt(25);
		// }
		
		longest(arr, arr2);
		
		left(arr, arr2);
		
		right(arr, arr2);
		
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i]!=0) {
				System.out.print(arr2[i]+" ");
			}
		}
		
	}

	private static void longest(int arr[], int arr2[]) {
		int count = 0;
		int max = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				count++;
				if (count > max) {
					max = count;
				}
			} else {
				count = 0;
			}
		}
		count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				count++;
				if (count == max) {

					for (int j = i + 1; j > i - count; j--) {
						arr2[j] = arr[j];

					}
					break;

				}
			} else {
				count = 0;
			}
		}
	}

	private static void left(int arr[], int arr2[]) {
		int min = 0;
		int minvalue = 0;
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] != 0) {
				min = i;
				minvalue = arr2[i];
				break;
			}
		}
		for (int i = min - 1; i >= 0; i--) {
			if (arr[i] < minvalue) {
				arr2[i] = arr[i];
				minvalue = arr2[i];
			}
		}
	}

	private static void right(int arr[], int arr2[]) {
		int max = 0;
		int maxvalue = 0;
		for (int i = arr2.length - 1; i >= 0; i--) {
			if (arr2[i] != 0) {
				max = i;
				maxvalue = arr2[i];
				break;
			}
		}
		for (int i = max + 1; i < arr.length; i++) {
			if (arr[i] > maxvalue) {
				arr2[i] = arr[i];
				maxvalue = arr2[i];
			}
		}
	}
}
