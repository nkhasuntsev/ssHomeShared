package ss.week2;

public class RectangleTest {
	public Rectangle rectangle1;
	public boolean testSuccessfull;
	public RectangleTest(){
		rectangle1 = new Rectangle(100,200);
		testSuccessfull = true;
		testSuccessfull = testSuccessfull && assertEquals("rectangle1.length()", 100, rectangle1.length());
		testSuccessfull = testSuccessfull && assertEquals("rectangle1.width()", 200, rectangle1.width());
		testSuccessfull = testSuccessfull && assertEquals("rectangle1.area()", 200*100, rectangle1.area());
		testSuccessfull = testSuccessfull && assertEquals("rectangle1.perimiter()", 2*200+2*100, rectangle1.perimiter());
	}
	
	public static void main(String[] args){
		System.out.println("--Test Started--");
		RectangleTest rectangleTest = new RectangleTest();
		rectangleTest.conclude();
	}
	public void conclude(){
		System.out.println("--Test Results--");
		if (this.testSuccessfull){
			System.out.println("All tests returned the expected values");
		}
		else {
			System.out.println("Some tests did not return the expected value");
		}
		
	}
	
    private boolean assertEquals(String text, Object expected, Object result) {
    	System.out.println("        " + text);
    	System.out.println("            Expected:  " + expected);
    	System.out.println("            Result: " + result);
    	System.out.println("            Equal: " + (expected.equals(result)));
    	return expected.equals(result);
    }

}