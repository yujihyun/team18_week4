package team18.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		InputStreamReader insr = new InputStreamReader(System.in);
		BufferedReader inbr = new BufferedReader(insr);
		Display display;

		String plan;
		int usedMinute;
		int numberLine;
		
		System.out.print("Plan: ");
		plan = inbr.readLine();
		
		while(!("Gold".equals(plan) || "gold".equals(plan) || "Silver".equals(plan) || "silver".equals(plan))){
			System.out.print("다시 입력하세요.");
			System.out.print("Plan: ");
			plan = inbr.readLine();
		}
		
		System.out.print("Minutes Used: ");
		usedMinute = in.nextInt();
		
		while(usedMinute<0){
			System.out.print("다시 입력하세요.");
			System.out.print("Minutes Used: ");
			usedMinute = in.nextInt();
		}
				
		System.out.print("Number of Lines: ");
		numberLine = in.nextInt();
		while(numberLine<0){
			System.out.print("다시 입력하세요.");
			System.out.print("Number of Lines: ");
			numberLine = in.nextInt();
		}
		
		display = new Display(plan, usedMinute, numberLine);	
		display.displayResult();
		
		in.close();
		
	}	
}