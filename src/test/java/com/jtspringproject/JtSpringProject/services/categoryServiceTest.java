/**
 * 
 */
package com.jtspringproject.JtSpringProject.services;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

import com.jtspringproject.JtSpringProject.models.Category;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * Parasoft Jtest UTA: Test class for categoryService
 *
 * @see com.jtspringproject.JtSpringProject.services.categoryService
 * @author Luciano
 */
public class categoryServiceTest {

	/**
	 * Parasoft Jtest UTA: Test for addCategory(String)
	 *
	 * @see com.jtspringproject.JtSpringProject.services.categoryService#addCategory(String)
	 * @author Luciano
	 */
	@Test
	public void testAddCategory() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			categoryService underTest = new categoryService();

			// When
			String name = "name"; // UTA: default value
			Category result = underTest.addCategory(name);

		});
	}

}
