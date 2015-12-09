package ss.week2;

public class Rectangle{
	//@ private invariant length >= 0;
	private int length;
	//@ private invariant width >= 0;
	private int width;
	
	//@ requires length > 0 && width > 0; 
	//@ ensures length() == length && width() == width;
	public Rectangle(int length, int width){
		this.length = length;
		this.width = width;	
		
		
		assert length > 0 ;
		assert width > 0;
		assert length() == length && width() == width ;
	
	}
	
	//---------Queries---------:
	

	//@ ensures \result > 0;  
	/*@ pure*/ public int length(){
		return this.length;
		
	}

	//@ ensures \result > 0;
	/*@ pure*/ public int width(){
		return this.width;
	}

	//@ ensures \result > 0; 
	/*@ pure*/public int area(){
		assert length() * width() == length * width;
		return this.length*this.width;
		
	}
	
	//@ ensures \result > 0; 
	/*@ pure*/public int perimiter(){
		
		assert 2*length() + 2*width() == 2*length + 2*width;
		
		return 2*(this.length + this.width);
	}
	
	public static void main(String[] args){
		
	}
}