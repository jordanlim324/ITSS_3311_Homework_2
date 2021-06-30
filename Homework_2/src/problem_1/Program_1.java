package problem_1;

import java.util.Scanner;

public class Program_1
{
	/*
	 * Created by Jordan Lim
	 */
	public static void main(String[] args) 
	{
		Scanner kbreader = new Scanner (System.in);
		int month;
		double revenue = 0;
		int totmonth = 0;
		int endrev = 0;
		// declaring data types
		do
		{
			System.out.println("Type in the Month (Month 1 = 1, Month 2 = 2, etc.) "
					+ "and revenue gained and press 'Enter' to continue:");
			month = kbreader.nextInt();
			revenue = kbreader.nextFloat();
			if(revenue < 0 || month < 0)
			{
				while(revenue < 0 || month < 0)
				{
					System.out.println("One or more inputs are negative! "
						+ "Type in the Month (Month 1 = 1, Month 2 = 2, etc.)"
						+ "and revenue gained and press 'Enter' to continue:");
				month = kbreader.nextInt();
				revenue = kbreader.nextFloat();
				}
			}
			endrev += revenue;
			totmonth++;
		}
		while (endrev < 1000000);
	kbreader.close();
	System.out.println("It took " + totmonth + " month(s) for revenue to reach $1,000,000.");
	}
}


