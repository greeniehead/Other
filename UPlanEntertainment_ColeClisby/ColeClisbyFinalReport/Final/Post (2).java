import java.util.*;
/**
 * All the details of the user post.
 * 
 * @Cole Clisby, James Whitehouse, Daniel Chagnon
 * @version 5/18/17
 */
public class Post
{
    private String eventTitle;
    private String description;
    private double eventPay;
    private String eventLocation;
    private int eventTime;
    
    public Post(String eventTitle, String description, double eventPay, String eventLocation, int eventTime) {
        this.eventTitle = eventTitle;
        this.description = description;
        this.eventPay = eventPay;
        this.eventLocation = eventLocation;
        this.eventTime = eventTime;
    }
    
    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }
    
    public String getEventTitle() {
        return eventTitle;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setEventPay(double eventPay) {
        this.eventPay = eventPay;
    }
    
    public double getEventPay() {
        return eventPay;
    }
    
    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }
    
    public String getEventLocation() {
        return eventLocation;
    }
    
    public void setEventTime(int eventTime) {
        this.eventTime = eventTime;
    }
    
    public int getEventTime() {
        return eventTime;
    }
}