package day1;

import java.util.Scanner;

public class Program25 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=10;j++) {
			System.out.println(i +"*"+j+"="+i*j);
		}
		
		
	}
}
}
