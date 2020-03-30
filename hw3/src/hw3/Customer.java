package three_три;

import java.time.LocalTime;

/**
 * Created by Куприенков on 30.03.2020.
 */
public class Customer {
    private static int id;
    private static int count;
    private String firstName;
    private String lastName;
    private String middleName;
    private String addres;
    private String bankAccount;
    private int cardNumber;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankNumber) {
        this.bankAccount = bankAccount;
    }


    public Customer(String firstName, String lastName, String middleName, String addres, int cardNumber, String bankAccount){
        count++;
        this.id = count;
        this.lastName = lastName;
        this.addres = addres;
        this.cardNumber = cardNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.bankAccount = bankAccount;
    }

    public String toString(){
        return "Имя: " + firstName + "\nФамилия: " + middleName+ "\nАдрес: " + addres + "\n" + "Номер карты: " + cardNumber + "\n";
    }
}
