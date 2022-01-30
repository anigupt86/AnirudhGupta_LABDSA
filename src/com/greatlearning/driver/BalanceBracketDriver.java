package com.greatlearning.driver;

//importing packages
import com.greatlearning.service.BalanceBracketService;
import java.util.Scanner;

//Driver Class
public class BalanceBracketDriver{

	public static void main(String[] args) {
		
		//Service Class object
		BalanceBracketService balancebracketService = new BalanceBracketService();
		
		Scanner sc = new Scanner(System.in);
		
		//User input for bracket sequence
		System.out.println("Enter the string of brackets");
		String bracketstring = sc.nextLine();
		
		//check variable
		boolean check = false;
        
		//checking balance bracket
		if(bracketstring.length()>1) {
			check = balancebracketService.balancebracket(bracketstring);
			if(check == true) {
				System.out.println("The entered string has balance brackets");
				}
			else {
				System.out.println("The entered string do not contain balance brackets");
			}
		}
		else {
			System.out.println("The entered string do not contain balance brackets");
		}
	}
}
