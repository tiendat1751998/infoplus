package odd;

import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum =0;
//		 find odd number 
		for (int i = 0; i <= n; i++) {
			if(i%2==1)
			{
//				sum odd number < n
				sum+=i;
			}
		}
		System.out.println("summary = "+ sum);
	}

}
