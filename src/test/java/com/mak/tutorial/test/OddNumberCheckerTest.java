package com.mak.tutorial.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.mak.tutorial.OddNumberChecker;

@RunWith(Parameterized.class)
public class OddNumberCheckerTest {

	private int number;
	private boolean expectedResult;
	private OddNumberChecker oddNumberChecker;

	@Before
	public void initialize() {
		oddNumberChecker = new OddNumberChecker();
	}

	public OddNumberCheckerTest(int number, boolean expectedResult) {
		this.number = number;
		this.expectedResult = expectedResult;

	}

	@Parameterized.Parameters
	public static Collection<Object[]> mixedNumbers() {
		return Arrays.asList(new Object[][] { { 2, false }, { 6, false },
				{ 19, true }, { 22, false }, { 23, true } });
	}

	@Test
	public void testIsValidOddNumber() {
		System.out.println("Parameterized Number is : " + number);
		assertEquals(expectedResult, oddNumberChecker.isValidOddNumber(number));
	}

}
