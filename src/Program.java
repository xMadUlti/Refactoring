public class Program {
	public static void main(String args[]) {
		String result;
		System.out.println("This is the movie store:");
		Movie aMovie = new Movie("Movie_One", 1);
		Movie bMovie = new Movie("Movie_Two", 2);
		Rental aRental = new Rental(aMovie, 10);
		Rental bRental = new Rental(bMovie, 5);
		Customer customer = new Customer("Alex");
		customer.addRental(aRental);
		customer.addRental(bRental);
		System.out.println("The statement is:");
		result = customer.statement();
		System.out.println(result);
	}
}
