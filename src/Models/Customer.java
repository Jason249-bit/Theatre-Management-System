package Models;

public class Customer {
    private int PhoneNumber;  // Customers phone number
    private String Name;      // Customers full name
    private String Email;     // Customers E-mail address



    public Customer(String Name, int PhoneNumber, String Email) {
        this.Name = Name;                                                   // Constructor to create a customer with their contact info and name
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
    }


    public int getPhoneNumber() {
        return PhoneNumber;                    // Gets the phone number of the customer
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;                    // Sets the phone number of the customer
    }

    public String getName() {                 // Gets the name of the customer
        return Name;
    }

    public void setName(String name) {
        Name = name;                         // Sets the name of the customer
    }

    public String getEmail() {
        return Email;                         // Gets the E-mail of the customer
    }

    public void setEmail(String email) {
        Email = email;                       // Sets the E-mail of the customer
    }
}