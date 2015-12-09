package ss.week2.hotel;


public class Safe {
	private Password password;
	private boolean active;
	private boolean open;
	public Safe(String password){
		this.open = false;
		
		this.active = false;
		this.password = new Password();
		this.active = this.password.setWord(Password.INITIAL, password);
	}
	/*@ ensures getPassword().testWord(password)?
	 isActive() == true
	 : isActive() == \old(isActive()); 
	 */
	public void activate(String password){
		if (this.password.testWord(password)){
			this.active = true;
			}
		assert (getPassword().testWord(password)?isActive() == true: true);				
	}
	//@ requires isOpen() == true;
	//@ ensures isActive() == false;
	public void deactivate(){
		this.active = false;
		close();
	}
		
	/*@ ensures isActive()?(
	 getPassword().testWord(password)?
	 isOpen() == true
	 : isOpen() == \old(isOpen()))
	 : isOpen() == true; 
	 */
	public void open(String password){
		if (this.active){
			if (this.password.testWord(password)){
				this.open = true;
			}
		} 
		
		assert (isActive()?(getPassword().testWord(password)?isActive() == true: true):isActive() == true);		
	}
	//@ ensures isOpen() == false;
	public void close(){
		this.open = false;
	}
	//@ pure;
	public boolean isOpen(){
		return this.open;
	}
	//@ pure;
	public boolean isActive(){
		return this.active;
	}
	//@ pure;
	public Password getPassword(){
		return this.password;
	}
	public static void main(String[] args){
		Safe safe = new Safe("Bananen");
		safe.activate("Hello");
	
	}

}