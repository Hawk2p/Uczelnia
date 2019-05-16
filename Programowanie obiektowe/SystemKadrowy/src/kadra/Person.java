package kadra;

public class Person {

	protected String firstName;
	protected String secondName;
	protected String dateOfBirth;
	
	Person(String firstName, String secondName, String dateOfBirth){
		this.firstName = firstName;
		this.secondName = secondName;
		this.dateOfBirth = dateOfBirth;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
