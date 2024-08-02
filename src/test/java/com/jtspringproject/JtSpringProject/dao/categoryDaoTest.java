/**
 * 
 */
package com.jtspringproject.JtSpringProject.dao;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.mockito.Mockito.mock;

import com.jtspringproject.JtSpringProject.models.Category;
import java.util.List;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Test;

/**
 * Parasoft Jtest UTA: Test class for categoryDao
 *
 * @see com.jtspringproject.JtSpringProject.dao.categoryDao
 * @author Luciano
 */
public class categoryDaoTest {

	/**
	 * Parasoft Jtest UTA: Test for addCategory(String)
	 *
	 * @see com.jtspringproject.JtSpringProject.dao.categoryDao#addCategory(String)
	 * @author Luciano
	 */
	@Test
	public void testAddCategory() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			categoryDao underTest = new categoryDao();

			// When
			String name = "name"; // UTA: default value
			Category result = underTest.addCategory(name);

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for setSessionFactory(SessionFactory)
	 *
	 * @see com.jtspringproject.JtSpringProject.dao.categoryDao#setSessionFactory(SessionFactory)
	 * @author Luciano
	 */
	@Test
	public void testSetSessionFactory() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			categoryDao underTest = new categoryDao();

			// When
			SessionFactory sf = mock(SessionFactory.class);
			underTest.setSessionFactory(sf);

		});
	}

}
