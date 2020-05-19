package com.leapyear.validator;

import java.util.HashMap;
import java.util.Map;

/**
 * Leap year validator class
 *
 */
public class LeapYearValidator {

	public boolean isLeapYear(int year) {
		if (year < 1582) {
			throw new IllegalArgumentException("Year cannot be before 1582!"); 
		}
		if (year % 400 == 0) {
			return true;
		} else if (year % 100 == 0) {
			return false;
		} else if (year % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
