/**
 * 
 */
package com.jtspringproject.JtSpringProject.models;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

/**
 * Parasoft Jtest UTA: Test class for Cart
 *
 * @see com.jtspringproject.JtSpringProject.models.Cart
 * @author Luciano
 */
public class CartTest {

	/**
	 * Parasoft Jtest UTA: Test for getCustomer()
	 *
	 * @see com.jtspringproject.JtSpringProject.models.Cart#getCustomer()
	 * @author Luciano
	 */
	@Test
	public void testGetCustomer() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			Cart underTest = new Cart();

			// When
			User result = underTest.getCustomer();

			// Then - assertions for result of method getCustomer()
			assertNull(result);

			// Then - assertions for this instance of Cart
			assertEquals(0, underTest.getId());

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for getId()
	 *
	 * @see com.jtspringproject.JtSpringProject.models.Cart#getId()
	 * @author Luciano
	 */
	@Test
	public void testGetId() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			Cart underTest = new Cart();

			// When
			int result = underTest.getId();

			// Then - assertions for result of method getId()
			assertEquals(0, result);

			// Then - assertions for this instance of Cart
			assertNull(underTest.getCustomer());

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for setCustomer(User)
	 *
	 * @see com.jtspringproject.JtSpringProject.models.Cart#setCustomer(User)
	 * @author Luciano
	 */
	@Test
	public void testSetCustomer() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			Cart underTest = new Cart();

			// When
			User customer = mock(User.class);
			underTest.setCustomer(customer);

			// Then - assertions for this instance of Cart
			assertAll(() -> {
				assertEquals(0, underTest.getId());
			}, () -> {
				assertNotNull(underTest.getCustomer());
			});

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for setId(int)
	 *
	 * @see com.jtspringproject.JtSpringProject.models.Cart#setId(int)
	 * @author Luciano
	 */
	@Test
	public void testSetId() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			Cart underTest = new Cart();

			// When
			int id = 0; // UTA: default value
			underTest.setId(id);

			// Then - assertions for this instance of Cart
			assertAll(() -> {
				assertEquals(0, underTest.getId());
			}, () -> {
				assertNull(underTest.getCustomer());
			});

		});
	}
}
