import java.util.Scanner;

/*
* Author: cy.andersen
* Date: Jan. 16, 2021
* Description: Program to calculate a distance table that indicates the distance 
* between any two of the five cities you encountered on your drive.
*/

public class Five_City
{
	public static void main(String[] args) 
	 {

        Scanner in = new Scanner(System.in);
        
       
       int[] city = new int[5];
       for(int i = 0; i < city.length; i++)
       {
           if(i == 0)
           {
           	city[i] = 0;
           }
           else
           {
           	city[i] = in.nextInt();
           	}
           }
       for(int i = 0; i < city.length; i++)
       {
           if(i == 0)
           {
           	city[i] = 0;
           }
           else
           {
           	city[i] += city[i - 1]; 
           	}
       }
       for(int i = 0; i < 5; i++)
       {
           System.out.print(Math.abs(city[i] - city[0]) + " ");
           System.out.print(Math.abs(city[i] - city[1]) + " ");
           System.out.print(Math.abs(city[i] - city[2]) + " ");
           System.out.print(Math.abs(city[i] - city[3]) + " ");
           System.out.print(Math.abs(city[i] - city[4]) + " \n"); 
           }
       }
	 }