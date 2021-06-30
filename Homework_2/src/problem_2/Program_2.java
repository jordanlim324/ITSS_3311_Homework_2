package problem_2;

import java.util.Scanner;

public class Program_2 
{
	/*
	 * Created by Jordan Lim
	 */
	public static void main(String[] args) 
	{
		Scanner kbreader = new Scanner(System.in);
		float loanamt = 0;
		int loanperiod = 0;
		float annualinterestrate = 0;
		double monthlyinterestrate = 0;
		double monthlypayment = 0;
		double totalpayment = 0;
		double totalinterest = 0;
		
		System.out.println("Enter in your loan amount, the loan period in months, and the annual interest rate (i.e. 4.25 % = 4.25)."
				+ " Press 'Enter' to continue.");
		loanamt = kbreader.nextFloat();
		loanperiod = kbreader.nextInt();
		annualinterestrate = kbreader.nextFloat();
		do
		{
			System.out.printf("Your loan amount, loan period, and your annual interest rate is: " 
					+ "%.2f" + "	" + "%d" + "	" + "%.2f%% %n" , loanamt, loanperiod, annualinterestrate);
		} 
		while (loanamt < 0 || loanperiod < 0 || annualinterestrate < 0);
		monthlyinterestrate = ((annualinterestrate / 100) / 12);
		monthlypayment = ((loanamt * monthlyinterestrate) / (1 - (1 / Math.pow (1 + monthlyinterestrate, loanperiod))));
		totalpayment = monthlypayment * loanperiod;
		totalinterest = totalpayment - loanamt;
		System.out.printf("Your monthly payment and your total interest is: " + "%.2f" + "	" + "%.2f" + "	", monthlypayment, totalinterest);
		kbreader.close();
	}

}
