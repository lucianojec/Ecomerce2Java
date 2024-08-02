/**
 * 
 */
package com.jtspringproject.JtSpringProject;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

import org.junit.jupiter.api.Test;

/**
 * Parasoft Jtest UTA: Test class for JtSpringProjectApplication
 *
 * @see com.jtspringproject.JtSpringProject.JtSpringProjectApplication
 * @author Luciano
 */
public class JtSpringProjectApplicationTest {

	/**
	 * Parasoft Jtest UTA: Test for main(String[])
	 *
	 * @see com.jtspringproject.JtSpringProject.JtSpringProjectApplication#main(String[])
	 * @author Luciano
	 */
	@Test
	public void testMain() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// When
			String[] args = new String[0]; // UTA: default value
			JtSpringProjectApplication.main(args);

		});
	}
}
