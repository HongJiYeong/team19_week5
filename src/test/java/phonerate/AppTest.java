package phonerate;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase{
	TotalRate total;
	User user;
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public AppTest( String testName ){
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()	{
		return new TestSuite( AppTest.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()	{
		assertTrue( true );
	}
	public void testGoldNoLine(){
		user=new User("gold", 0, 0);
		total=new TotalRate(user);
		assertEquals(0.0,total.totalrate(),10);
		assertEquals(0.0,total.planrate(),10);
		assertEquals(0.0,total.excessminuterate(),10); 
		assertEquals(0.0,total.additionallinerate(),10);
		assertEquals(0.0,total.familyrate(),10);
	}
	public void testSilverNoLine(){
		user=new User("silver", 0, 0);
		total=new TotalRate(user);
		assertEquals(0.0,total.totalrate(),10);
		assertEquals(0.0,total.planrate(),10);
		assertEquals(0.0,total.excessminuterate(),10); 
		assertEquals(0.0,total.additionallinerate(),10);
		assertEquals(0.0,total.familyrate(),10);
	}
}