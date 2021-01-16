import java.util.Scanner;

/*
* Author: cy.andersen
* Date: Jan. 16, 2021
* Description:Input four lines, each line having 4 space-separated integers, 
* and the output will specify if the "square" is either magic if the 
* input is a magic square, or not magic if the input is not a magic square.
*/

public class Magic_Squares
{

	public static void main(String[] args) 
	{
	        Scanner sc = new Scanner(System.in);
	        int[][] square = new int[4][4];
	        for(int i =0; i<4; i++) 
	        {
	            for(int l = 0;l<4;l++)
	            {
	            	square[i][l] = sc.nextInt();
	            	}
	            }
	       
	        int row0 = square[0][0] + square[0][1] + square[0][2] + square[0][3];
	        int row1 = square[1][0] + square[1][1] + square[1][2] + square[1][3];
	        int row2 = square[2][0] + square[2][1] + square[2][2] + square[2][3];
	        int row3 = square[3][0] + square[3][1] + square[3][2] + square[3][3];
	        int column0 = square[0][0] + square[1][0] + square[2][0] + square[3][0];
	        int column1 = square[0][1] + square[1][1] + square[2][1] + square[3][1];
	        int column2 = square[0][2] + square[1][2] + square[2][2] + square[3][2];
	        int column3 = square[0][3] + square[1][3] + square[2][3] + square[3][3];
	        
	        if(row0 == row1 && row1 == row2 && row2 == row3 && row3 == column0 && column0 == column1 && column1 == column2 && column2 == column3) 
	        {
	            System.out.println("Magic");    
	            }
	        else
	        {
	             System.out.println("Not Magic");
	             }
	        }
	}