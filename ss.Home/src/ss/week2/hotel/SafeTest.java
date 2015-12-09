package ss.week2.hotel;

import org.junit.*;

import static org.junit.Assert.*;
import ss.week2.hotel.Safe;

import org.junit.Test;

public class SafeTest {
	public Safe safe1;
	
	@Before
	public void setUp(){
		safe1 = new Safe("testWachtwoord");
	}

	@Test
	public void test() {
		//tests the safe
		safe1.activate("testWachtwoord");
		assertEquals("activate 1", true, safe1.isActive());
		safe1.close();
		assertEquals("test 1 closed", false, safe1.isOpen());
		safe1.open("foutTestWachtwoord");
		assertEquals("wrong password open", false, safe1.isOpen());
		safe1.deactivate();
		assertEquals("wrong password deactivate", false, safe1.isActive());
		safe1.open("testWachtwoord");
		assertEquals("right password open", true, safe1.isOpen());
		safe1.deactivate();
		assertEquals("right password deactivate", false, safe1.isActive());
		safe1.open("");
		assertEquals("open while inactive, assumes previous test was true", true, safe1.isOpen());
		safe1.close();
		safe1.close();
		assertEquals("closes while closed", false, safe1.isOpen());		
		

	}

}


