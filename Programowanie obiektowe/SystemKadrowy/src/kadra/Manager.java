package kadra;

public class Manager extends Person {

	private int monthPayment;
	private int	bonusPercentage;
	private int managerBonus;
	private String phoneNumber;
	private String roomNumber;
	private String departmentManage;
	
	public Manager(String firstName, String secondName, String dateOfBirth, int monthPayment, int bonusPercentage,
			int managerBonus, String phoneNumber, String roomNumber, String departmentManage) {
		super(firstName, secondName, dateOfBirth);
		this.monthPayment = monthPayment;
		this.bonusPercentage = bonusPercentage;
		this.managerBonus = managerBonus;
		this.phoneNumber = phoneNumber;
		this.roomNumber = roomNumber;
		this.departmentManage = departmentManage;
	}
	
	int payment(int monthPayment, int bonusPercentage, int managerBonus) {
		return (monthPayment + (monthPayment * bonusPercentage / 100) + managerBonus);
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

	public int getManagerBonus() {
		return managerBonus;
	}

	public void setManagerBonus(int managerBonus) {
		this.managerBonus = managerBonus;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getDepartmentManage() {
		return departmentManage;
	}

	public void setDepartmentManage(String departmentManage) {
		this.departmentManage = departmentManage;
	}

	@Override
	public String toString() {
		return "Manager\n" + "First Name: " + super.getFirstName() + "\nSecond Name: " + super.getSecondName() + "\nDate of birth: " + 
				super.getDateOfBirth() + "\nPayment: " + this.getMonthPayment() + "\nBonus percentage: " + this.getBonusPercentage() +
				"\nManager Bonus: " + this.getManagerBonus() + "\nPhone number: " + this.getPhoneNumber() +"\nRoom number: " + 
				this.getRoomNumber() + "\nDepartment manage: " + this.getDepartmentManage() + "\nPayment(with bonuses): " +
				 this.payment(monthPayment, bonusPercentage, managerBonus);
	}
	
	
	
}
