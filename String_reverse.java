package SahanaHS_QATtest;

import java.util.ArrayList;
import java.util.Scanner;

public class String_reverse {
	public static void main(String[] args) {
		
		int n,i;
		
		ArrayList<String> str = new ArrayList<>();
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the size of string array : ");
		n =sc.nextInt();
		for(i=0;i<n;i++) {
			str.add(sc.next());
		}
		System.out.println("Reversed Strings : ");
		for(int j=str.size()-1;j>=0;j--) {
			System.out.println(str.get(j));
		}
		sc.close();

	}

}
