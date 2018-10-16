package com.test.examples;

import java.util.Scanner;

public class AsciiDemo {

	public static void main(String[] args) {

		for (int i = 0; i <= 127; i++) {
			System.out.printf("%d : %c \n", i, i);
		}
	}

}

class Pattren {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.print("* ");

		}
	}
}

class Pattren2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
/* output is below
 * =============
 		* * * * 
 		* * * * 
 		* * * * 
 		* * * * 
*
*/

class Pattren3 {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
/* output is below
 * =============
 		* 
 		* * 
 		* * * 
 		* * * * 
*
*/

class Pattren4 {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
}
/* output is below
 * =============
 		1 
		1 2 
		1 2 3 
		1 2 3 4 
*
*/


class Pattren5 {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				int k=i+j-1;
				if(k>4)
				System.out.print(k-4+" ");
				else
					System.out.print(k+" ");
			}
			System.out.println("");
		}
	}
}
/* output is below
 * =============
 		
 		1 2 3 4 
		2 3 4 1 
		3 4 1 2 
		4 1 2 3 
*
*/

class Pattren6 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if((i+j)%2==0)
				System.out.print("1 ");
				else
					System.out.print("0  ");
			}
			System.out.println("");
		}
	}
}
/* output is below
 * =============
 		
 		1 
		0 1 
		1 0 1 
		0 1 0 1 
		1 0 1 0 1 
*
*/

class Pattren7 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i+" ");
			}
			System.out.println("");
		}
	}
}
/* output is below
 * =============
 		
 		1 
		2 2 
		3 3 3 
		4 4 4 4 
		5 5 5 5 5 
*
*/

class Fibonacci{
	public static void main(String[] args) {
		int k,a=1,b=1;
		Scanner sc=new Scanner(System.in);
		k=0;
		System.out.println("enter any number");
		int n=sc.nextInt();
		System.out.print("1 1 ");
		while(k<=n) {
			k=a+b;
			if(k>=n)
				break;
			System.out.print(k+" ");
			a=b;
			b=k;
		}
	}
}

/*	enter any number
	200
	1 1 2 3 5 8 13 21 34 55 89 144 
	*/


//input and output is the same called palindrome.
	class PalindromeExample {
	public static void main(String args[]) {
		int r, sum = 0, temp;
		int n = 454;// It is the number variable to be checked for palindrome
		temp = n;
		while (n > 0) {
			r = n % 10; // getting remainder
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");
	}

}
	
		class IsPerfectNumber {
	     public boolean isPerfectNumber(int number){
	    	 int temp = 0;
	    	 for(int i=1;i<=number/2;i++){
	    		 if(number%i == 0){
	    			 temp += i;
	    			 }
	    		 }
	    	 if(temp == number){
	    		 System.out.println("It is a perfect number");
	    		 return true;
	    		 }
	    	 else {
	    		 System.out.println("It is not a perfect number");
	    		 return false;
	    		 }
	    	 }
	     public static void main(String a[]){
	    	 IsPerfectNumber ipn = new IsPerfectNumber();
	    	 System.out.println("Is perfect number: "+ipn.isPerfectNumber(28));
	    	 }
	     } 