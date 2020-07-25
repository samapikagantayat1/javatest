package javabasics;

import java.util.Scanner;

public class floattoint {

	public static void main(String[] args)
	{
		System.out.println("Enter some value");
		Scanner s1=new Scanner(System.in);
		String input=s1.nextLine();
		float i=Float.parseFloat(input);
		System.out.println(i);
		s1.close();
	}
}
