package Loan;
 
import java.util.regex.*;
 
 
 
public class Check {
   
    Check() {}
   
    boolean checkName(String firstName) {
        if(firstName == null || firstName.length() < 2 || (!checkPattern(firstName,"^[a-zA-Z]*$")))
            return false;
        else return true;
    }
   
    boolean checkPesel(String pesel) {
        char[] myPeselArray;
        myPeselArray = pesel.toCharArray();
        int charToInt = 48;
        if(pesel.length() == 11) {
            int controlSum = 9 * ((int)myPeselArray[0] - charToInt) + 7 * ((int)myPeselArray[1] - charToInt) + 3 * ((int)myPeselArray[2] - charToInt) + 1 * ((int)myPeselArray[3] - charToInt)
                    + 9 * ((int)myPeselArray[4] - charToInt)+ 7 * ((int)myPeselArray[5] - charToInt) + 3 * ((int)myPeselArray[6] - charToInt)
                    + 1 * ((int)myPeselArray[7] - charToInt)+ 9 * ((int)myPeselArray[8] - charToInt) + 7 * ((int)myPeselArray[9] - charToInt);
            controlSum %= 10;
            if(controlSum == ((int)myPeselArray[10] - charToInt))
                return true;
            else return false;
        }
        else return false;
       
    }
   
    boolean checkNip(String nip) {
        char[] myNipArray;
        myNipArray = nip.toCharArray();
        int charToInt = 48;
        if(nip.length() == 10) {
            int controlSum = 6 * ((int)myNipArray[0] - charToInt) + 5 * ((int)myNipArray[1] - charToInt) + 7 * ((int)myNipArray[2] - charToInt) + 2 * ((int)myNipArray[3] - charToInt)
                    + 3 * ((int)myNipArray[4] - charToInt) + 4 * ((int)myNipArray[5] - charToInt) + 5 * ((int)myNipArray[6] - charToInt)
                    + 6 * ((int)myNipArray[7] - charToInt) + 7 * ((int)myNipArray[8] - charToInt);
            controlSum %= 11;
            if(controlSum == ((int)myNipArray[9] - charToInt))
                return true;
            else return false;
        }
        else return false;
    }
   
   
    boolean checkBankAccount(String bankAccountNumber) {
        char[] myBankAccount;
        myBankAccount = bankAccountNumber.toCharArray();
        int charToInt = 48;
        if(bankAccountNumber.length() == 26) {
            int controlSum = 3 * ((int)myBankAccount[2] - charToInt) + 9 * ((int)myBankAccount[3] - charToInt) + 7 * ((int)myBankAccount[4] - charToInt)
                    + 1 * ((int)myBankAccount[5] - charToInt) + 3 * ((int)myBankAccount[6] - charToInt)
                    + 9 * ((int)myBankAccount[7] - charToInt) + 7 * ((int)myBankAccount[8] - charToInt);
            controlSum %= 10;
            controlSum = 10 - controlSum;
            controlSum %= 10;
            if(controlSum == ((int)myBankAccount[9] - charToInt))
                return true;
            else return false;
        }
        else return false;
       
    }
   
    boolean checkBirth(String dateOfBirth, String pesel) {
        char[] myDateOfBirth;
        char[] peselBirth;
        myDateOfBirth = dateOfBirth.toCharArray();
        peselBirth = pesel.toCharArray();
        int charToInt = 48;
        int peselMonth = ((int)peselBirth[2] - charToInt)*10 + ((int)peselBirth[3] - charToInt);
        int peselYear = ((int)peselBirth[0] - charToInt)*10 + ((int)peselBirth[1] - charToInt);
        int peselDay = ((int)peselBirth[4] - charToInt)*10 + ((int)peselBirth[5] - charToInt);
       
        if(peselMonth > 0 && peselMonth < 13) peselYear += 1900;
        else if(peselMonth > 20 && peselMonth < 33) peselYear += 2000;
       
        int year = ((int)myDateOfBirth[6] - charToInt)*1000 + ((int)myDateOfBirth[7] - charToInt)*100 + ((int)myDateOfBirth[8] - charToInt)*10 + ((int)myDateOfBirth[9] - charToInt);
        int month = ((int)myDateOfBirth[3] - charToInt)*10 + ((int)myDateOfBirth[4] - charToInt);
        int day = ((int)myDateOfBirth[0] - charToInt)*10 + ((int)myDateOfBirth[1] - charToInt);
       
        if(peselYear == year && peselMonth == month && peselDay == day) return true;
        else return false;
       
    }
   
    String retSex(String pesel) {
        int genderNumber = (int)pesel.charAt(9);
        if(genderNumber %2 == 1) return "M";
        else return "K";
    }
   
    boolean checkSex(String gender, String pesel) {
        if(retSex(pesel) == "M" || retSex(pesel) == "K") {
            if(gender == "M" || gender == "K") return true;
            else return false;
        }
        return false;
    }
   
   
    boolean checkPattern(String toCheck, String patternCheck) {
        Pattern pattern = Pattern.compile(patternCheck);
        Matcher matcher = pattern.matcher(toCheck);
       
        if(!matcher.matches())
            return false;
        else
            return true;
    }
}