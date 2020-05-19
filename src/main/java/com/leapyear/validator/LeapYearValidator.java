package com.leapyear.validator;

/**
 * Leap year validator class
 *
 */
public class LeapYearValidator {

	public boolean isLeapYear(int year) {

		if (year < 1582) {
			throw new IllegalArgumentException("Year cannot be before 1582!");
		}
		// TODO Add a condition to check if year % 4000 == 0, if yes return true.
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
