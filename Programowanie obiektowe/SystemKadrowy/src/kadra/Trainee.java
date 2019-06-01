package kadra;

public class Trainee extends Person {
	
	private String patron;
	private boolean isScholarship;
	
	public Trainee(String firstName, String secondName, String dateOfBirth, String patron, boolean isScholarship) {
		super(firstName, secondName, dateOfBirth);
		this.patron = patron;
		this.isScholarship = isScholarship;
	}
	
	int scholarship(boolean isScholarship) {
		if(isScholarship == true) return 1150;
		else return 0;
	}

	public String getPatron() {
		return patron;
	}

	public void setPatron(String patron) {
		this.patron = patron;
	}

	public boolean isScholarship() {
		return isScholarship;
	}

	public void setScholarship(boolean isScholarship) {
		this.isScholarship = isScholarship;
	}

	@Override
	public String toString() {
		return "Trainee " + "\nFirst Name: " + super.getFirstName() + "\nSecond Name: " + super.getSecondName() + "\nDate of birth: " + 
				super.getDateOfBirth() + "\nPatron: " + this.getPatron() + "\nScholarship: " + this.scholarship(isScholarship);
	}
	
	
	
	
}
