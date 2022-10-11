package MODULE_2.SET_1;

import java.util.Scanner;

 public class QuartsToGallons {
 
     public static void main(String[] args) {
         final int NUMBER_OF_QUARTS = 4;
         int paintingJobQuarts;

         Scanner inputDevice = new Scanner(System.in);
         try{
         System.out.println("How many quarts of paint do you need for the job?");
         paintingJobQuarts = inputDevice.nextInt();
         
         int gallons = paintingJobQuarts / NUMBER_OF_QUARTS;
         int quarts = paintingJobQuarts % NUMBER_OF_QUARTS;
         
         System.out.println("A job that needs " + paintingJobQuarts + " quarts requires "
                 + gallons + " gallons and " + quarts + " quarts of paint.");
         }catch(Exception e){
             System.out.println("Invalid data entry");
         }
     }
 
 }
