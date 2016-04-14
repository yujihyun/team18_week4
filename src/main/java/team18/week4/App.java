package team18.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
class App {
	static Scanner in = new Scanner(System.in);
	static InputStreamReader insr = new InputStreamReader(System.in);
	static BufferedReader inbr = new BufferedReader(insr);
	
	static String checkPlan(String plan) throws IOException{
		
		while(!(plan.equals("Gold")|| plan.equals("gold") || plan.equals("Silver") || plan.equals("silver"))){
			System.out.print("Plan: ");
			plan = inbr.readLine();
		}
		return plan;
	}
	
	static int checkMinute(int usedMinute) throws IOException{
		
		while(usedMinute<0){
			System.out.print("Minutes Used: ");
			usedMinute = in.nextInt();
		}
			
		return usedMinute;
	}
	
	static int checkLine(int numberLine) throws IOException{
		while(numberLine<0){
			System.out.print("Number of Lines: ");
			numberLine = in.nextInt();
		}	
		return numberLine;
	}
	
	
	public static void main(String[] args) throws IOException{


		String plan;
		int usedMinute;
		int numberLine;
		
		System.out.print("Plan: ");
		plan = inbr.readLine();
		plan=checkPlan(plan);
			
		System.out.print("Minutes Used: ");
		usedMinute = in.nextInt();
		usedMinute = checkMinute(usedMinute);
			
		System.out.print("Number of Lines: ");
		numberLine = in.nextInt();
		numberLine = checkLine(numberLine);
		
	}	
	
	
}