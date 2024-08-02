/**
 * 
 */
package com.jtspringproject.JtSpringProject.dao;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.mockito.Mockito.mock;

import com.jtspringproject.JtSpringProject.models.CartProduct;
import com.jtspringproject.JtSpringProject.models.Product;
import java.util.List;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Test;

/**
 * Parasoft Jtest UTA: Test class for cartProductDao
 *
 * @see com.jtspringproject.JtSpringProject.dao.cartProductDao
 * @author Luciano
 */
public class cartProductDaoTest {

	/**
	 * Parasoft Jtest UTA: Test for getProductByCartID(Integer)
	 *
	 * @see com.jtspringproject.JtSpringProject.dao.cartProductDao#getProductByCartID(Integer)
	 * @author Luciano
	 */
	@Test
	public void testGetProductByCartID() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			cartProductDao underTest = new cartProductDao();

			// When
			Integer cart_id = 0; // UTA: default value
			List<Product> result = underTest.getProductByCartID(cart_id);

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for setSessionFactory(SessionFactory)
	 *
	 * @see com.jtspringproject.JtSpringProject.dao.cartProductDao#setSessionFactory(SessionFactory)
	 * @author Luciano
	 */
	@Test
	public void testSetSessionFactory() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			cartProductDao underTest = new cartProductDao();

			// When
			SessionFactory sf = mock(SessionFactory.class);
			underTest.setSessionFactory(sf);

		});
	}

}
