package day1;

import java.util.Scanner;

public class Program29 {
public static void main(String[] args) {
	digit();
	
}
public static void digit() {
	System.out.println("enter the number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	 int reminder=n%10;
	 System.out.println(reminder);
}
}

