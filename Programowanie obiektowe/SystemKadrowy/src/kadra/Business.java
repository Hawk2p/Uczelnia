package kadra;

public class Business {

	public static void main(String[] args) {
		PhysicalWorker employeeOne = new PhysicalWorker("Tadeusz","Norek","12-08-1956",13,170,20,"Danuta Norek","Umie jezdzic koparka");
		MindWorker employeeTwo = new MindWorker("Karol","Krawczyk","22-08-1961",2300,15,"637-342-856","Alina Krawczyk",5);
		Manager employeeThree = new Manager("Alina","Krawczyk","19-03-1965",2800,10,200,"836-053-472","5","Marketing");
		ChairMan employeeFour = new ChairMan("Michal","Zebrowski","17-06-1972",3500,"Walter Kowalski",4);
		Trainee employeeFive = new Trainee("Zbigniew","Nowak","21-05-1995","Karol Krawczyk",true);
		
		
		System.out.println(employeeOne + "\n\n");
		System.out.println(employeeTwo + "\n\n");
		System.out.println(employeeThree + "\n\n");
		System.out.println(employeeFour + "\n\n");
		System.out.println(employeeFive + "\n\n");
	}

}
