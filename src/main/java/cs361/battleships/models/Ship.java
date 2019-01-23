package cs361.battleships.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Ship {

	@JsonProperty private List<Square> occupiedSquares;
	private int size;
	private String kind;

	public Ship() {
		occupiedSquares = new ArrayList<>();
		size = 0;
		kind = "";
	}
	
	public Ship(String kind) {
		occupiedSquares = new ArrayList<>();
		this.kind = kind;
		if(kind == "MINESWEEPER") {
			this.size = 2;
		}
		else if (kind == "DESTROYER") {
			this.size = 3;
		}
		else if (kind == "BATTLESHIP") {
			this.size = 4;
		}
	}

	public List<Square> getOccupiedSquares() {
		return this.occupiedSquares;
	}
}
