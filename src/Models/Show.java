package Models;

import java.util.List;
import java.util.ArrayList;
public class Show {
    private String Title;         // The title of the show
    private int RunTime;          // The run time of the show in minutes
    private String StartDate;     // The date that the show starts
    private String EndDate;       // The date that the show ends
    private float TicketPrice;    // Prices for circle, stall and balcony seats

    private List<Performance> performances;    // A list of performances for each show


    public Show(String Title, int RunTime, float TicketPrice, String StartDate, String EndDate) {
        this.Title = Title;
        this.RunTime = RunTime;
        this.TicketPrice = TicketPrice;        // Constructor to create a show with the start and end date, run time, title and ticket prices for the stall, circle and balcony seats
        this.StartDate = StartDate;
        this.EndDate = EndDate;
        this.performances = new ArrayList<> ();
    }


    public String getTitle() {                                       // Gets the title of the show
        return Title;
    }

    public void setTitle(String title) {                           // Sets the title of the show
        Title = title;
    }

    public int getRunTime() {
        return RunTime;                                         // Gets the run time of the show
    }

    public void setRunTime(int runTime) {
        RunTime = runTime;                                      // Sets the run time of the show
    }

    public String getStartDate() {
        return StartDate;                                       // Gets the start date of the show
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;                                 // Sets the start  date of the show
    }

    public String getEndDate() {                              // Gets the end date of the show
        return EndDate;
    }

    public void setEndDate(String endDate) {                 // sets the end date of the show
        EndDate = endDate;
    }

    public float getTicketPrice() {
        return TicketPrice;                                // Gets the ticket prices of the stall, circle and balcony seats
    }

    public List<Performance> getPerformances() {
        return performances;
    }

    public void setTicketPrice(float ticketPrice) {        // Sets the ticket prices of the stall, circle and balcony seats
        TicketPrice = ticketPrice;
    }

    public void setPerformances(List<Performance> performances) {
        this.performances = performances;
    }

public void addPerformance(Performance performance) {performances.add(performance);}

public void removePerformance (Performance performance) {performances.add(performance);}

}
