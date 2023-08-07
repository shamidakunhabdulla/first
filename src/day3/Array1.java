package day3;

import java.util.Scanner;

public class Array1 {
       public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=11;
		a[1]=22;
		a[2]=33;
		a[3]=44;
		a[4]=55;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a.length);
		int b[]=new int[5];
		System.out.println("enter the values in the array");
		Scanner sc=new Scanner(System.in);
		int i;
		for( i=0;i<5;i++){
			 b[i]=sc.nextInt();
		}
		for( i=0;i<5;i++){
			System.out.println(b[i]);
		}
		String c[]=new String[5];
		for(int k=0;k<5;k++) {
			c[k]=sc.next();
		}
	    
       
       
       for(String k:c) {
    	   System.out.println(k);
       }}
       
}
