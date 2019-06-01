package kadra;

public class ChairMan extends Person {
	
	private int monthPayment;
	private String assistant;
	private int numberOfMeetings;
	
	public ChairMan(String firstName, String secondName, String dateOfBirth, int monthPayment, String assistant,
			int numberOfMeetings) {
		super(firstName, secondName, dateOfBirth);
		this.monthPayment = monthPayment;
		this.assistant = assistant;
		this.numberOfMeetings = numberOfMeetings;
	}
	
	int payment(int monthPayment, int numberOfMeetings) {
		return (monthPayment + (numberOfMeetings * 100));
	}

	public int getMonthPayment() {
		return monthPayment;
	}

	public void setMonthPayment(int monthPayment) {
		this.monthPayment = monthPayment;
	}

	public String getAssistant() {
		return assistant;
	}

	public void setAssistant(String assistant) {
		this.assistant = assistant;
	}

	public int getNumberOfMeetings() {
		return numberOfMeetings;
	}

	public void setNumberOfMeetings(int numberOfMeetings) {
		this.numberOfMeetings = numberOfMeetings;
	}

	@Override
	public String toString() {
		return "Chair man " + "\nFirst name: " + super.getFirstName() + "\nSecond name: " + super.getSecondName() + "\nDate of birth: " +
					super.getDateOfBirth() + "\nPayment: " + this.getMonthPayment() + "\nAssistant: " + this.getAssistant() +
					"\nNumber of meetings: " + this.getNumberOfMeetings() + "\nPayment(with bonuses): " + this.payment(monthPayment, numberOfMeetings);
				}
}
