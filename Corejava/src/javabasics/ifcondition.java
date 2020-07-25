package javabasics;

import java.util.Scanner;

public class ifcondition {

	
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter y/n");
		char ch=s1.nextLine().charAt(0);
		if(ch=='y')
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
	}

	
}
