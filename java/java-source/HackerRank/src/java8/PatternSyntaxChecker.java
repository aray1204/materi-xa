package java8;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {
	static final Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            }catch(PatternSyntaxException  e){
                System.out.println("Invalid");
            }
          	//Write your code
            testCases--;
		}
	}
}
