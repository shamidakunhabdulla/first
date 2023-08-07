package day1;

import java.util.Scanner;

public class Program18 {
public static void main(String[] args) {
	System.out.println("enter the character");
	Scanner sc=new Scanner(System.in);
	char ch=sc.next().charAt(0);
	
	switch(ch) {
	case 'a':{
		System.out.println("vowel");
		break;
	}
	case 'e':{
		System.out.println("vowel");
		break;
	}
	case 'i':{
		System.out.println("vowel");
		break;
	}
	case 'o':{
		System.out.println("vowel");
		break;
	}
	case 'u':{
		System.out.println("vowel");
	}
	case 'A':{
		System.out.println("vowel");
		break;
	}
	case 'E':{
		System.out.println("vowel");
		break;
	}
	case 'I':{
		System.out.println("vowel");
	}
	case 'O':{
		System.out.println("vowel");
		break;
	}
	case 'U':{
		System.out.println("vowel");
		break;
	}
	 
	default:System.out.println("consonant");
		
	}
}
}
