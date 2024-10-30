package Models;

import java.util.List;
import java.util.ArrayList;
public class Bookings {

    private int BookingID;           // Unique code identifying each booking
    private List<Customer> customers;  // List of customers that are on the booking


    public  Bookings (int BookingID){
        this.BookingID = BookingID;
        this.customers = new ArrayList<>();
    }

    public int getBookingID() {
        return BookingID;
    }

    public void setBookingID(int bookingID) {
        BookingID = bookingID;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public void addCustomer(Customer customer) {customers.add(customer);}

    public void removeCustomer(Customer customer) {customers.remove(customer);}
}
