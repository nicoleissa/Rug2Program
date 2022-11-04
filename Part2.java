/* Part2.java: Weaves a Kilim Carpet using methods, loops and nested loops  

Name: Nicole Issagholian

Date: 10/15/2021
*/

import java.util.Scanner;

public class Part2
{
	public static void main(String[] args)
	{
		//calls method minusPattern
		minusPattern();

		//calls method triplePlusPattern
		triplePlusPattern();

		//calls method doublePlusPattern
		doublePlusPattern();

		//calls method smallSquarePattern
		smallSquarePattern();

		//calls method doublePlusPattern
		doublePlusPattern();

		//calls method triplePlusPattern
		triplePlusPattern();

		//calls method minusPattern
		minusPattern();

		//calls method largePlusSquarePattern 
		largePlusSquarePattern();

		//calls method largeDiamondPattern
		largeDiamondPattern();

		//calls method largePlusSquarePattern 
		largePlusSquarePattern();

		//calls method minusPattern
		minusPattern();

		//calls method triplePlusPattern
		triplePlusPattern();

		//calls method doublePlusPattern
		doublePlusPattern();

		//calls method smallSquarePattern
		smallSquarePattern();

		//calls method doublePlusPattern
		doublePlusPattern();

		//calls method triplePlusPattern
		triplePlusPattern();

		//calls method minusPattern
		minusPattern();

	}	

	//method that prints single row of 30 minuses using for loop with nested for loop
	public static void minusPattern()
	{
		for (int rows=1; rows<=1; rows++)
		{
			for (int cols=1; cols<=30; cols++)
			{
				System.out.print("-");
			}
			System.out.println();
		}	
	}

	
	//method that prints single row of 4 sets of 3 pluses using for loop with nested for loops
	public static void triplePlusPattern()
	{
		for (int rows=1; rows<=1; rows++)
		{
			for (int repetitions=1; repetitions<=1; repetitions++)
			{	
				for (int spaces=0; spaces<=2; spaces++)
				{
					System.out.print(" ");
				}	
				for (int cols=1; cols<=3; cols++)
				{
					System.out.print("+");
				}
			}
			for (int repetitions=1; repetitions<=3; repetitions++)
			{	
				for (int spaces=0; spaces<=3; spaces++)
				{
					System.out.print(" ");
				}	
				for (int cols=1; cols<=3; cols++)
				{
					System.out.print("+");
				}
			}
		}	
		System.out.println();
	}


	//method that prints single row of 5 sets of 2 pluses using for loop with nested for loops
	public static void doublePlusPattern()
	{
		for (int rows=1; rows<=1; rows++)
		{
			for (int cols=1; cols<=2; cols++)
			{
				System.out.print("+");
			}
			for (int repetitions=1; repetitions<=4; repetitions++)
			{	
				for (int spaces=0; spaces<=4; spaces++)
				{
					System.out.print(" ");
				}	
				for (int cols=1; cols<=2; cols++)
				{
					System.out.print("+");
				}
			}
		}	
		System.out.println();
	}


	//method that prints 4 sets of squares using for loop with nested for loops
	public static void smallSquarePattern()
	{
		int rows;
		int repetitions; 
		int spaces;
		int cols;

		for (rows=1; rows<=2; rows++)
		{
			for (repetitions=1; repetitions<=1; repetitions++)
			{	
				for (spaces=0; spaces<=2; spaces++)
				{
					System.out.print(" ");
				}	
				for (cols=1; cols<=3; cols++)
				{
					System.out.print("X");
				}
			}	
			for (repetitions=1; repetitions<=3; repetitions++)
			{	
				for (spaces=0; spaces<=3; spaces++)
				{
					System.out.print(" ");
				}	
				for (cols=1; cols<=3; cols++)
				{
					System.out.print("X");
				}
			}
		System.out.println();
		}
	}


	//method that prints 2 large squares in the same row(s) using for loop with nested for loops
	public static void largePlusSquarePattern()
	{
		int rows;
		int repetitions;
		int cols;
		int spaces;

		for (rows=1; rows<=3; rows++)
		{
			for (repetitions=1; repetitions<=1; repetitions++)
			{	
				for (cols=1; cols<=5; cols++)
				{
					System.out.print("+");
				}
			}	
			for (repetitions=1; repetitions<=1; repetitions++)
			{	
				for (spaces=0; spaces<=19; spaces++)
				{
					System.out.print(" ");
				}	
				for (cols=1; cols<=5; cols++)
				{
					System.out.print("+");
				}
			}
		System.out.println();
		}
	}


	//method that prints a large diamond in the center using for loops with nested for loops
	public static void largeDiamondPattern()
	{
		final int max=5;
		int rows=1;
		int spaces;
		int cols;
		int spaceTwo=1;
		spaceTwo=max-rows;

		for(rows=1; rows<=max; rows++) 
		{
			for(cols=1; cols<=max-rows; cols++)
			{
				System.out.print(" ");	
			}
			spaceTwo--;
			for (spaces=0; spaces<=9; spaces++)
			{
				System.out.print(" ");
			}
			for(cols=1; cols<=(2*rows-1); cols++)
			{
				System.out.print('+');	
			}
			System.out.println("");
		}
		spaceTwo=1;


		for(rows=1; rows<=max-1; rows++)
		{
			for(cols=1; cols<=spaceTwo; cols++)
			{
				System.out.print(" ");	
			}
			spaceTwo++;
			for (spaces=0; spaces<=9; spaces++)
			{
				System.out.print(" ");
			}
			for (cols=1; cols<=(2*(max-rows)-1); cols++)
			{
				System.out.print("+");
			} 
			System.out.println("");
		}
	}
}
