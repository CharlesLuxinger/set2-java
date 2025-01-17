package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<Integer> set = new HashSet<Integer>();

		for (int i = 1; i <= 3; i++) {
			System.out.print("How many students for course #" + i + ": ");
			int x = sc.nextInt();
			for (int j = 1; j <= x; j++) {
				int y = sc.nextInt();
				set.add(y);
			}
		}

		System.out.println("Total students: " + set.size());

		sc.close();
	}

}
