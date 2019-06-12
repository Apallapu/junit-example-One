package com.poc;

/**
 * Hello world!
 *
 */
public class App {

	public String concat(String one, String two) {
		return one + two;

	}

	public Boolean checkIsName(String one) {

		if ("ankamma".equals(one)) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	public String isObjectNotNull() {
		return new String("ankamma");

	}

	public String isObjectNull() {
		String s = null;
		return s;

	}

	public int checkNullEx() {
		String s = null;
		return s.length();

	}

	public int checkAirthMetingEx() {

		int a = 0;
		int b = 10;
		int c = b / a;
		return c;
	}

	public int checkArrayIndexEx() {

		int marks[] = { 40, 50, 60 };
		int m1 = marks[3]; // permitted index numbers are 0, 1 and 2

		return m1;
	}
}
