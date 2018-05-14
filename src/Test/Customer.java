package Test;

import static org.junit.jupiter.api.Assertions.*;
import Main.Customer;
import Main.Rental;
import Main.Movie;

import org.junit.jupiter.api.Test;

class CustomerTest {

	@Test
	void testAddRental() {
		Customer customer = new Customer("Alex");
		customer.addRental(new Rental(new Movie("Movie", Movie.NEW_RELEASE), 0));

		String statement = customer.statement();

		assertEquals(5, statement.split("\n").length);

	}

	@Test
	void testGetName() {
		String name = "Alex";
		Customer customer = new Customer(name);

		assertEquals(name, customer.getName());
	}

	@Test
	void testEmptyRental() {
		Customer customer = new Customer("Alex");
		String statement = customer.statement();

		assertEquals(4, statement.split("\n").length);
	}

}
