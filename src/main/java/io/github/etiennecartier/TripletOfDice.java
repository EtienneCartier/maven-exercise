package io.github.etiennecartier;

public class TripletOfDice {
	
	private int sides;
	private int die1;
	private int die2;
	private int die3;
	
	TripletOfDice(int side) {
		this.sides = side;
		this.die1 = 0;
		this.die2 = 0;
		this.die3 = 0;
	}
	
	/**
	 * This function get the value of the first die of the Triplet.
	 * 
	 * @return value of die1
	 */
	public int getFirstDie() {
		return die1;
	}
	
	/**
	 * This function get the value of the second die of the Triplet.
	 * 
	 * @return value of die2
	 */
	public int getSecondDie() {
		return die2;
	}
	
	/**
	 * This function get the value of the third die of the Triplet.
	 * 
	 * @return value of die3
	 */
	public int getThirdDie() {
		return die3;
	}
	
	
	/**
	 * This function simulates a roll of all the three dice of the Triplet.
	 * 
	 */
	public void rollAllDice() {
		this.die1 = (int)(Math.random() * (this.sides)) + 1;
		this.die2 = (int)(Math.random() * (this.sides)) + 1;
		this.die3 = (int)(Math.random() * (this.sides)) + 1;
	}
	
	
	/**
	 * This function simulates a roll of a chosen die of the Triplet.
	 * 
	 * @param dieNumber correspond to the number of the chosen die. If not in (1, 2, 3), does not change anything.
	 */
	public void rollOneDie(int dieNumber) {
		switch(dieNumber) {
		case 1:
			this.die1 = (int)(Math.random() * (this.sides)) + 1;
			break;
		case 2:
			this.die2 = (int)(Math.random() * (this.sides)) + 1;
			break;
		case 3:
			this.die3 = (int)(Math.random() * (this.sides)) + 1;
			break;
		default:
			System.out.println("Invalid die number, the TripletOfDice has not been modified");
			break;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
