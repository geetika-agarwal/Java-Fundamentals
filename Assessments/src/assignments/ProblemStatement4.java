/* Problem Statement 4:

Here we have defined an abstract class Player and 3 sub-classes Bowler, Batsmen and WicketKeeper. 
We have added additional member variables and methods/functions in individual sub-classes. 
We have also created a constructor which initializes the member variables of the each player. 
The print method overrides the print method in the super-class Player and also add additional 
details for Bowler, Batsmen and WicketKeeper. 

Create an array of 11 players and initialized them with either Batsmen, Bowler and WicketKeeper 
and print their their details. Please make sure, we have made the Player class abstract such that 
no instance of that class can be created.

*************************************************************** */

package assignments;

abstract class Player {
	int playerNo;
	String playerName;

	Player() {
		super();
	}

	Player(int playerNo, String playerName) {
		this.playerNo = playerNo;
		this.playerName = playerName;
	}

	abstract void displayBasicDetails();
}

class Bowler extends Player {
	double bowlerSpeed;
	String typeOfBowler;

	Bowler() {
		super();
	}

	Bowler(int playerNo, String playerName, double bowlerSpeed, String typeOfBowler) {
		super(playerNo, playerName);
		this.bowlerSpeed = bowlerSpeed;
		this.typeOfBowler = typeOfBowler;
	}

	@Override
	public void displayBasicDetails() {
		System.out.println("The Player Number: " + playerNo);
		System.out.println("The Player Name: " + playerName);
	}

	public void bowlerDetails() {
		System.out.println("The Average Speed with which Bowler bowls: " + bowlerSpeed);
		System.out.println("The type of Bowler: " + typeOfBowler);
	}

	@Override
	public String toString() {
		return "Bowler [bowlerSpeed=" + bowlerSpeed + ", typeOfBowler=" + typeOfBowler;
	}
}

class Batsman extends Player {
	int highestInings;
	int yearsOfExperience;

	Batsman() {
		super();
	}

	Batsman(int playerNo, String playerName, int highestInings, int yearsOfExperience) {
		super(playerNo, playerName);
		this.highestInings = highestInings;
		this.yearsOfExperience = yearsOfExperience;
	}

	@Override
	public void displayBasicDetails() {
		System.out.println("The Player Number: " + playerNo);
		System.out.println("The Player Name: " + playerName);
	}

	public void batsmanDetails() {
		System.out.println("The highest Inings of the Batsman: " + this.highestInings);
		System.out.println("The Years of Experience: " + this.yearsOfExperience);
	}

	@Override
	public String toString() {
		return "Batsman [highestInings=" + highestInings + ", yearsOfExperience=" + yearsOfExperience;
	}
}

class WicketKeeper extends Player {
	int yearsOfExperience;

	WicketKeeper() {
		super();
	}

	WicketKeeper(int playerNo, String playerName, int yearsOfExperience) {
		super(playerNo, playerName);
		this.yearsOfExperience = yearsOfExperience;
	}

	@Override
	public void displayBasicDetails() {
		System.out.println("The Player Number: " + playerNo);
		System.out.println("The Player Name: " + playerName);
	}

	public void displayWicketKeeperDetails() {
		System.out.println("The Experience of the Wicket Keeper: " + this.yearsOfExperience);
	}

	@Override
	public String toString() {
		return "WicketKeeper [yearsOfExperience=" + yearsOfExperience;
	}
}

public class ProblemStatement4 {

	public static void main(String[] args) {
		Player[] players = new Player[11];

		players[0] = new WicketKeeper(11, "Wicket Keeper 1", 5);
		players[1] = new Batsman(1, "Batsman 1", 200, 4);
		players[2] = new Batsman(2, "Batsman 2", 210, 8);
		players[3] = new Batsman(3, "Batsman 3", 150, 2);
		players[4] = new Batsman(4, "Batsman 4", 250, 3);
		players[5] = new Batsman(5, "Batsman 5", 180, 6);
		players[6] = new Bowler(6, "Bowler 1", 120.31, "Fast Speed");
		players[7] = new Bowler(7, "Bowler 2", 117.28, "Fast Speed");
		players[8] = new Bowler(8, "Bowler 3", 27.61, "Spinner");
		players[9] = new Bowler(9, "Bowler 4", 50.89, "Bouncer");
		players[10] = new Bowler(10, "Bowler 5", 93.52, "Yorker");

		for (Player player : players) {
			player.displayBasicDetails();
			System.out.println(player);
			System.out.println("--------------------------------------------------------");
		}
	}

}
