package ss.week1;

public class Password extends java.lang.Object{
	public static final String INITIAL = "adminsz";
	public static final int MINLENGTH = 6;
	public String pass;
	
	public Password(){
		this.pass = INITIAL;
	}
	
	public boolean acceptable(String suggestion) {
		return (suggestion.length() >= MINLENGTH && !(suggestion.contains(" "))) ;

	}
	
	public boolean setWord (String oldpass, String newpass) {
		if (this.acceptable(newpass) && this.testWord(oldpass)) {
			this.pass = newpass;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean testWord(String test) {
		return (test.equals(pass)) ;
	}
			
}