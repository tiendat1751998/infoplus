package stringcheck;

import java.util.Scanner;

public class StringCheckYN {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("enter string u want check :");
			String n = scanner.nextLine();
			n.toLowerCase();
			String k = "yes";
			String x = "no";
			String[] part = n.split(" ");
			for (int i = 0; i < part.length; i++) {
				if (part[i].trim().equalsIgnoreCase(k.toLowerCase())) {
					System.out.println("have yes");
				} else if (part[i].trim().equalsIgnoreCase(x.toLowerCase())) {
					System.out.println("have no");
				} else {
					System.out.println("nothing");
				}
			}

		}
	}
}
