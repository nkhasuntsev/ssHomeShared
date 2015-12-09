package ss.week2.hotel;

import java.util.ArrayList;

public class Hotel {
	//@ private invariant password != null;
	private Password password;
	//@ private invariant rooms != null;
	private ArrayList<Room> rooms;
	//@ private invariant hotelName != null;
	private String hotelName;
	
	public Hotel(String hotelName ,int roomCount, String password){
		this.hotelName = hotelName;
		this.rooms = new ArrayList<Room>();
		this.password = new Password();
		this.password.setWord(Password.INITIAL, password);
		for (int i = 0; i < roomCount; i++){
			this.rooms.add(new Room(i));
		}
	}
	//@ ensures getPassword().testWord(password)?getRoom(guestName) == \result : \result == null;
	public Room checkIn(String password, String guestName){
		if (this.password.testWord(password) && getRoom(guestName) == null){
			Room freeRoom = getFreeRoom();
			if(freeRoom != null){
				Guest guest = new Guest(guestName);
				guest.checkin(freeRoom);
				return freeRoom;				
			}
		}
		return null;		
	}
	//@ ensures getRoom(guestName) == null;
	public void checkOut(String guestName){
		Room room = getRoom(guestName);
		if (room != null){
			room.getGuest().checkout();
	    	
	    	room.getSafe().deactivate();
		}
		assert getRoom(guestName) == null;
	}
	//@ pure;
	public Room getFreeRoom(){
		for (int i = 0; i < this.rooms.size(); i++){
			if (this.rooms.get(i).getGuest() == null){
				return this.rooms.get(i);
			}
		}
		return null;
	}
	//@ pure;
	public Room getRoom(String guestName){
		for (int i = 0; i < this.rooms.size(); i++){
			if (this.rooms.get(i).getGuest()!= null && this.rooms.get(i).getGuest().getName() == guestName){
				return this.rooms.get(i);
			}
		}
		return null;
	}
	//@ pure;
	public Password getPassword(){
		return this.password;
	}
	//@ pure;
	public String toString(){
		String returnString = "Ik ben een hotel, genaamd: "+ this.hotelName + ". Ik heb gasten, genaamd: ";
		for (int i = 0; i < this.rooms.size(); i++){
			if (this.rooms.get(i).getGuest() != null){
				returnString += this.rooms.get(i).getGuest().getName()+", ";
			}
		}
		returnString += "cool he?";
		
		return returnString;
	}
	
	
	
}