/**
 * 
 */
package com.jtspringproject.JtSpringProject.services;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.mockito.Mockito.mock;

import com.jtspringproject.JtSpringProject.models.Product;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * Parasoft Jtest UTA: Test class for productService
 *
 * @see com.jtspringproject.JtSpringProject.services.productService
 * @author Luciano
 */
public class productServiceTest {

	/**
	 * Parasoft Jtest UTA: Test for addProduct(Product)
	 *
	 * @see com.jtspringproject.JtSpringProject.services.productService#addProduct(Product)
	 * @author Luciano
	 */
	@Test
	public void testAddProduct() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			productService underTest = new productService();

			// When
			Product product = mock(Product.class);
			Product result = underTest.addProduct(product);

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for updateProduct(int, Product)
	 *
	 * @see com.jtspringproject.JtSpringProject.services.productService#updateProduct(int, Product)
	 * @author Luciano
	 */
	@Test
	public void testUpdateProduct() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			productService underTest = new productService();

			// When
			int id = 0; // UTA: default value
			Product product = mock(Product.class);
			Product result = underTest.updateProduct(id, product);

		});
	}
}
