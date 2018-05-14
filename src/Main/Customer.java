package Main;
import java.util.Enumeration;
import java.util.Vector;

class Customer {
	private String name;
	private Vector _rentals = new Vector();

	public Customer(String name) {
		this.name = name;
	}

	public void addRental(Rental arg) {
		_rentals.addElement(arg);
	}

	public String getName() {
		return name;
	}

	private double getTotalCharge() {
		double result = 0;
		Enumeration rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getCharge();
		}
		return result;
	}

	private int getTotalFrequentRenterPoints() {
		int result = 0;
		Enumeration rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getFrequentRenterPoints();
		}
		return result;
	}

	public String statement() {
		Enumeration rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
		}
		result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
		return result;
	}
}