package day2;

import java.util.Scanner;

public class Prog1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the first number");
	int a=sc.nextInt();
	System.out.println("enter the second number");
	int b=sc.nextInt();
	 int result=(add(a,b));
	 System.out.println("result is:"+result);
	sub(a,b);
	mul(a,b);
	div(a,b);
	
}
public static int add(int x,int y) {
	int res=x+y;
	
	return res;
}
public static void sub(int x,int y) {
	int res=x-y;
	System.out.println("result is:"+res);
}
public static void mul(int x,int y) {
	int res=x*y;
	System.out.println("result is:"+res);
}
public static void div(int x,int y) {
	int res=x/y;
	System.out.println("result is:"+res);
}
}
