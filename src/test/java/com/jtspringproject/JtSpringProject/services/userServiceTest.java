/**
 * 
 */
package com.jtspringproject.JtSpringProject.services;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.mockito.Mockito.mock;

import com.jtspringproject.JtSpringProject.models.User;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * Parasoft Jtest UTA: Test class for userService
 *
 * @see com.jtspringproject.JtSpringProject.services.userService
 * @author Luciano
 */
public class userServiceTest {

	/**
	 * Parasoft Jtest UTA: Test for addUser(User)
	 *
	 * @see com.jtspringproject.JtSpringProject.services.userService#addUser(User)
	 * @author Luciano
	 */
	@Test
	public void testAddUser() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			userService underTest = new userService();

			// When
			User user = mock(User.class);
			User result = underTest.addUser(user);

		});
	}

}
