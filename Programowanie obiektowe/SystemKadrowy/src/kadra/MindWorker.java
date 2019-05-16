package kadra;

public class MindWorker extends Person {
	
	private int monthPayment;
	private int bonusPercentage;
	private String phoneNumber;
	private String managerWho;
	private int roomNumber;
	
	public MindWorker(String firstName, String secondName, String dateOfBirth, int monthPayment, int bonusPercentage,
			String phoneNumber, String managerWho, int roomNumber) {
		super(firstName, secondName, dateOfBirth);
		this.monthPayment = monthPayment;
		this.bonusPercentage = bonusPercentage;
		this.phoneNumber = phoneNumber;
		this.managerWho = managerWho;
		this.roomNumber = roomNumber;
	}
	
	int payment(int monthPayment, int bonusPercentage) {
		return (monthPayment + (monthPayment * bonusPercentage / 100));
	}

	public int getMonthPayment() {
		return monthPayment;
	}

	public void setMonthPayment(int monthPayment) {
		this.monthPayment = monthPayment;
	}

	public int getBonusPercentage() {
		return bonusPercentage;
	}

	public void setBonusPercentage(int bonusPercentage) {
		this.bonusPercentage = bonusPercentage;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getManagerWho() {
		return managerWho;
	}

	public void setManagerWho(String managerWho) {
		this.managerWho = managerWho;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	@Override
	public String toString() {
		return "Mind Worker\n" + "First Name: " + super.getFirstName() + "\nSecond Name: " + super.getSecondName() + "\nDate of birth: " + 
				super.getDateOfBirth() + "\nPayment: " + this.getMonthPayment() + "\nBonus percentage: " + this.getBonusPercentage() + 
				"\nPhone number: " + this.getPhoneNumber() + "\nManager: " + this.getManagerWho() + "\nRoom number: " + this.getRoomNumber() + 
				"\nPayment(with bonuses): " + this.payment(monthPayment, bonusPercentage);
	}
	
	
	

}
