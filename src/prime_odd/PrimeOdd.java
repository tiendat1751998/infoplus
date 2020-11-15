package prime_odd;


import java.util.Scanner;

public class PrimeOdd {
//	 check prime 
	public static  boolean prime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <=Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter n : ");
//		 input n 
		int n = scanner.nextInt();
		System.out.println("prime number : " );
//		 find prime number < n
		for (int i = 2; i <= n; i++) {
			if (prime(i)) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("event number : ");
//		find even number < n
		for (int i = 0; i <= n; i++) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println(" odd number ");
//		find odd number < n
		for (int i = 0; i <= n; i++) {
			if (i%2==1) {
				System.out.print(i+" ");
			}
		}
	}
}
