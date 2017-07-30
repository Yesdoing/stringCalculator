package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class SplitTest {

	@Test
	public void splite() {
		String[] values = "1,2".split(",");
		assertEquals(new String[] {"1", "2"}, values);
	}

}
