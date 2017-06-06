import java.util.*;
/**
 * This is where the exchange of information will happen
 * 
 * @Cole Clisby, James Whitehouse, Daniel Chagnon
 * @5/19/17
 */
public class InfoExchange
{
    private String email;
    private int phoneNumber;
    
    public InfoExchange(String email, int phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public int getPhoneNumber() {
        return phoneNumber;
    }
}