/**
 * 
 */
package com.jtspringproject.JtSpringProject;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

import javax.sql.DataSource;
import org.junit.jupiter.api.Test;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

/**
 * Parasoft Jtest UTA: Test class for HibernateConfiguration
 *
 * @see com.jtspringproject.JtSpringProject.HibernateConfiguration
 * @author Luciano
 */
public class HibernateConfigurationTest {

	/**
	 * Parasoft Jtest UTA: Test for dataSource()
	 *
	 * @see com.jtspringproject.JtSpringProject.HibernateConfiguration#dataSource()
	 * @author Luciano
	 */
	@Test
	public void testDataSource() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			HibernateConfiguration underTest = new HibernateConfiguration();

			// When
			DataSource result = underTest.dataSource();

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for sessionFactory()
	 *
	 * @see com.jtspringproject.JtSpringProject.HibernateConfiguration#sessionFactory()
	 * @author Luciano
	 */
	@Test
	public void testSessionFactory() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			HibernateConfiguration underTest = new HibernateConfiguration();

			// When
			LocalSessionFactoryBean result = underTest.sessionFactory();

		});
	}

	/**
	 * Parasoft Jtest UTA: Test for transactionManager()
	 *
	 * @see com.jtspringproject.JtSpringProject.HibernateConfiguration#transactionManager()
	 * @author Luciano
	 */
	@Test
	public void testTransactionManager() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			HibernateConfiguration underTest = new HibernateConfiguration();

			// When
			HibernateTransactionManager result = underTest.transactionManager();

		});
	}
}
