package test.java;
import calc.java.RPNCalc;
import junit.framework.TestCase;

public class TestRPNTDD extends TestCase {
	
	public void testTwoValueoneOpt()
	{
		String expr = "1,2,+";
		RPNCalc  calc = new RPNCalc();
		assertEquals(3,calc.Calculate(expr));
		System.out.println(calc.Calculate(expr));
	}

	public void testTwoValueoneOptCross()
	{
		String expr = "2,2,*";
		RPNCalc  calc = new RPNCalc();
		assertEquals(4,calc.Calculate(expr));
		System.out.println(calc.Calculate(expr));
	}
	
}
