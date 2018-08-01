package solutions.common;

import org.junit.Assert;
import org.junit.Test;

public class CommonTest {
	
	public static void main(String[] args){
		
		//testIsaWholeNumber();
	}
	
	@Test
	public void testIsaWholeNumber() {
		// TODO Auto-generated method stub
		//Common common = new Common();
		Assert.assertFalse(Common.isWholeNumber(10.4));
		Assert.assertTrue(Common.isWholeNumber(10));
	}

}
