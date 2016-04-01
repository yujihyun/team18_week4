package Team_18.Homework;

import java.io.*;
import java.util.*;

public class phoneInput {
    
   public static void main(String[] args) throws IOException{
      Scanner in = new Scanner(System.in);
      InputStreamReader insr = new InputStreamReader(System.in);
      BufferedReader inbr = new BufferedReader(insr);

      String plan;
      int usedMinute;
      int numberLine;
      
      System.out.print("Plan: ");
      plan = inbr.readLine();
      
      while(!(plan.equals("Gold")|| plan.equals("gold") || plan.equals("Silver") || plan.equals("silver"))){
         System.out.println("다시 입력하세요.");
         System.out.print("Plan: ");
         plan = inbr.readLine();
      }
      
      System.out.print("Minutes Used: ");
      usedMinute = in.nextInt();
      
      while(usedMinute<0){
         System.out.println("다시 입력하세요.");
         System.out.print("Minutes Used: ");
         usedMinute = in.nextInt();
      }
            
      System.out.print("Number of Lines: ");
      numberLine = in.nextInt();
      while(usedMinute<0){
         System.out.println("다시 입력하세요.");
         System.out.print("Number of Lines: ");
         numberLine = in.nextInt();
      }
      
   }   
   
}