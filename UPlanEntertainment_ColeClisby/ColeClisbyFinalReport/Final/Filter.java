import java.util.ArrayList;
public class Filter extends Post
{
    //sets the arrayLists
    private ArrayList<Post> payZeroToFifty;
    private ArrayList<Post> payFiftyToHundred;
    private ArrayList<Post> payHundredToTwoHundred;
    private ArrayList<Post> payTwoHundredToFiveHundred;
    private ArrayList<Post> payFiveHundredToThousand;
    private ArrayList<Post> payThousandPlus;
    private ArrayList<Post> rock;
    private ArrayList<Post> rap;
    private ArrayList<Post> blues;
    private ArrayList<Post> alternative;
    private ArrayList<Post> electronic;
    private ArrayList<Post> classical;
    private ArrayList<Post> jazz;
    private ArrayList<Post> soul;
    private ArrayList<Post> singer;
    
    //constructor for ArrayLists
    public Filter(String eventTitle, String description, double eventPay, String eventLocation,
    int eventTime, String eventType, String name, ArrayList<Post> payZeroToFifty, ArrayList<Post> payFiftyToHundred, 
    ArrayList<Post> payHundredToTwoHundred, ArrayList<Post> payTwoHundredToFiveHundred, 
    ArrayList<Post> payFiveHundredToThousand, ArrayList<Post> payThousandPlus,
    ArrayList<Post> rock, ArrayList<Post> blues, ArrayList<Post> alternative, 
    ArrayList<Post> electronic, ArrayList<Post> classical, ArrayList<Post> jazz, 
    ArrayList<Post> soul, ArrayList<Post> singer)
    {
        super(eventTitle, description, eventPay, eventLocation, eventTime, eventType, name);
        this.payZeroToFifty = new ArrayList<Post>();
        this.payFiftyToHundred = new ArrayList<Post>();
        this.payHundredToTwoHundred = new ArrayList<Post>();
        this.payTwoHundredToFiveHundred = new ArrayList<Post>();
        this.payFiveHundredToThousand = new ArrayList<Post>();
        this.payThousandPlus = new ArrayList<Post>();
        this.rock = new ArrayList<Post>();
        this.rap = new ArrayList<Post>();
        this.blues = new ArrayList<Post>();
        this.alternative = new ArrayList<Post>();
        this.electronic = new ArrayList<Post>();
        this.classical = new ArrayList<Post>();
        this.jazz = new ArrayList<Post>();
        this.soul = new ArrayList<Post>();
        this.singer = new ArrayList<Post>();
    }
}
