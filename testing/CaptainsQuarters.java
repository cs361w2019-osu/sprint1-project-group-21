public class CaptainsQuarters(){
	
	//Constructor to init a ship
	public CaptainsQuarters{
		
		Ship s = new Ship();
		Console con;
	
	}

	//Psudo code for implementing captains quarters into the game
	private int getShipSize(Object myShip){
		
		return myShip.size();
		
	}
	//set the captains quarters
	public void setCaptainsQuarters(int loc, Object myShip){
		
		if(loc < getShipSize(s)){
			
			//change damage to 2x as before as it takes two hits at this location 
			//to take down a ship
			myShip[loc].damage = 2;
			//Logging to our gui console for the user
			con.log("you have placed the captain's quarters for " myShip.name " at " myShip[loc] "\n" ); 
			
			
		}
		else{
			
			//Error handling here
			//Tell the user that we cannot place quarters on the OOB location
			system.out.println("User cannot place quarters here");
			con.log("Cannot place Captain's Quarters at this location\n");
		
		}
	
	}
	//Generic function to get the location of the location of the captains quarters
	private int getCaptainsQuartersLoc(Object myShip , int loc){
		
		return myShip[loc];
		
	}

}