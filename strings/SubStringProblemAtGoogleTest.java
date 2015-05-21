package strings;

import org.junit.Assert;
import org.junit.Test;

public class SubStringProblemAtGoogleTest {
	@Test
	public void shouldReturnFalseFor_abab() {
		// set
		String input = "abab";
		
		// execute
		boolean actual = SubStringProblemAtGoogle.isMultipleSubString(input);

		// assert
		Assert.assertTrue(actual);
	}
	
	@Test
	public void shouldReturnFalseFor_abcdabcd() {
		// set
		String input = "abcdabcd";
		
		// execute
		boolean actual = SubStringProblemAtGoogle.isMultipleSubString(input);

		// assert
		Assert.assertTrue(actual);
	}
	
	@Test
	public void shouldReturnFalseFor_zzxzzxzzx() {
		// set
		String input = "zzxzzxzzx";
		
		// execute
		boolean actual = SubStringProblemAtGoogle.isMultipleSubString(input);

		// assert
		Assert.assertTrue(actual);
	}
	
	@Test
	public void shouldReturnFalseFor_abac() {
		// set
		String input = "abac";
		
		// execute
		boolean actual = SubStringProblemAtGoogle.isMultipleSubString(input);

		// assert
		Assert.assertFalse(actual);
	}
	
	@Test
	public void shouldReturnFalseFor_abcdabbd() {
		// set
		String input = "abcdabbd";
		
		// execute
		boolean actual = SubStringProblemAtGoogle.isMultipleSubString(input);

		// assert
		Assert.assertFalse(actual);
	}
	
	@Test
	public void shouldReturnFalseFor_zzxzzxxzz() {
		// set
		String input = "zzxzzxxzz";
		
		// execute
		boolean actual = SubStringProblemAtGoogle.isMultipleSubString(input);

		// assert
		Assert.assertFalse(actual);
	}
}
