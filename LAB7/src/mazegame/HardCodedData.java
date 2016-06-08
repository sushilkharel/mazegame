package mazegame;

import mazegame.boundary.IMazeData;
import mazegame.entity.Exit;
import mazegame.entity.Location;

public class HardCodedData implements IMazeData {
	private Location startUp;
	
	public HardCodedData()
	{
		createLocations();
	}
	
	public Location getStartingLocation()
	{
		return startUp;
	}
	
	public String getWelcomeMessage()
	{
		return "Welcome to the Mount Helanous";
	}
	
	private void createLocations () 
	{
		startUp = new Location ("an office with paper strewn everywhere, how anyone can work here effectively is a mystery", "Julies Office");
		Location lounge = new Location ("an open space containing comfortable looking couches and artwork", "Airport Lounge");
		Location t127 = new Location ("a lecture theatre", "T127");
		Location gregsOffice = new Location ("a spinning vortex of terror", "Greg's Office");
		Location staffroom = new Location ("a room for staff to keep rest", "Staff Room");
		
		// Connect Locations
		startUp.addExit("south",  new Exit ("you see an open space to the south", lounge));
		lounge.addExit("north", new Exit("you see a mound of paper to the north", startUp));

        startUp.addExit("west", new Exit("you see a terrifying office to the west", gregsOffice));
        gregsOffice.addExit("east", new Exit("you see a mound of paper to the east", startUp));

        t127.addExit("south", new Exit("you see a mound of paper to the south", startUp));
        startUp.addExit("north", new Exit("you see a bleak place to the north", t127));
        
        staffroom.addExit("west", new Exit("you see a room of staff to the west", staffroom));
        startUp.addExit("east", new Exit("you see place to east", startUp));
       

        lounge.addExit("northwest", new Exit("you see a terrifying office to the northwest", gregsOffice));
        gregsOffice.addExit("southeast", new Exit("you see an open space to the southeast", lounge));
        
        
			
	}
}
