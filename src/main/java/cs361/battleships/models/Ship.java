package cs361.battleships.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Ship {

	@JsonProperty private List<Square> occupiedSquares;

	//Constructor, called when init in main
	public Ship(){

		occupiedSquares = new ArrayList<>();
	}
	
	public Ship(String kind) {
		//TODO implement
		//Take a name or model of a ship and return that string somewhere

	}

	public List<Square> getOccupiedSquares() {
		//TODO implement
		//Perhaps system.out.println() for debugging
		//Could also provide a visual rep of occupied squares to the user
		//Set the color of occupied squares to red
		return null;
	}
}
