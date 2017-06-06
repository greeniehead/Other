import java.util.ArrayList;
public class DatabaseDriver
{
    public static void main(String[] args)
    {
        Post post1 = new Post("Bobby's 40th Birthday", 
        "For my 40th birthday party I am looking for a rock band to play. The event will take place at the House of Blues where there is a stage and a sound system already set up.",
        500, "House of Blues", 7, "Rock", "Bobby Johnson");  
        Post post2 = new Post("George's Wedding", 
        "I am planning the musical entertainment for my best friends wedding. I am looking for a calm jazz piano player at the reception. We have rented sound equipment and the wedding will take place in a mansion.", 
        1500, "La Jolla", 4, "Jazz", "John Smith");
        
        ArrayList<Post> rock = new ArrayList<Post>();
        ArrayList<Post> jazz = new ArrayList<Post>();
        ArrayList<Post> payFiveHundredToThousand = new ArrayList<Post>();
        if(post1.getEventType() == "Rock")
        {
            rock.add( post1 );
        }else if(post1.getEventType() == "Jazz")
        {
            jazz.add( post1 );
        }
        
        if(post2.getEventType() == "Rock")
        {
            rock.add( post2 );
        }else if(post2.getEventType() == "Jazz")
        {
            jazz.add( post2 );
        }
        
        for( Post post : rock)
        {
           System.out.println( "Rock: \n" + post );
        } // end for each
        
        for(Post post : jazz)
        {
            System.out.println( "Jazz: \n" + post );
        }
    }
}
