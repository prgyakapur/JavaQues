package javaBasics;
import java.util.Scanner;

public class Helloworld {

	public static void main(String[] args) 
	{

//------------ BASIC OUPUT + VARIABLES --------
		
		System.out.println("Hello");
		System.out.println("Hello World");
		int age = 34;
		System.out.println(age);
		
//------------ BASIC INPUT -----------------
		
//		System.out.println("Please Enter Age");
//		Scanner sc = new Scanner(System.in);
//		int c =sc.nextInt();
//		System.out.println("Your age is " + c);
		
		
//------------ IF STATEMENT -----------------
//		int age = 2;
//		if(age >= 18)
//		{
//			System.out.println("Voting Start");
//		}
//		else
//			System.out.println("Thanks");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int prod;
		prod = num1 * num2;
		System.out.println(prod);
		
	}

}
