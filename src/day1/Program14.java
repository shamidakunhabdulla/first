package day1;

public class Program14 {
public static void main(String[] args) {
	
	char ch='$';
	if (ch>='a' && ch<='z' || ch>='A' && ch<='Z')
	{
		System.out.println("it is alphabet");
	} 
	else if(ch>=0 && ch<=9 ) {
		System.out.println("it is a  number");
	}
	else {
		System.out.println("it is a special charcter");
	}
}
}
