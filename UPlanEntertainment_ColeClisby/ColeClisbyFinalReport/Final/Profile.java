import java.util.*;
/**
 * Profile class for a user profile
 * 
 * @Cole Clisby, James Whitehouse, Daniel Chagnon
 * @version 5/18/17
 */
public class Profile
{
    private String firstName;
    private String lastName;
    private String password;
    private String bio;
    private int birthDate;
    private int phoneNumber;
    private ArrayList<Integer> ratings;
    private double averageRating;
    
    public Profile(String firstName, String lastName, String password, String bio, int birthDate,
                   int phoneNumber, ArrayList<Integer> ratings, double averageRating) {
           this.firstName = firstName;
           this.lastName = lastName;
           this.password = password;
           this.bio = bio;
           this.birthDate = birthDate;
           this.phoneNumber = phoneNumber;
           this.ratings = ratings;
           this.averageRating = averageRating;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setBio(String bio) {
        this.bio = bio;
    }
    
    public String getBio() {
        return bio;
    }
    
    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }
    
    public int getBirthDate() {
        return birthDate;
    }
    
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public int getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setRating(ArrayList<Integer> ratings) {
        double sum = 0;
        for ( int i = 0; i < ratings.size(); i++) {
            sum += ratings.get(i);
        }
        
        averageRating = (sum / ratings.size());
    }
    
    public double getRating() {
        return averageRating;
    }
}