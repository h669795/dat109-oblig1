package Oblig1;

import java.util.Random;

public class Dice {

	private Random ran = new Random();

	/*
	 * Return verdi fra 1-6
	 */
	public int roll() {
		return ran.nextInt(1, 7);
	}
}
