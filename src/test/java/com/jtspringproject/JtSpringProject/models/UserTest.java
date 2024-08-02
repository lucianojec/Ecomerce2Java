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
 * Parasoft Jtest UTA: Test class for User
 *
 * @see com.jtspringproject.JtSpringProject.models.User
 * @author Luciano
 */
public class UserTest {

	/**
	 * Parasoft Jtest UTA: Test for getAddress()
	 *
	 * @see com.jtspringproject.JtSpringProject.models.User#getAddress()
	 * @author Luciano
	 */
	@Test
	public void testGetAddress() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			User underTest = new User();

			// When
			String result = underTest.getAddress();

			// Then - assertions for result of method getAddress()
			assertNull(result);

			// Then - assertions for this instance of User
			assertAll(() -> {
				assertEquals(0, underTest.getId());
			}, () -> {
				assertNull(underTest.getUsername());
			}, () -> {
				assertNull(underTest.getEmail());
			}, () -> {
				assertNull(underTest.getPassword());
			}, () -> {
				assertNull(underTest.getRole());
			});

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for getEmail()
	 *
	 * @see com.jtspringproject.JtSpringProject.models.User#getEmail()
	 * @author Luciano
	 */
	@Test
	public void testGetEmail() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			User underTest = new User();

			// When
			String result = underTest.getEmail();

			// Then - assertions for result of method getEmail()
			assertNull(result);

			// Then - assertions for this instance of User
			assertAll(() -> {
				assertEquals(0, underTest.getId());
			}, () -> {
				assertNull(underTest.getUsername());
			}, () -> {
				assertNull(underTest.getPassword());
			}, () -> {
				assertNull(underTest.getRole());
			}, () -> {
				assertNull(underTest.getAddress());
			});

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for getId()
	 *
	 * @see com.jtspringproject.JtSpringProject.models.User#getId()
	 * @author Luciano
	 */
	@Test
	public void testGetId() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			User underTest = new User();

			// When
			int result = underTest.getId();

			// Then - assertions for result of method getId()
			assertEquals(0, result);

			// Then - assertions for this instance of User
			assertAll(() -> {
				assertNull(underTest.getUsername());
			}, () -> {
				assertNull(underTest.getEmail());
			}, () -> {
				assertNull(underTest.getPassword());
			}, () -> {
				assertNull(underTest.getRole());
			}, () -> {
				assertNull(underTest.getAddress());
			});

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for getPassword()
	 *
	 * @see com.jtspringproject.JtSpringProject.models.User#getPassword()
	 * @author Luciano
	 */
	@Test
	public void testGetPassword() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			User underTest = new User();

			// When
			String result = underTest.getPassword();

			// Then - assertions for result of method getPassword()
			assertNull(result);

			// Then - assertions for this instance of User
			assertAll(() -> {
				assertEquals(0, underTest.getId());
			}, () -> {
				assertNull(underTest.getUsername());
			}, () -> {
				assertNull(underTest.getEmail());
			}, () -> {
				assertNull(underTest.getRole());
			}, () -> {
				assertNull(underTest.getAddress());
			});

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for getRole()
	 *
	 * @see com.jtspringproject.JtSpringProject.models.User#getRole()
	 * @author Luciano
	 */
	@Test
	public void testGetRole() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			User underTest = new User();

			// When
			String result = underTest.getRole();

			// Then - assertions for result of method getRole()
			assertNull(result);

			// Then - assertions for this instance of User
			assertAll(() -> {
				assertEquals(0, underTest.getId());
			}, () -> {
				assertNull(underTest.getUsername());
			}, () -> {
				assertNull(underTest.getEmail());
			}, () -> {
				assertNull(underTest.getPassword());
			}, () -> {
				assertNull(underTest.getAddress());
			});

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for getUsername()
	 *
	 * @see com.jtspringproject.JtSpringProject.models.User#getUsername()
	 * @author Luciano
	 */
	@Test
	public void testGetUsername() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			User underTest = new User();

			// When
			String result = underTest.getUsername();

			// Then - assertions for result of method getUsername()
			assertNull(result);

			// Then - assertions for this instance of User
			assertAll(() -> {
				assertEquals(0, underTest.getId());
			}, () -> {
				assertNull(underTest.getEmail());
			}, () -> {
				assertNull(underTest.getPassword());
			}, () -> {
				assertNull(underTest.getRole());
			}, () -> {
				assertNull(underTest.getAddress());
			});

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for setAddress(String)
	 *
	 * @see com.jtspringproject.JtSpringProject.models.User#setAddress(String)
	 * @author Luciano
	 */
	@Test
	public void testSetAddress() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			User underTest = new User();

			// When
			String address = "address"; // UTA: default value
			underTest.setAddress(address);

			// Then - assertions for this instance of User
			assertAll(() -> {
				assertEquals(0, underTest.getId());
			}, () -> {
				assertNull(underTest.getUsername());
			}, () -> {
				assertNull(underTest.getEmail());
			}, () -> {
				assertNull(underTest.getPassword());
			}, () -> {
				assertNull(underTest.getRole());
			}, () -> {
				assertEquals("address", underTest.getAddress());
			});

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for setEmail(String)
	 *
	 * @see com.jtspringproject.JtSpringProject.models.User#setEmail(String)
	 * @author Luciano
	 */
	@Test
	public void testSetEmail() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			User underTest = new User();

			// When
			String email = "email"; // UTA: default value
			underTest.setEmail(email);

			// Then - assertions for this instance of User
			assertAll(() -> {
				assertEquals(0, underTest.getId());
			}, () -> {
				assertNull(underTest.getUsername());
			}, () -> {
				assertEquals("email", underTest.getEmail());
			}, () -> {
				assertNull(underTest.getPassword());
			}, () -> {
				assertNull(underTest.getRole());
			}, () -> {
				assertNull(underTest.getAddress());
			});

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for setId(int)
	 *
	 * @see com.jtspringproject.JtSpringProject.models.User#setId(int)
	 * @author Luciano
	 */
	@Test
	public void testSetId() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			User underTest = new User();

			// When
			int id = 0; // UTA: default value
			underTest.setId(id);

			// Then - assertions for this instance of User
			assertAll(() -> {
				assertEquals(0, underTest.getId());
			}, () -> {
				assertNull(underTest.getUsername());
			}, () -> {
				assertNull(underTest.getEmail());
			}, () -> {
				assertNull(underTest.getPassword());
			}, () -> {
				assertNull(underTest.getRole());
			}, () -> {
				assertNull(underTest.getAddress());
			});

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for setPassword(String)
	 *
	 * @see com.jtspringproject.JtSpringProject.models.User#setPassword(String)
	 * @author Luciano
	 */
	@Test
	public void testSetPassword() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			User underTest = new User();

			// When
			String password = "password"; // UTA: default value
			underTest.setPassword(password);

			// Then - assertions for this instance of User
			assertAll(() -> {
				assertEquals(0, underTest.getId());
			}, () -> {
				assertNull(underTest.getUsername());
			}, () -> {
				assertNull(underTest.getEmail());
			}, () -> {
				assertEquals("password", underTest.getPassword());
			}, () -> {
				assertNull(underTest.getRole());
			}, () -> {
				assertNull(underTest.getAddress());
			});

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for setRole(String)
	 *
	 * @see com.jtspringproject.JtSpringProject.models.User#setRole(String)
	 * @author Luciano
	 */
	@Test
	public void testSetRole() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			User underTest = new User();

			// When
			String role = "role"; // UTA: default value
			underTest.setRole(role);

			// Then - assertions for this instance of User
			assertAll(() -> {
				assertEquals(0, underTest.getId());
			}, () -> {
				assertNull(underTest.getUsername());
			}, () -> {
				assertNull(underTest.getEmail());
			}, () -> {
				assertNull(underTest.getPassword());
			}, () -> {
				assertEquals("role", underTest.getRole());
			}, () -> {
				assertNull(underTest.getAddress());
			});

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for setUsername(String)
	 *
	 * @see com.jtspringproject.JtSpringProject.models.User#setUsername(String)
	 * @author Luciano
	 */
	@Test
	public void testSetUsername() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			User underTest = new User();

			// When
			String username = "username"; // UTA: default value
			underTest.setUsername(username);

			// Then - assertions for this instance of User
			assertAll(() -> {
				assertEquals(0, underTest.getId());
			}, () -> {
				assertEquals("username", underTest.getUsername());
			}, () -> {
				assertNull(underTest.getEmail());
			}, () -> {
				assertNull(underTest.getPassword());
			}, () -> {
				assertNull(underTest.getRole());
			}, () -> {
				assertNull(underTest.getAddress());
			});

		});
	}
}
