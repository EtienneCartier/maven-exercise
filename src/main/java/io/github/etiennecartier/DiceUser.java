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
		System.out.println(triplet);
	}
}
