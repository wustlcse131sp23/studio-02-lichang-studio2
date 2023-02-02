package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Starting balance:");
		double startAmount = in.nextDouble();
		System.out.println("Win probability:");
		double winChance = in.nextDouble();
		System.out.println("Win limit:");
		double winLimit = in.nextDouble();
		System.out.println("Days to simulate:");
		double totalSimulations = in.nextDouble();
		double daysRuined = 0;
		double daysWon = 0;
		
				
	
		for (double x = totalSimulations ; x > 0; x--)
		{
		double currentAmount = startAmount;
		while (currentAmount < winLimit && currentAmount > 0)
		{
		double generatedOdds = Math.random();
		boolean gambleWin = generatedOdds < winChance;
		{	
		if (gambleWin)
		{
			currentAmount++; 
		}
		if (!gambleWin)
		{
			currentAmount--;
		}
		if (currentAmount == winLimit)
		{
			daysRuined++;
		}
		if (currentAmount == 0)
		{
			daysWon++;
		}
		}
		}
		}
		double ruinRate = (double)(daysRuined / totalSimulations)*100/100;
		System.out.println("Days simulated: " + totalSimulations);
		System.out.println("Successful Days: " + daysWon);
		System.out.println("Ruin Days: " + daysRuined);
		System.out.println("Ruin rate: " + ruinRate*100 + "%");
	}

}
