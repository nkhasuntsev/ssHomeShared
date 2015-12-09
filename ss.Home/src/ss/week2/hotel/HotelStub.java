package ss.week2.hotel;

public class HotelStub {
	public class Hotel {
		
		//@ ensures getPassword().testWord(password)?getRoom(guestName) == \result : \result == null;
		public Room checkIn(String password, String guestName){
			return null;
		}
		//@ ensures getRoom(guestName) == null;
		public void checkOut(String guestName){
			
			assert getRoom(guestName) == null;
		}
		//@ pure;
		public Room getFreeRoom(){
			return null;
		}
		//@ pure;
		public Room getRoom(String guestName){
			return null;
		}
		//@ pure;
		public Password getPassword(){
			return null;
		}
		//@ pure;
		public String toString(){
			return "DIT IS EEN HOTEL";
		}
		
	}
		
}