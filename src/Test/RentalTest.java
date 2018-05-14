package Test;

import static org.junit.jupiter.api.Assertions.*;
import Main.*;

import org.junit.jupiter.api.Test;

class RentalTest {

	@Test
	void testGetDaysRented() {
		int daysRented = 2;

		Movie movie = new Movie("", Movie.NEW_RELEASE);
		Rental rental = new Rental(movie, daysRented);

		assertEquals(daysRented, rental.getDaysRented());
	}

	@Test
	void testRentalConstructor() {
		Movie movie = new Movie("Avengers", Movie.NEW_RELEASE);
		Rental rental = new Rental(movie, 0);

		assertEquals(movie, rental.getMovie());
	}

}
