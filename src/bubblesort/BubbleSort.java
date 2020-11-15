package bubblesort;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		
		int n = 0;
		System.out.println("so phan tu trong  mang :  ");
//		 input number of element in array
		n = scanner.nextInt();
//		deractor array and element in array
		int list [] = new int[n];
//		 enter number  in to array
		for (int i = 0; i < list.length; i++) {
			list[i] = scanner.nextInt();
		}

		int temp = 0;
//		bubble sort low to high
		for (int i = 0; i < list.length-1 ; i++) {
			for (int j = 1; j < list.length-i; j++) {
				if (list[j-1] > list[j]) {
//					 
					temp = list[j-1];
					list[j-1]= list[j];
					list[j]=temp;
				}

			}
		}
//		 show list
		for (int i : list) {
			System.out.print(i);
		}
	}
}
