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
<<<<<<< HEAD:week4/src/main/java/team18/week4/App.java
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
=======
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		InputStreamReader insr = new InputStreamReader(System.in);
		BufferedReader inbr = new BufferedReader(insr);

		String plan;
		int usedMinute;
		int numberLine;
		
		logger.log("Plan: ");
		plan = inbr.readLine();
		
		while(!(plan.equals("Gold")|| plan.equals("gold") || plan.equals("Silver") || plan.equals("silver"))){
			logger.log("다시 입력하세요.");
			logger.log("Plan: ");
			plan = inbr.readLine();
		}
		
		logger.log("Minutes Used: ");
		usedMinute = in.nextInt();
		
		while(usedMinute<0){
			logger.log("다시 입력하세요.");
			logger.log("Minutes Used: ");
			usedMinute = in.nextInt();
		}
				
		logger.log("Number of Lines: ");
		numberLine = in.nextInt();
		while(usedMinute<0){
			logger.log("다시 입력하세요.");
			logger.log("Number of Lines: ");
			numberLine = in.nextInt();
		}
		
	}	
>>>>>>> df69839b763282e78b7e184fb50bc2e236730665:Homework/src/main/java/Team_18/Homework/App.java
}
