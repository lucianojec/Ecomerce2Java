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
 * Parasoft Jtest UTA: Test class for Product
 *
 * @see com.jtspringproject.JtSpringProject.models.Product
 * @author Luciano
 */
public class ProductTest {

	/**
	 * Parasoft Jtest UTA: Test for getCategory()
	 *
	 * @see com.jtspringproject.JtSpringProject.models.Product#getCategory()
	 * @author Luciano
	 */
	@Test
	public void testGetCategory() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			Product underTest = new Product();

			// When
			Category result = underTest.getCategory();

			// Then - assertions for result of method getCategory()
			assertNull(result);

			// Then - assertions for this instance of Product
			assertAll(() -> {
				assertEquals(0, underTest.getId());
			}, () -> {
				assertNull(underTest.getName());
			}, () -> {
				assertNull(underTest.getImage());
			}, () -> {
				assertEquals(0, underTest.getQuantity());
			}, () -> {
				assertEquals(0, underTest.getPrice());
			}, () -> {
				assertEquals(0, underTest.getWeight());
			}, () -> {
				assertNull(underTest.getDescription());
			});

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for getDescription()
	 *
	 * @see com.jtspringproject.JtSpringProject.models.Product#getDescription()
	 * @author Luciano
	 */
	@Test
	public void testGetDescription() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			Product underTest = new Product();

			// When
			String result = underTest.getDescription();

			// Then - assertions for result of method getDescription()
			assertNull(result);

			// Then - assertions for this instance of Product
			assertAll(() -> {
				assertEquals(0, underTest.getId());
			}, () -> {
				assertNull(underTest.getName());
			}, () -> {
				assertNull(underTest.getImage());
			}, () -> {
				assertNull(underTest.getCategory());
			}, () -> {
				assertEquals(0, underTest.getQuantity());
			}, () -> {
				assertEquals(0, underTest.getPrice());
			}, () -> {
				assertEquals(0, underTest.getWeight());
			});

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for getId()
	 *
	 * @see com.jtspringproject.JtSpringProject.models.Product#getId()
	 * @author Luciano
	 */
	@Test
	public void testGetId() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			Product underTest = new Product();

			// When
			int result = underTest.getId();

			// Then - assertions for result of method getId()
			assertEquals(0, result);

			// Then - assertions for this instance of Product
			assertAll(() -> {
				assertNull(underTest.getName());
			}, () -> {
				assertNull(underTest.getImage());
			}, () -> {
				assertNull(underTest.getCategory());
			}, () -> {
				assertEquals(0, underTest.getQuantity());
			}, () -> {
				assertEquals(0, underTest.getPrice());
			}, () -> {
				assertEquals(0, underTest.getWeight());
			}, () -> {
				assertNull(underTest.getDescription());
			});

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for getImage()
	 *
	 * @see com.jtspringproject.JtSpringProject.models.Product#getImage()
	 * @author Luciano
	 */
	@Test
	public void testGetImage() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			Product underTest = new Product();

			// When
			String result = underTest.getImage();

			// Then - assertions for result of method getImage()
			assertNull(result);

			// Then - assertions for this instance of Product
			assertAll(() -> {
				assertEquals(0, underTest.getId());
			}, () -> {
				assertNull(underTest.getName());
			}, () -> {
				assertNull(underTest.getCategory());
			}, () -> {
				assertEquals(0, underTest.getQuantity());
			}, () -> {
				assertEquals(0, underTest.getPrice());
			}, () -> {
				assertEquals(0, underTest.getWeight());
			}, () -> {
				assertNull(underTest.getDescription());
			});

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for getName()
	 *
	 * @see com.jtspringproject.JtSpringProject.models.Product#getName()
	 * @author Luciano
	 */
	@Test
	public void testGetName() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			Product underTest = new Product();

			// When
			String result = underTest.getName();

			// Then - assertions for result of method getName()
			assertNull(result);

			// Then - assertions for this instance of Product
			assertAll(() -> {
				assertEquals(0, underTest.getId());
			}, () -> {
				assertNull(underTest.getImage());
			}, () -> {
				assertNull(underTest.getCategory());
			}, () -> {
				assertEquals(0, underTest.getQuantity());
			}, () -> {
				assertEquals(0, underTest.getPrice());
			}, () -> {
				assertEquals(0, underTest.getWeight());
			}, () -> {
				assertNull(underTest.getDescription());
			});

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for getPrice()
	 *
	 * @see com.jtspringproject.JtSpringProject.models.Product#getPrice()
	 * @author Luciano
	 */
	@Test
	public void testGetPrice() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			Product underTest = new Product();

			// When
			int result = underTest.getPrice();

			// Then - assertions for result of method getPrice()
			assertEquals(0, result);

			// Then - assertions for this instance of Product
			assertAll(() -> {
				assertEquals(0, underTest.getId());
			}, () -> {
				assertNull(underTest.getName());
			}, () -> {
				assertNull(underTest.getImage());
			}, () -> {
				assertNull(underTest.getCategory());
			}, () -> {
				assertEquals(0, underTest.getQuantity());
			}, () -> {
				assertEquals(0, underTest.getWeight());
			}, () -> {
				assertNull(underTest.getDescription());
			});

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for getQuantity()
	 *
	 * @see com.jtspringproject.JtSpringProject.models.Product#getQuantity()
	 * @author Luciano
	 */
	@Test
	public void testGetQuantity() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			Product underTest = new Product();

			// When
			int result = underTest.getQuantity();

			// Then - assertions for result of method getQuantity()
			assertEquals(0, result);

			// Then - assertions for this instance of Product
			assertAll(() -> {
				assertEquals(0, underTest.getId());
			}, () -> {
				assertNull(underTest.getName());
			}, () -> {
				assertNull(underTest.getImage());
			}, () -> {
				assertNull(underTest.getCategory());
			}, () -> {
				assertEquals(0, underTest.getPrice());
			}, () -> {
				assertEquals(0, underTest.getWeight());
			}, () -> {
				assertNull(underTest.getDescription());
			});

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for getWeight()
	 *
	 * @see com.jtspringproject.JtSpringProject.models.Product#getWeight()
	 * @author Luciano
	 */
	@Test
	public void testGetWeight() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			Product underTest = new Product();

			// When
			int result = underTest.getWeight();

			// Then - assertions for result of method getWeight()
			assertEquals(0, result);

			// Then - assertions for this instance of Product
			assertAll(() -> {
				assertEquals(0, underTest.getId());
			}, () -> {
				assertNull(underTest.getName());
			}, () -> {
				assertNull(underTest.getImage());
			}, () -> {
				assertNull(underTest.getCategory());
			}, () -> {
				assertEquals(0, underTest.getQuantity());
			}, () -> {
				assertEquals(0, underTest.getPrice());
			}, () -> {
				assertNull(underTest.getDescription());
			});

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for setCategory(Category)
	 *
	 * @see com.jtspringproject.JtSpringProject.models.Product#setCategory(Category)
	 * @author Luciano
	 */
	@Test
	public void testSetCategory() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			Product underTest = new Product();

			// When
			Category category = mock(Category.class);
			underTest.setCategory(category);

			// Then - assertions for this instance of Product
			assertAll(() -> {
				assertEquals(0, underTest.getId());
			}, () -> {
				assertNull(underTest.getName());
			}, () -> {
				assertNull(underTest.getImage());
			}, () -> {
				assertNotNull(underTest.getCategory());
			}, () -> {
				assertEquals(0, underTest.getQuantity());
			}, () -> {
				assertEquals(0, underTest.getPrice());
			}, () -> {
				assertEquals(0, underTest.getWeight());
			}, () -> {
				assertNull(underTest.getDescription());
			});

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for setDescription(String)
	 *
	 * @see com.jtspringproject.JtSpringProject.models.Product#setDescription(String)
	 * @author Luciano
	 */
	@Test
	public void testSetDescription() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			Product underTest = new Product();

			// When
			String description = "description"; // UTA: default value
			underTest.setDescription(description);

			// Then - assertions for this instance of Product
			assertAll(() -> {
				assertEquals(0, underTest.getId());
			}, () -> {
				assertNull(underTest.getName());
			}, () -> {
				assertNull(underTest.getImage());
			}, () -> {
				assertNull(underTest.getCategory());
			}, () -> {
				assertEquals(0, underTest.getQuantity());
			}, () -> {
				assertEquals(0, underTest.getPrice());
			}, () -> {
				assertEquals(0, underTest.getWeight());
			}, () -> {
				assertEquals("description", underTest.getDescription());
			});

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for setId(int)
	 *
	 * @see com.jtspringproject.JtSpringProject.models.Product#setId(int)
	 * @author Luciano
	 */
	@Test
	public void testSetId() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			Product underTest = new Product();

			// When
			int id = 0; // UTA: default value
			underTest.setId(id);

			// Then - assertions for this instance of Product
			assertAll(() -> {
				assertEquals(0, underTest.getId());
			}, () -> {
				assertNull(underTest.getName());
			}, () -> {
				assertNull(underTest.getImage());
			}, () -> {
				assertNull(underTest.getCategory());
			}, () -> {
				assertEquals(0, underTest.getQuantity());
			}, () -> {
				assertEquals(0, underTest.getPrice());
			}, () -> {
				assertEquals(0, underTest.getWeight());
			}, () -> {
				assertNull(underTest.getDescription());
			});

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for setImage(String)
	 *
	 * @see com.jtspringproject.JtSpringProject.models.Product#setImage(String)
	 * @author Luciano
	 */
	@Test
	public void testSetImage() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			Product underTest = new Product();

			// When
			String image = "image"; // UTA: default value
			underTest.setImage(image);

			// Then - assertions for this instance of Product
			assertAll(() -> {
				assertEquals(0, underTest.getId());
			}, () -> {
				assertNull(underTest.getName());
			}, () -> {
				assertEquals("image", underTest.getImage());
			}, () -> {
				assertNull(underTest.getCategory());
			}, () -> {
				assertEquals(0, underTest.getQuantity());
			}, () -> {
				assertEquals(0, underTest.getPrice());
			}, () -> {
				assertEquals(0, underTest.getWeight());
			}, () -> {
				assertNull(underTest.getDescription());
			});

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for setName(String)
	 *
	 * @see com.jtspringproject.JtSpringProject.models.Product#setName(String)
	 * @author Luciano
	 */
	@Test
	public void testSetName() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			Product underTest = new Product();

			// When
			String name = "name"; // UTA: default value
			underTest.setName(name);

			// Then - assertions for this instance of Product
			assertAll(() -> {
				assertEquals(0, underTest.getId());
			}, () -> {
				assertEquals("name", underTest.getName());
			}, () -> {
				assertNull(underTest.getImage());
			}, () -> {
				assertNull(underTest.getCategory());
			}, () -> {
				assertEquals(0, underTest.getQuantity());
			}, () -> {
				assertEquals(0, underTest.getPrice());
			}, () -> {
				assertEquals(0, underTest.getWeight());
			}, () -> {
				assertNull(underTest.getDescription());
			});

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for setPrice(int)
	 *
	 * @see com.jtspringproject.JtSpringProject.models.Product#setPrice(int)
	 * @author Luciano
	 */
	@Test
	public void testSetPrice() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			Product underTest = new Product();

			// When
			int price = 0; // UTA: default value
			underTest.setPrice(price);

			// Then - assertions for this instance of Product
			assertAll(() -> {
				assertEquals(0, underTest.getId());
			}, () -> {
				assertNull(underTest.getName());
			}, () -> {
				assertNull(underTest.getImage());
			}, () -> {
				assertNull(underTest.getCategory());
			}, () -> {
				assertEquals(0, underTest.getQuantity());
			}, () -> {
				assertEquals(0, underTest.getPrice());
			}, () -> {
				assertEquals(0, underTest.getWeight());
			}, () -> {
				assertNull(underTest.getDescription());
			});

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for setQuantity(int)
	 *
	 * @see com.jtspringproject.JtSpringProject.models.Product#setQuantity(int)
	 * @author Luciano
	 */
	@Test
	public void testSetQuantity() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			Product underTest = new Product();

			// When
			int quantity = 0; // UTA: default value
			underTest.setQuantity(quantity);

			// Then - assertions for this instance of Product
			assertAll(() -> {
				assertEquals(0, underTest.getId());
			}, () -> {
				assertNull(underTest.getName());
			}, () -> {
				assertNull(underTest.getImage());
			}, () -> {
				assertNull(underTest.getCategory());
			}, () -> {
				assertEquals(0, underTest.getQuantity());
			}, () -> {
				assertEquals(0, underTest.getPrice());
			}, () -> {
				assertEquals(0, underTest.getWeight());
			}, () -> {
				assertNull(underTest.getDescription());
			});

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for setWeight(int)
	 *
	 * @see com.jtspringproject.JtSpringProject.models.Product#setWeight(int)
	 * @author Luciano
	 */
	@Test
	public void testSetWeight() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			Product underTest = new Product();

			// When
			int weight = 0; // UTA: default value
			underTest.setWeight(weight);

			// Then - assertions for this instance of Product
			assertAll(() -> {
				assertEquals(0, underTest.getId());
			}, () -> {
				assertNull(underTest.getName());
			}, () -> {
				assertNull(underTest.getImage());
			}, () -> {
				assertNull(underTest.getCategory());
			}, () -> {
				assertEquals(0, underTest.getQuantity());
			}, () -> {
				assertEquals(0, underTest.getPrice());
			}, () -> {
				assertEquals(0, underTest.getWeight());
			}, () -> {
				assertNull(underTest.getDescription());
			});

		});
	}
}
