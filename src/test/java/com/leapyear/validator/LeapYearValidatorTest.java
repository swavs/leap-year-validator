package com.leapyear.validator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Leap year validator class
 */
public class LeapYearValidatorTest {

	@Test(expected = IllegalArgumentException.class)
	public void isLeapYearWithInavlidInput() {
		// since earliest adopted year is 1582, starting with it as the valid lower
		// bound value
		int year = 1580;
		boolean expectedResult = false;
		LeapYearValidator validator = new LeapYearValidator();
		boolean result = validator.isLeapYear(year);
		Assert.assertEquals(expectedResult, result);
	}

	@Test
	public void isLeapYearWithNonLeapYear() {
		boolean expectedResult = false;
		int years[] = { 2001, 2100, 2011, 2018 };
		LeapYearValidator validator = new LeapYearValidator();
		for (int year : years) {
			boolean result = validator.isLeapYear(year);
			Assert.assertEquals(expectedResult, result);
		}
	}

	@Test
	public void isLeapYearWithLeapYear() {
		boolean expectedResult = true;
		int years[] = { 2000, 2012, 2020 };
		LeapYearValidator validator = new LeapYearValidator();
		for (int year : years) {
			boolean result = validator.isLeapYear(year);
			Assert.assertEquals(expectedResult, result);
		}
	}
}
