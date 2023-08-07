package day3;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class Excep5 {
    void readFile() 
    	throws FileNotFoundException{
    		FileReader f=new FileReader("123.txt");
    	}
     
    
    public static void main(String[] args) {
		Excep5 q=new Excep5();
		try {
			q.readFile();
		}
		catch(FileNotFoundException e) {
			System.out.println("file not found"  );
		}
	}
}
