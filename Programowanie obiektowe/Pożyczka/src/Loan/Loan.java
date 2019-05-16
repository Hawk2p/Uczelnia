package Loan;
 
 
public class Loan {
   
    static void checkData(String firstName, String surname, String pesel, String nip, String bankAccountNumber, String dateOfBirth, String gender) {
        Check checkData = new Check();
        if(!checkData.checkName(firstName) || !checkData.checkName(surname)) System.out.println("Bledne imiê lub nazwisko");
        if(!checkData.checkPesel(pesel)) System.out.println("Bledny pesel");
        if(!checkData.checkNip(nip)) System.out.println("Bledny nip");
        if(!checkData.checkBankAccount(bankAccountNumber)) System.out.println("Zly numer konta");
        if(!checkData.checkBirth(dateOfBirth,pesel)) System.out.println("Data urodzenia i pesel nie zgadzaja sie");
        if(!checkData.checkSex(gender, pesel)) System.out.println("Plci sie nie zgadzaja");
    }
   
   
    public static void main(String[] args) {
        Person kowalski = new Person("Blazej", "Kowalski", "98071104493", "7251801126", "96160011431847691280000002", "11-07-1998", "M");
        checkData(kowalski.firstName, kowalski.surname, kowalski.pesel, kowalski.nip, kowalski.bankAccountNumber, kowalski.dateOfBirth, kowalski.gender);
}
}