import java.util.*;
/**
 * All the details of the user post.
 * 
 * @Cole Clisby, James Whitehouse, Daniel Chagnon
 * @version 5/18/17
 */
public class Post
{
    //sets the values
    private String eventTitle;
    private String description;
    private double eventPay;
    private String eventLocation;
    private int eventTime;
    private String eventType;
    private String name;
    
    public Post(String eventTitle, String description, double eventPay, String eventLocation,
    int eventTime, String eventType, String name) 
    {
        this.eventTitle = eventTitle;
        this.description = description;
        this.eventPay = eventPay;
        this.eventLocation = eventLocation;
        this.eventTime = eventTime;
        this.eventType = eventType;
        this.name = name;
    }
    
    //getters and setters
    public void setEventTitle(String eventTitle) 
    {
        this.eventTitle = eventTitle;
    }
    
    public String getEventTitle() 
    {
        return eventTitle;
    }
    
    public void setDescription(String description) 
    {
        this.description = description;
    }
    
    public String getDescription() 
    {
        return description;
    }
    
    public void setEventPay(double eventPay) 
    {
        this.eventPay = eventPay;
    }
    
    public double getEventPay() {
        return eventPay;
    }
    
    public void setEventLocation(String eventLocation) 
    {
        this.eventLocation = eventLocation;
    }
    
    public String getEventLocation() 
    {
        return eventLocation;
    }
    
    public void setEventTime(int eventTime) 
    {
        this.eventTime = eventTime;
    }
    
    public int getEventTime() 
    {
        return eventTime;
    }
    
    public void setEventType(String eventType) 
    {
        this.eventType = eventType;
    }
    
    public String getEventType() 
    {
        return eventType;
    }
    
    public void setName(String Name) 
    {
        this.name = name;
    }
    
    public String getName() 
    {
        return name;
    }
    
    public String toString()
    {
        String output = "";
        output = "Title: " + eventTitle + "\nDescription: " + description + "\nPay: " + eventPay +
                 "\nLocation: " + eventLocation + "\nTime: " + eventTime + "\nType of Music: " +
                 eventType + "\nName: " + name + "\n";
        return output;
    }
}