package Loan;
 
 
public class Person {
   
    String firstName;
    String surname;
    String pesel;
    String nip;
    String bankAccountNumber;
    String dateOfBirth;
    String gender;
   
   
    public Person() {}
   
    public Person(String firstName, String surname, String pesel, String nip, String bankAccountNumber, String dateOfBirth, String gender){
        this.firstName = firstName;
        this.surname = surname;
        this.pesel = pesel;
        this.nip = nip;
        this.bankAccountNumber = bankAccountNumber;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }
 
    public String getFirstName() {
        return firstName;
    }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    public String getSurname() {
        return surname;
    }
 
    public void setSurname(String surname) {
        this.surname = surname;
    }
 
    public String getPesel() {
        return pesel;
    }
 
    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
 
    public String getNip() {
        return nip;
    }
 
    public void setNip(String nip) {
        this.nip = nip;
    }
 
    public String getBankAccountNumber() {
        return bankAccountNumber;
    }
 
    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }
 
    public String getDateOfBirth() {
        return dateOfBirth;
    }
 
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
 
    public String getGender() {
        return gender;
    }
 
    public void setGender(String gender) {
        this.gender = gender;
    }
}