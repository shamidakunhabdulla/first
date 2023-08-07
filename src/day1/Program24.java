package day1;

import java.util.Scanner;

public class Program24 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the first limit");
	char ch1=sc.next().charAt(0);
	System.out.println("enter the last limit");
	char ch2=sc.next().charAt(0);

	do {
		System.out.println(ch1);
		ch1++;
	}
	while(ch1<=ch2); 
	
		
	
}
}
