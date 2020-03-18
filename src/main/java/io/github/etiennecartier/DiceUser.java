package io.github.etiennecartier;

public class DiceUser {

	public static TripletOfDice rollOnce() {
		TripletOfDice triplet = new TripletOfDice(6);
		triplet.rollAllDice();
		return triplet;
	}
	
	public static void main(String[] args) {
		TripletOfDice triplet = new TripletOfDice(6);
		triplet = rollOnce();
		System.out.println("The die number 1 is a " + triplet.getFirstDie());
		System.out.println("The die number 2 is a " + triplet.getSecondDie());
		System.out.println("The die number 3 is a " + triplet.getThirdDie());
	}
}
