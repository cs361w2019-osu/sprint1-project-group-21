package cs361.battleships.models;

import java.util.ArrayList;
import java.util.List;

public class Board {

	// private List<Square> squares ????

	/*
	DO NOT change the signature of this method. It is used by the grading scripts.
	 */
	public Board() {
		// TODO Implement
		// 2-d array of Square objects
		// nested loops to create columns A-J and rows 1-10
		// square constructor: public Square(int row, char column)
	}

	/*
	DO NOT change the signature of this method. It is used by the grading scripts.
	 */
	public boolean placeShip(Ship ship, int x, char y, boolean isVertical) {
		// TODO Implement
		// the coordinate should be the top/left square
		// create a loop dependent on ship. minesweeper = 2 checks,
		// destroyer = 3 checks, battleship = 4 checks
		// ship.type = an int representing this, so "for i = 0, i < ship.type, i++"
		// if row is less than 1 or greater than 10, return false
		// if col is less than A or greater than J, return false
		// SEEMS AWFUL TO LOOP THROUGH ALL OCCUPIEDSPACES OF EACH SHIP
		// COULD ADD BOOLEAN VARIABLE TO SQUARE CALLED "ISOCCUPIED" AND CHECK FOR THAT
		// WHEN SHIP IS PLACED, EACH SQUARE'S ISOCCUPIED CHANGED TO TRUE
		// so either check ifOccupied of that square (need variable at top to access?)
		// or loop through "getShips", each will have a list of Occupied Squares

		return false; // if cannot be done
	}

	/*
	DO NOT change the signature of this method. It is used by the grading scripts.
	 */
	public Result attack(int x, char y) {
		//TODO Implement
		// GETS attacked, so check if x,y is occupied
		// if not, MISS
		// if so:
		// // then change ship's hitSpaces
		// // then check if all occupied spaces are hit
		// // if so:
		// // // check all ship's hitSpaces. as soon as one is not hit, then SUNK
		// // // but if all ship's hitSpaces are hit, then SURRENDER
		// // if not, then just HIT
		return null;
	}

	public List<Ship> getShips() {
		//TODO implement
		// will need this for checking if ...
		return null;
	}

	public void setShips(List<Ship> ships) {
		//TODO implement
		// what does this mean? how are we "setting" ships?

	}

	public List<Result> getAttacks() {
		//TODO implement
		// also confusing, what does this mean?
		// if it's a list of results.. how do we even use this
		return null;
	}

	public void setAttacks(List<Result> attacks) {
		//TODO implement
	}
}
