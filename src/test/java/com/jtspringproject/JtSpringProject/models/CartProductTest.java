/**
 * 
 */
package com.jtspringproject.JtSpringProject.models;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

/**
 * Parasoft Jtest UTA: Test class for CartProduct
 *
 * @see com.jtspringproject.JtSpringProject.models.CartProduct
 * @author Luciano
 */
public class CartProductTest {

	/**
	 * Parasoft Jtest UTA: Test for getCart()
	 *
	 * @see com.jtspringproject.JtSpringProject.models.CartProduct#getCart()
	 * @author Luciano
	 */
	@Test
	public void testGetCart() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			CartProduct underTest = new CartProduct();

			// When
			Cart result = underTest.getCart();

			// Then - assertions for result of method getCart()
			assertNull(result);

			// Then - assertions for this instance of CartProduct
			assertAll(() -> {
				assertEquals(0, underTest.getId());
			}, () -> {
				assertNull(underTest.getProduct());
			});

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for getId()
	 *
	 * @see com.jtspringproject.JtSpringProject.models.CartProduct#getId()
	 * @author Luciano
	 */
	@Test
	public void testGetId() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			CartProduct underTest = new CartProduct();

			// When
			int result = underTest.getId();

			// Then - assertions for result of method getId()
			assertEquals(0, result);

			// Then - assertions for this instance of CartProduct
			assertAll(() -> {
				assertNull(underTest.getCart());
			}, () -> {
				assertNull(underTest.getProduct());
			});

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for getProduct()
	 *
	 * @see com.jtspringproject.JtSpringProject.models.CartProduct#getProduct()
	 * @author Luciano
	 */
	@Test
	public void testGetProduct() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			CartProduct underTest = new CartProduct();

			// When
			Product result = underTest.getProduct();

			// Then - assertions for result of method getProduct()
			assertNull(result);

			// Then - assertions for this instance of CartProduct
			assertAll(() -> {
				assertEquals(0, underTest.getId());
			}, () -> {
				assertNull(underTest.getCart());
			});

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for setCart(Cart)
	 *
	 * @see com.jtspringproject.JtSpringProject.models.CartProduct#setCart(Cart)
	 * @author Luciano
	 */
	@Test
	public void testSetCart() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			CartProduct underTest = new CartProduct();

			// When
			Cart cart = mock(Cart.class);
			underTest.setCart(cart);

			// Then - assertions for this instance of CartProduct
			assertAll(() -> {
				assertEquals(0, underTest.getId());
			}, () -> {
				assertNotNull(underTest.getCart());
			}, () -> {
				assertNull(underTest.getProduct());
			});

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for setId(int)
	 *
	 * @see com.jtspringproject.JtSpringProject.models.CartProduct#setId(int)
	 * @author Luciano
	 */
	@Test
	public void testSetId() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			CartProduct underTest = new CartProduct();

			// When
			int id = 0; // UTA: default value
			underTest.setId(id);

			// Then - assertions for this instance of CartProduct
			assertAll(() -> {
				assertEquals(0, underTest.getId());
			}, () -> {
				assertNull(underTest.getCart());
			}, () -> {
				assertNull(underTest.getProduct());
			});

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for setProduct(Product)
	 *
	 * @see com.jtspringproject.JtSpringProject.models.CartProduct#setProduct(Product)
	 * @author Luciano
	 */
	@Test
	public void testSetProduct() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			CartProduct underTest = new CartProduct();

			// When
			Product product = mock(Product.class);
			underTest.setProduct(product);

			// Then - assertions for this instance of CartProduct
			assertAll(() -> {
				assertEquals(0, underTest.getId());
			}, () -> {
				assertNull(underTest.getCart());
			}, () -> {
				assertNotNull(underTest.getProduct());
			});

		});
	}
}
