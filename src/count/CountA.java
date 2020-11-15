package count;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//
//Count how many time an “a” appear in string?
//
public class CountA {
//	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter string : ");
		String n = scanner.nextLine();
		
		n.toLowerCase();
		int count = 0;
		char a = 'a';
//		count 'a'
		for (char i = 0; i < n.length(); i++) {
			if (n.charAt(i) == a) {
				count++;
			}
		}

		System.out.println("have 'a' in String  : "+count);

	}
}
