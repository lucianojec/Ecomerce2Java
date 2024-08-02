/**
 * 
 */
package com.jtspringproject.JtSpringProject.models;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

import org.junit.jupiter.api.Test;

/**
 * Parasoft Jtest UTA: Test class for Category
 *
 * @see com.jtspringproject.JtSpringProject.models.Category
 * @author Luciano
 */
public class CategoryTest {

	/**
	 * Parasoft Jtest UTA: Test for getId()
	 *
	 * @see com.jtspringproject.JtSpringProject.models.Category#getId()
	 * @author Luciano
	 */
	@Test
	public void testGetId() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			Category underTest = new Category();

			// When
			int result = underTest.getId();

			// Then - assertions for result of method getId()
			assertEquals(0, result);

			// Then - assertions for this instance of Category
			assertNull(underTest.getName());

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for getName()
	 *
	 * @see com.jtspringproject.JtSpringProject.models.Category#getName()
	 * @author Luciano
	 */
	@Test
	public void testGetName() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			Category underTest = new Category();

			// When
			String result = underTest.getName();

			// Then - assertions for result of method getName()
			assertNull(result);

			// Then - assertions for this instance of Category
			assertEquals(0, underTest.getId());

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for setId(int)
	 *
	 * @see com.jtspringproject.JtSpringProject.models.Category#setId(int)
	 * @author Luciano
	 */
	@Test
	public void testSetId() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			Category underTest = new Category();

			// When
			int id = 0; // UTA: default value
			underTest.setId(id);

			// Then - assertions for this instance of Category
			assertAll(() -> {
				assertEquals(0, underTest.getId());
			}, () -> {
				assertNull(underTest.getName());
			});

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for setName(String)
	 *
	 * @see com.jtspringproject.JtSpringProject.models.Category#setName(String)
	 * @author Luciano
	 */
	@Test
	public void testSetName() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			Category underTest = new Category();

			// When
			String name = "name"; // UTA: default value
			underTest.setName(name);

			// Then - assertions for this instance of Category
			assertAll(() -> {
				assertEquals(0, underTest.getId());
			}, () -> {
				assertEquals("name", underTest.getName());
			});

		});
	}
}
