package day1;

import java.util.Scanner;

public class Program21 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the lower limit");
	int lower=sc.nextInt();
	System.out.println("enter the upper limit");
	int upper=sc.nextInt();
	
	while(lower<=upper) {
		if(lower%2==0) {
			System.out.println(lower);
			lower++;
		}
	}
	
}
}
