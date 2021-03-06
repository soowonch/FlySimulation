
public class Fly implements EventHandler{
	private double Vx,Vy;//speed of the fly
	private Position pos;
	private static int totalNum;
	private static int killedNum;
	
	Fly(Room room) {
		//Cong: 'create' a fly, I though about assgin the position by hand, but it may be too many works.
		//		so it should be able to random generated 
		//		Room is a parameter to make sure it's inside the room
		//		see: http://www.geeksforgeeks.org/how-to-check-if-a-given-point-lies-inside-a-polygon/
	}
	
	private boolean isInsideRoom(Room room) {
		//Cong: helper method for Fly construtor;
		return true;
	}
	
	private void changeVel() {
		//Cong: called by handle() when issue a new event, determine velocity vector for the fly at next event
	}
	
	private void ChangeVelWhenRunIntoWall(Position lastPosition, Line wall) {
		//Cong: call by handle() in case of RunIntoWall, because the bounce back speed must be valid (direction)
		//		so it may call changeVel() several times until it's valid (check validity using last position)
		//		w1, w2 is two points to describe a wall.
	}
	
	private Position imaginaryRandomMoving() {
		//Cong: private method, assume fly flies in the current direction and generate a future position,
		// 		this position will be used to check if it's possible or not later.
		return new Position(0.0,0.0);
	}
	
	public void handle(Event event) {
		FlyEvent fe = (FlyEvent)event;
		/*Cong: let me make it clear, my idea is.
		 * 		handle an event means one event is over, the speed and position has been determined
		 * 		by last event, what next to do.
				for example, handling a random moving means fly is already at a new position and new velocity
				we generate a flyInThisDirection time randomly and compute the imaginaryRandomMoving, 
				determine what will be the next event.
				if it runs into the killer. issue a flyIntoTrap event,print some information and change statistics.
				if the path across with the boundary. issue a knockIntoWall event, and provide new velocity and position
				else, another randomMoving event;
				
				I think about different strategies and find this one works best, because the vel after knocking into wall
				need extra carefully processing to make sure the velocity is valid.
				if you have better idea about how to implement this, bring it up. thx.
		*/	
	}
	
	
	
	
	

}
