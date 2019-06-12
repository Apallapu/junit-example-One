package com.poc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class AppTest {

	App app;

	@Before
	public void init() {

		System.out.println("BEFORE TEST()");
		app = new App();

	}

	@After
	public void finish() {
		System.out.println("AFTER TEST()");
		app = null;

	}

	@Ignore
	@Test
	public void concatTest() {

		assertEquals("ankammaraju", app.concat("ankamma", "raju"));

	}

	@Test
	public void checkIsNameTrueTest() {

		assertTrue(app.checkIsName("ankamma"));

	}

	@Test
	public void checkIsNameFalseTest() {

		assertFalse(app.checkIsName("ankammaRaju"));

	}

	@Test
	public void isObjectNotNullTest() {
		System.out.println("IN TEST METHOD()");
		assertNotNull(app.isObjectNotNull());

	}

	@Test
	public void isObjectNullTest() {
		System.out.println("IN TEST METHOD()");
		assertNull(app.isObjectNull());

	}

	@Ignore
	@Test(expected = NullPointerException.class)
	public void checkNullExCase() {
		System.out.println("IN TEST METHOD()");
		app.checkNullEx();

	}

	@Test(expected = ArithmeticException.class)
	public void checkAirthMetingExTest() {
		System.out.println("IN TEST METHOD()");
		assertNull(app.checkAirthMetingEx());

	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void checkArrayIndexExTest() {
		System.out.println("IN TEST METHOD()");
		assertNull(app.checkArrayIndexEx());

	}

}
