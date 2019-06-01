package kadra;

public class PhysicalWorker extends Person {

	private int moneyPerHour;
	private int hoursWorked;
	private int hoursOverworked;
	private String managerWho;
	private String skills;
	
	PhysicalWorker(String firstName, String secondName, String dateOfBirth, int moneyPerHour, int hoursWorked, int hoursOverworked, String managerWho, 
			String skills){
		super(firstName,secondName,dateOfBirth);
		this.moneyPerHour = moneyPerHour;
		this.hoursWorked = hoursWorked;
		this.hoursOverworked = hoursOverworked;
		this.managerWho = managerWho;
		this.skills = skills;
	}
	
	int payment(int moneyPerHour, int hoursWorked, int hoursOverworked) {
		int salary = (int) ((moneyPerHour * hoursWorked) + (1.5 * moneyPerHour * hoursOverworked));
		return salary;
	}

	
	
	public int getMoneyPerHour() {
		return moneyPerHour;
	}

	public void setMoneyPerHour(int moneyPerHour) {
		this.moneyPerHour = moneyPerHour;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public int getHoursOverworked() {
		return hoursOverworked;
	}

	public void setHoursOverworked(int hoursOverworked) {
		this.hoursOverworked = hoursOverworked;
	}

	public String getManagerWho() {
		return managerWho;
	}

	public void setManagerWho(String managerWho) {
		this.managerWho = managerWho;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Physical Worker\n" + "First Name: " + super.getFirstName() + "\nSecond Name: " + super.getSecondName() + "\nDate of birth: " + 
					super.getDateOfBirth() + "\nMoney per hour: " + this.getMoneyPerHour() + "\nHours worked: " + this.getHoursWorked() + 
					"\nHours overworked: " + this.getHoursOverworked() + "\nManager: " + this.getManagerWho() + "\nSkills: " + this.skills + 
					"\nPayment(with bonuses): " + this.payment(moneyPerHour, hoursWorked, hoursOverworked);
	}
	
	
	
}
