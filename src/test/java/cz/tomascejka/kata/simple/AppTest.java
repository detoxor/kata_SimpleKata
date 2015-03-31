package cz.tomascejka.kata.simple;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AppTest 
{

	private App tested;
	
	@Before
	public void setUp() throws Exception
	{
		tested = new App();
	}
	
	@Test
	public void testRun()
	{
		Assert.assertEquals(true, tested.run());
	}
}
