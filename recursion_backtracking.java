package javaBasics;
import java.util.*;

public class recursion_backtracking {

	private int count;


	public static void main(String[] args) {
		
		
		recursion_backtracking obj = new recursion_backtracking();
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter row: ");
//		int input1 = sc.nextInt();
//		System.out.print("Enter col: ");
//		int input2 = sc.nextInt();
		
//		obj.towerOfHanoi(3, 'A','B','C');
		
		String s = "abc";
		obj.permutations(s, 0, 2);
		obj.count = 0;
		
	}	
	
	
	
	
	
	//************************* Print N Natural Numbers *******************
	
	
	
	void N_NaturalNumbers(int n)
	{
		if(n==0)
			return;
		N_NaturalNumbers(n-1);
		System.out.print(n+" ");  // this statement will be executed when 
								 // base case will be occured for last call 
								// of function then second last and so on...
								// (Also known as TAIL RECURSION)
	}
	

	//************************* Print Sum of N Natural Numbers *******************

	
	
	int Sum_N_NaturalNumbers(int n)
	{
		if(n==0)
			return 0;
		
		int sum = Sum_N_NaturalNumbers(n-1)+n;	
		return sum;
	}
	
	
	
	
	
	//************************* Find the power of a number using recursion *******************

	
	int power(int n, int pow)
	{
		if(pow == 0)
			return 1;
		if(n == 0)
			return 0;
		return power(n, pow-1) * n;
	}
	
	
	
	
	
	//************************* Find the number of paths in a [N x M] Matrix *******************
	// Rule: You can go either Right or Down from any element 
	
	
	
	
	int matrix_path(int row, int col)
	{
		if(row == 1 || col == 1)
			return 1;
		int right_ans = matrix_path(row, col-1);
		int left_ans = matrix_path(row-1,col);
		
		return right_ans+left_ans;
	}
	
	
	
	
	
	// *************************** Check if aray is a palindrome using recursion ********************************
	
	
	boolean palindrome(int arr[], int begin, int end)
	{
		if(begin >= end)
			return true;
		
		if(arr[begin] == arr[end])
			return palindrome(arr, begin+1, end-1);
		else
			return false;
	}
	

	
	
	
	// *************************** Factorial of a number using recursion ********************************

	
	int fact(int num)
	{
		if(num == 1)
			return num;
		
		return num * fact(num-1);
	}
	
	
	
	
	// ************************* Sum of squares of N natural numbers using recursion *******************
	
	int SumOfSq(int num)
	{
		if(num == 1)
			return 1;
		return num*num + SumOfSq(num-1);
	}
	
	

	// *************************** Find the Greates Common Divisor of 2 numbers (GCD using Euclid Formula) ********************************

	
	int GCD(int num1, int num2)
	{	
		int rem = num1%num2;
		if(rem == 0)
		
			return num2;		
		return GCD(num2, rem);
	}
	
	
	// ************************** Find the sum of digits in a number using Recursion
	
	
	int sumOfDigits(int num)
	{
		if (num == 0)
			return 0;
		
		int last = num%10; 
		return last + sumOfDigits(num/10);
		
	}
	
	
	// ************ Generate all Subsets / Subsequence of a string
	
	
	void gensubsets(String s)
	{
		gensubsets2(s,0,"");
	}
	
	
	void gensubsets2(String s, int i, String cur )
	{
		if(i == s.length())
		{
			System.out.println(cur);
			return;
		}
		
		gensubsets2(s, i+1 ,cur);
		gensubsets2(s, i+1, cur+ s.charAt(i));
	}
	
	
	// **************** Tower of hanoi
	
	void towerOfHanoi(int n, char from, char to , char aux)
	{
		  if (n == 0)
			  return;
		  
		  towerOfHanoi(n-1,from,aux,to);
		  System.out.println("Move " + n +" from " + from +" to " + to);
		  towerOfHanoi(n-1,aux,to,from);
	}
	
	
	
	
	
	// *************** Print all permutations of a given string
	
	
	
	void permutations(String str, int l, int r)
	{
		if(l == r) {
			count++;
			System.out.println(str);
			System.out.println("***** Swap number = "+ count);
			System.out.println();
		}
			
		else
		{
			for(int i = l; i <= r; i++)
			{
				str = swap(str,l,i);
				
				System.out.println("First swap");
				System.out.println(str + ", l = "+l+", i = "+i);
				System.out.println();
				System.out.println("Calling Permutation");
				System.out.println();
				permutations(str,l+1,r);
				
				str = swap(str,l,i);
				
				System.out.println("Second Swap");
				System.out.println(str + ", l = "+l+", i = "+i);
				System.out.println();
			}
		}
		
	}
	
	
	String swap(String s, int a, int b)
	{
		char temp;
		char [] charArray = s.toCharArray();
		temp = charArray[a];
		charArray[a] = charArray[b];
		charArray[b] = temp;
		
		return String.valueOf(charArray);
	
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
