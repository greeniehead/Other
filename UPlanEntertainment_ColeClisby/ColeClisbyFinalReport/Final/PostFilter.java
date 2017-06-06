import java.util.*;
/**
 * Filters posts
 * 
 * @Cole Clisby, James Whitehouse, Daniel Chagnon
 * @version 5/18/17
 */
public class PostFilter
{
    private String location;
    private String entertainmentType;
    private double payRange;
    
    public PostFilter(String location, String entertainmentType, double payRange) {
        this.location = location;
        this.entertainmentType = entertainmentType;
        this.payRange = payRange;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public String getLocation() {
        return location;
    }
    
    public void setEntertainmentType(String entertainmentType) {
        this.entertainmentType = entertainmentType;
    }
    
    public String getEntertainmentType() {
        return entertainmentType;
    }
    
    public void setPayRange(double payRange) {
        this.payRange = payRange;
    }
    
    public double getPayRange() {
        return payRange;
    }
}