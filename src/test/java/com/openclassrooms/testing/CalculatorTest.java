package com.openclassrooms.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.MessageFormat;
import java.time.Duration;
import java.time.Instant;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	private static Instant startedAt;

	private Calculator calculatorUnderTest;

	@BeforeAll
	static public void initStartingTime() {
		System.out.println("Appel avant tous les tests");
		startedAt = Instant.now();
		System.out.println("Instant started" + startedAt);
	}

	@AfterAll
	static public void showTestDuration() {
		System.out.println("Appel après tous les tests");
		Instant endedAt = Instant.now();
		long duration = Duration.between(startedAt, endedAt).toHours();
		System.out.println(MessageFormat.format("Durée des tests : {0} ms", duration));
	}

	@BeforeEach
	public void initCalculator() {
		System.out.println("Appel avant chaque test");
		calculatorUnderTest = new Calculator();
	}

	@AfterEach
	public void undefCalculator() {
		System.out.println("Appel après chaque test");
		calculatorUnderTest = null;
	}

	@Test
	public void testAddTwoPositiveNumbers() {
		// Arrange
		int a = 2;
		int b = 3;

		// Act
		int somme = calculatorUnderTest.add(a, b);

		// Assert
		assertEquals(5, somme);
	}

	@Test
	public void multiply_shouldReturnTheProduct_ofTwoIntegers() {
		// Arrange
		int a = 42;
		int b = 11;

		// Act
		int produit = calculatorUnderTest.multiply(a, b);

		// Assert
		assertEquals(462, produit);
	}

}
