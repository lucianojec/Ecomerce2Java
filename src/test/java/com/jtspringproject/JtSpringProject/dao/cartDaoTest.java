/**
 * 
 */
package com.jtspringproject.JtSpringProject.dao;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.mockito.Mockito.mock;

import com.jtspringproject.JtSpringProject.models.Cart;
import java.util.List;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Test;

/**
 * Parasoft Jtest UTA: Test class for cartDao
 *
 * @see com.jtspringproject.JtSpringProject.dao.cartDao
 * @author Luciano
 */
public class cartDaoTest {

	/**
	 * Parasoft Jtest UTA: Test for setSessionFactory(SessionFactory)
	 *
	 * @see com.jtspringproject.JtSpringProject.dao.cartDao#setSessionFactory(SessionFactory)
	 * @author Luciano
	 */
	@Test
	public void testSetSessionFactory() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			cartDao underTest = new cartDao();

			// When
			SessionFactory sf = mock(SessionFactory.class);
			underTest.setSessionFactory(sf);

		});
	}

}
