/**
 * 
 */
package com.jtspringproject.JtSpringProject.dao;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.mockito.Mockito.mock;

import com.jtspringproject.JtSpringProject.models.User;
import java.util.List;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Test;

/**
 * Parasoft Jtest UTA: Test class for userDao
 *
 * @see com.jtspringproject.JtSpringProject.dao.userDao
 * @author Luciano
 */
public class userDaoTest {

	/**
	 * Parasoft Jtest UTA: Test for setSessionFactory(SessionFactory)
	 *
	 * @see com.jtspringproject.JtSpringProject.dao.userDao#setSessionFactory(SessionFactory)
	 * @author Luciano
	 */
	@Test
	public void testSetSessionFactory() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			userDao underTest = new userDao();

			// When
			SessionFactory sf = mock(SessionFactory.class);
			underTest.setSessionFactory(sf);

		});
	}

}
