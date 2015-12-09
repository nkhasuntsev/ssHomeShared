package ss.week2.hotel;


/**
	 * Class Guest for the Hotel exercise.
	 * Lab Exercise SoftwareSystems
	 * @author Niek Khasuntsev & Martijn Linders
	 * @version 1
*/

public class Guest {
	private java.lang.String guest;
	private Room room;
	
	/**
    * Creates a <code>guest</code> with a given string as name, without a room.
    * @param no name of the new <code>guest</code>
    */
	
	public Guest(String n) {
		guest = n;
	}
	
	 /**
    * Returns the name of this <code>guest</code>.
    */
	
	public String getName() {
		return guest;
	}
	
	 /**
    * Returns the room of this <code>guest</code>.
    */
	public Room getRoom() {
		return room;
	}

	/**
    * Rents a room for this <code>guest</code>.
    * @param r 
    */
	public boolean checkin(Room r){
		if (room == null && r.getGuest() == null){
			room = r;
			r.setGuest(this);
			return true;
		}
		else {
			return false;
		}
		
	}
	/**
    * Set the room of this <code>guest</code> to null.
    */
	public boolean checkout () {
		if (room != null) {
			room.setGuest(null);
			room = null;
			return true;
		}
		else{
			return false;
		}
		
	}
	/**
	 * Denotes name and room number of this <code>guest</code> respectively.
	 */
	
	public String toString(){
		return "Guest: " + guest ;
	}
}
