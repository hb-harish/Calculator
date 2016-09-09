import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalc {

	@Test
	public void add_test() {
		Calculator c = new Calculator();
		double result = c.add(3, 2);
		assertTrue(result==5);
	}
	@Test
	public void sub_test()
	{
	Calculator c = new Calculator();
	double result = c.sub(3, 2);
		assertTrue(result==1);
	}
	@Test
	public void mult_test()
	{
	Calculator c = new Calculator();
	double result = c.mult(3, 2);
	assertTrue(result==6);
	}
	@Test
	public void div_test()
	{
		Calculator c = new Calculator();
		double result = c.div(3, 2);
		assertTrue(result==1.5);
	}
	@Test
	public void mod_test()
	{
		Calculator c = new Calculator();
		double result = c.mod(3, 2);
		assertTrue(result==1);
	}

}
