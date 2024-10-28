package Models;

public class Performance {
    private int Date;             // Date of the performance
    private int Time;             // Time of the performance


    public Performance(int Date, int Time) {
        this.Date = Date;
        this.Time = Time;                        // Constructor to  create a performance with the day and time it is taking place
    }

    public int getDate() {
        return Date;                           // Gets the Date of the performance
    }

    public void setDate(int Date) {
        Date = Date;                        // Sets the date pf the performance
    }

    public int getTime() {                  // Gets the time f the performance
        return Time;
    }

    public void setTime(int Time) {
        Time = Time;                         // Sets the time of the performance
    }
}
