public class Character
{
    //delacares all important items and location of the character
    public static int location;
    public int resetGame;
    private boolean coffee;
    private boolean book;
    private boolean key;
    public Character()
    {
        location = 0;
        resetGame = 1;
        book = false;
        coffee = false;
        key = false;
    }
    //changes the reset num to 0 which ends the program
    public void resetGame()
    {
        resetGame -= 1;
    }
    //returns the location of the player
    public static int getLocation()
    {
        return location;
    }
    //changes the players location to the one it wants to move to
    public static void setLocation(int desiredLocation)
    {
        location = desiredLocation;
    }
    //changes the coffe item to true
    public void setItemCoffee()
    {
       coffee = true;
    }
    //changes the book item to true
    public void setItemBook()
    {
       book = true;
    }
    //changes the key item to true
    public void setItemKey()
    {
       key = true;
    }
    //returns book
    public boolean getBook()
    {
        return book;
    }
    //returns coffee
    public boolean getCoffee()
    {
        return coffee;
    }
    //returns key
    public boolean getKey()
    {
        return key;
    }
    //changes the coffee item to false
    public void setItemCoffeeF()
    {
       coffee = false;
    }
    //changes the book item to false
    public void setItemBookF()
    {
       book = false;
    }
    //changes the book item to false
    public void setItemKeyF()
    {
       key = false;
    }
}
